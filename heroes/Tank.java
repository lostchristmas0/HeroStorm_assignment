/*
 * file: Tank.java
 */
package hw4.heroes;

import hw4.game.Team;

/**
 * The concrete hero class of Tank. He/she has the ability to absorbing
 * large amounts of damage
 * @author dongyu wu
 * @author chenghui zhu
 */
public class Tank extends Hero {
<<<<<<< HEAD
    /** The initial(max) HP of Tank*/
    private static final int HIT_POINTS = 40;

    /** The offensive damage of Healer*/
    private static final int ATTACK_DAMAGE = 15;

    /** The amount of damage can be deflects with*/
    private static final double DEFENSE = 0.1;

    /** The enum role of Tank*/
    private static final Heroes.Role ROLE = Heroes.Role.TANK;

    /**
     * The constructor of concrete Berserker class, extends the
     * abstract super class Hero
     * @param team The enum team of this character
=======
    /** Tank's max hit points*/
    private static final int HIT_POINTS = 40;

    /** Tank's attack damage*/
    private static final int ATTACK_DAMAGE = 15;

    /** Tank's defense ratio*/
    private static final double DEFENSE = 0.1;

    /** Tank's role*/
    private static final Heroes.Role ROLE = Heroes.Role.TANK;

    /**
     * create a tank
     * @param team tank's team
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    protected Tank(Team team) {
        super(Heroes.getName(team, ROLE), HIT_POINTS);
    }

    /**
<<<<<<< HEAD
     * Reveal the set enum role of this character
     * @return the enum role of this character
=======
     * get tank's role
     * @return tank's role
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    @Override
    public Heroes.Role getRole() {
        return ROLE;
    }

    /**
     * deflects some damage when attacked
<<<<<<< HEAD
     * @param damage the initail giving damage amount
=======
     * @param damage integer, damage amount
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    @Override
    public void takeDamage(int damage) {
        damage =  (int) Math.floor(damage - damage * DEFENSE);
        super.takeDamage(damage);
    }

    /**
<<<<<<< HEAD
     * The proactive attack action. This character will cause a certain damage
     * depended on its damage amount to another character
     * @param hero The character who will take this attack
=======
     * attack the opponent hero
     * @param hero opponent hero
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    @Override
    public void attack(Hero hero) {
        hero.takeDamage(ATTACK_DAMAGE);
    }

    /**
<<<<<<< HEAD
     * The passive heal action. This character's HP will increased by a
     * certain amount of healing, but no more than its initial value
     * @param heal The received healing amount
=======
     * restore hit points
     * @param heal heal amount
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    @Override
    public void heal(int heal) {
        System.out.printf("%s heals %d points\n",name,heal);
        if (heal + hit_points > HIT_POINTS) {
            hit_points = HIT_POINTS;
        } else {
            hit_points += heal;
        }
    }

    /**
<<<<<<< HEAD
     * Reveal the current status of this character
     * @return a string containing the current status of this character
=======
     * get detail about tank
      * @return a string with detail info
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    @Override
    public String toString() {
        return name + ", " + ROLE + ", " + hit_points + "/" + HIT_POINTS;
    }
}
