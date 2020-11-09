/*
 * file: TestParty.java
 */

package hw4.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import hw4.game.Team;
import hw4.heroes.Hero;
import hw4.heroes.Heroes.Role;
import hw4.heroes.Party;

/**
 * This is a party used only for testing.  It is incomplete in that it only
 * creates the party of heroes (without shuffling) and it gives access to the
 * collection of members.
 *
 * @author RIT CS
 */
public class TestParty implements Party {
    private ArrayList<Hero> heroes;
    private Team team;

    public TestParty(Team team) {
        this.team = team;
        this.heroes = new ArrayList<>();
        this.heroes.add(Hero.createHero(Role.BERSERKER, team, this));
        this.heroes.add(Hero.createHero(Role.HEALER, team, this));
        this.heroes.add(Hero.createHero(Role.TANK, team, this));
    }

    @Override
    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    @Override
    public Hero removeHero() {
        Hero hero = heroes.get(0);
        heroes.remove(0);
        return hero;
    }

    @Override
    public int numHeroes() {
        return heroes.size();
    }

    @Override
    public Team getTeam() {
        return team;
    }

    @Override
    public ArrayList<Hero> getHeroes() {
        return this.heroes;
    }
}
