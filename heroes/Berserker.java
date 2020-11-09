/*
 * file: Berserker.java
 */
package hw4.heroes;

import hw4.game.Team;

/**
 * The concrete hero class of Berserker. He/she has high offensive damage
 * but weak defensive capabilities
 * @author dongyu wu
 * @author chenghui zhu
 */
public class Berserker extends Hero {
<<<<<<< HEAD
    /** The initial(max) HP of Berserker*/
    private static final int HIT_POINTS = 30;

    /** The offensive damage of Berserker*/
    private static final int ATTACK_DAMAGE = 20;

    /** The enum role of Berserker*/
    private static final Heroes.Role ROLE = Heroes.Role.BERSERKER;

    /**
     * The constructor of concrete Berserker class, extends the
     * abstract super class Hero
     * @param team The enum team of this character
=======
    /** Berserker's max hit points*/
    private static final int HIT_POINTS = 30;

    /** Berserker's attack damage*/
    private static final int ATTACK_DAMAGE = 20;

    /** Berserker's role*/
    private static final Heroes.Role ROLE = Heroes.Role.BERSERKER;

    /**
     * Create a berserker
     * @param team berserker's team
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    protected Berserker(Team team) {
        super(Heroes.getName(team, ROLE), HIT_POINTS);
    }

    /**
<<<<<<< HEAD
     * Reveal the set enum role of this character
     * @return the enum role of this character
=======
     * Get berserker's role
     * @return role
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    @Override
    public Heroes.Role getRole() {
        return ROLE;
    }

    /**
<<<<<<< HEAD
     * The proactive attack action. This character will cause a certain damage
     * depended on its damage amount to another character
     * @param hero The character who will take this attack
=======
     * attack opponent
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
     * Get heal to restore hit points
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
     * Get detail about berserker
     * @return a string with detail info
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    @Override
    public String toString() {
        return name + ", " + ROLE + ", " + hit_points + "/" + HIT_POINTS;
    }
}
