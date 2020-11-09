/*
 * file: Hero.java
 */
package hw4.heroes;

import hw4.heroes.Heroes.Role;
import hw4.game.Team;

/**
 * An abstract class for all hero roles
 *
 * @author dongyu wu
 * @author chenghui zhu
 */
public abstract class Hero {
    /** hit points of the hero*/
    protected int hit_points;

    /** name of the hero*/
    protected String name;

    /** boolean value indicates if the hero is fallen*/
    private boolean isFallen;

    /**
     * Creates a hero with given name and hit points
     *
     * @param s name of the hero
     * @param hp hit points
     */
    protected Hero(String s, int hp) {
        this.name = s;
        this.hit_points = hp;
        this.isFallen = false;
    }

    /**
     * Factory method creates a new hero with specific role and affiliated team
     * @param role role of the desired hero
     * @param team team the desired hero is affiliated to
     * @param party party the hero is belong
     * @return the new hero
     */
    public static Hero createHero(Role role, Team team, Party party) {
        if (role == Role.TANK) {
            return new Tank(team);
        } else if (role == Role.BERSERKER) {
            return new Berserker(team);
        } else {
            return new Healer(team,party);
        }
    }

    /**
     * get the name of the hero
     * @return hero name in a string
     */
    public String getName(){
        return name;
    }

    /**
     * check if the hero is fallen
     * @return boolean that indicated the hero is fallen or not
     */
    public boolean hasFallen() {
        if (isFallen) System.out.printf("%s has fallen!\n",name);
        return isFallen;
    }

    /**
     * The takeDamage method will decrease the hero's hit points
     * when the hero is attacked. If the damage is greater than
     * the remain hit points, it will mark the hero as fallen
     * @param damage the integer of the damage the hero received
     */
    public void takeDamage(int damage) {
        System.out.printf("%s takes %d damage\n",getName(),damage);
        if(damage >= hit_points ) {
            hit_points = 0;
            isFallen = true;
        } else {
            hit_points = hit_points - damage;
        }
    }

    /**
     * get the role of the hero
     * @return the role of the hero
     */
    public abstract Role getRole();

    /**
     * heal the hero will restore its hit points
     * @param heal a integer represents the healing amount
     */
    public abstract void heal(int heal);

    /**
     * attack another hero will take damage on it
     * @param hero the opponent hero
     */
    public abstract void attack(Hero hero);
}
