/*
 * file: HeroParty.java
 */
package hw4.game;

import hw4.heroes.Hero;
import hw4.heroes.Heroes;
import hw4.heroes.Party;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * HeroParty is FIFO collection which holds all undefeated heroes
 *
 * @author dongyu wu
 * @author chenghui zhu
 */
public class HeroParty implements Party {
    /** team the party affiliated to*/
    private Team team;

    /** all the heroes in the party*/
    private ArrayList<Hero> heroes;

    /**
     * The constructor creates the party with given team,
     * adds three hero roles into the party and shuffle
     * it with the random seed
     *
     * @param team the given team the party is affiliated to
     * @param seed the random seed to shuffle the party
     */
    public HeroParty(Team team, int seed) {
        this.team = team;
        this.heroes = new ArrayList<Hero>();
        addHero(Hero.createHero(Heroes.Role.BERSERKER,team,this));
        addHero(Hero.createHero(Heroes.Role.HEALER,team,this));
        addHero(Hero.createHero(Heroes.Role.TANK,team,this));
        Collections.shuffle(heroes, new Random(seed));
    }

    /**
     * add a new un-fallen hero to the party
     * @param hero a hero to be added
     */
    public void addHero(Hero hero) {
        if (!hero.hasFallen()) heroes.add(hero);
    }

    /**
     * remove hero in the front of the party
     * @return the hero in the front
     */
    public Hero removeHero() {
        Hero hero = heroes.get(0);
        heroes.remove(0);
        return hero;
    }

    /**
     * get the number of heroes in the party
     * @return the number of heroes
     */
    public int numHeroes() {
        return heroes.size();
    }

    /**
     * get the team the party is affiliated to
     * @return the team
     */
    public Team getTeam() {
        return team;
    }

    /**
     * get all the heroes in the party
     * @return the heroes collection
     */
    public ArrayList<Hero> getHeroes() {
        return heroes;
    }

    /**
     * get details about all the heroes
     * @return the string with all heroes' info
     */
    @Override
    public String toString() {
        String s = "";
        for (Hero h : heroes) {
            s = s + h.toString() + "\n";
        }
        return s;
    }
}
