/*
 * file: HeroStorm.java
 */
package hw4.game;

import hw4.heroes.Hero;
import hw4.heroes.Party;

/**
 * The main porgram for game Hero Storm. It creates two parties and
 * shuffles them with given random seeds in arguments and executes
 * the game.
 *
 * @author dongyu wu
 * @author chenghui zhu
 */
public class HeroStorm {
    /** dragon party holds all dragon heroes*/
    private Party dragonParty;

    /** lion party holds all lion heroes*/
    private Party lionParty;

    /**
     * The constructor creates dragon party and lion party
     *
     * @param dragonSeed random seed to shuffle dragon party
     * @param lionSeed random seed to shuffle lion party
     */
    public HeroStorm(int dragonSeed, int lionSeed) {
        dragonParty = new HeroParty(Team.DRAGON,dragonSeed);
        lionParty = new HeroParty(Team.LION,lionSeed);
    }

    /**
     * The battle method executes the battle between two heroes in each round
     *
     * @param firstHero hero who acts first
     * @param secondHero hero who acts later
     */
    private void battle(Hero firstHero, Hero secondHero) {
        System.out.printf("*** %s vs %s!\n\n",firstHero.getName(),secondHero.getName());
        firstHero.attack(secondHero);
        if (!secondHero.hasFallen()) {
            secondHero.attack(firstHero);
        }
    }

    /**
     * The play method will execute the game in battle rounds. It will
     * get heroes in the front of each party and let them fight with
     * each other.
     *
     */
    public void play() {
        int round = 0;
        while (true) {
            round+=1;
            System.out.printf("Battle #%d\n==========\n",round);
            System.out.println("DRAGON:");
            System.out.println(dragonParty);
            System.out.println("LION:");
            System.out.println(lionParty);
            Hero dragon = dragonParty.removeHero();
            Hero lion = lionParty.removeHero();
            if (round%2==1) {//dragon first
                battle(dragon,lion);
            } else {//lion first
                battle(lion,dragon);
            }
            dragonParty.addHero(dragon);
            lionParty.addHero(lion);

            System.out.println();
            if (dragonParty.numHeroes()==0) {
                System.out.println("Team Lion wins!");
                break;
            }
            if (lionParty.numHeroes()==0) {
                System.out.println("Team Dragon wins!");
                break;
            }
        }
    }

    /**
     * The main method takes command line arguments and create
     * the game.
     *
     * @param args command line arguments, two integer for party generator seeds
     */
    public static void main(String[] args) {
        if (args.length<2) {
            System.out.println("Not enough arguments!");
            return;
        }
        HeroStorm heroStorm = new HeroStorm(Integer.parseInt(args[0]),
                Integer.parseInt(args[1]));
        heroStorm.play();
    }
}
