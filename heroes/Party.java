/*
 * file: Party.java
 */
package hw4.heroes;

import hw4.game.Team;
import java.util.ArrayList;

/**
 * Hero Party
 * @author dongyu wu
 * @author chenghui zhu
 */
public interface Party {
    /**
     * add hero to the end of the collection
     * @param hero a hero to be added
     */
    void addHero(Hero hero);

    /**
     * remove hero at the beginning of the collection
     * and return this hero
     * @return hero at the beginning
     */
    Hero removeHero();

    /**
     * get the number of heroes in the Party
     * @return the number of heroes
     */
    int numHeroes();

    /**
     * get the team which the party belong to
     * @return the team
     */
    Team getTeam();

    /**
     * get all the hero in the party
     * @return the hero collection
     */
    ArrayList<Hero> getHeroes();
}
