/*
 * file: Healer.java
 */
package hw4.heroes;

import hw4.game.Team;
import java.util.ArrayList;

/**
 * The concrete hero class of Healer. He/she has the ability to
 * restore allies health during combat
 * @author dongyu wu
 * @author chenghui zhu
 */
public class Healer extends Hero {
<<<<<<< HEAD
    /** The initial(max) HP of Healer*/
    private static final int HIT_POINTS = 35;

    /** The offensive damage of Healer*/
    private static final int ATTACK_DAMAGE = 10;

    /** The healing amount of Healer*/
    private static final int HEAL_AMOUNT = 10;

    /** The enum role of Healer*/
    private static final Heroes.Role ROLE = Heroes.Role.HEALER;

    /** The enum party of Healer's allies*/
    private Party party;

    /**
     * The constructor of concrete Healer class, extends the
     * abstract super class Hero, and set the allies party
     * @param team The enum team of this character
     * @param party The enum party of this character
=======
    /** Healer's max hit points*/
    private static final int HIT_POINTS = 35;

    /** Healer's attack damage*/
    private static final int ATTACK_DAMAGE = 10;

    /** Healer's heal amount */
    private static final int HEAL_AMOUNT = 10;

    /** Healer's role*/
    private static final Heroes.Role ROLE = Heroes.Role.HEALER;

    /** Healer's ally party*/
    private Party party;

    /**
     * Create a healer with its ally party
     * @param team healer's team
     * @param party healer's party
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    protected Healer(Team team, Party party) {
        super(Heroes.getName(team, ROLE), HIT_POINTS);
        this.party = party;
    }

    /**
     * heal all the heroes in ally party
     */
    public void takeHeal() {
        this.heal(HEAL_AMOUNT);
        ArrayList<Hero> heroList = party.getHeroes();
        for (int i =0; i<heroList.size();i++) {
            heroList.get(i).heal(HEAL_AMOUNT);
        }
    }

    /**
<<<<<<< HEAD
     * Reveal the set enum role of this character
     * @return the enum role of this character
=======
     * Get healer's role
     *
     * @return healer's role
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    @Override
    public Heroes.Role getRole() {
        return ROLE;
    }

    /**
<<<<<<< HEAD
     * The proactive attack action. This character will first heal all heroes
     * in ally party, then cause a certain damage depended on
     * its damage amount to another character
     * @param hero The character who will take this attack
=======
     * heals all allies first then take attack
     * @param hero opponent hero
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    @Override
    public void attack(Hero hero) {
        takeHeal();
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
     * Get details about the healer
     * @return a string with detail info
>>>>>>> 12d1307ba262f43ef85e0f61d77a3c6dbcf4c68d
     */
    @Override
    public String toString() {
        return name + ", "+ROLE+", " + hit_points + "/" + HIT_POINTS;
    }
}
