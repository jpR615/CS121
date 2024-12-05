package weekTwelve.fileIO;

import java.util.Scanner;

public class Menu {
    Scanner scn = new Scanner(System.in);
    Pokedex pokedex = new Pokedex();

    public void displayMenu() {
        while (true) {
            System.out.println("********* MENU *********");
            System.out.println("Please make a selection: ");
            System.out.println("1) Add a Pokemon");
            System.out.println("2) Remove a Pokemon");
            System.out.println("3) Display Pokemon Info");
            System.out.println("4) Display All Pokemon Info");
            System.out.println("5) Exit");
            String input = scn.nextLine();
            if (input.equals("1") || input.equalsIgnoreCase("one")) {
                createPokemon();
            }

            if (input.equals("2") || input.equalsIgnoreCase("two")) {
                deletePokemon();
            }

            if (input.equals("3") || input.equalsIgnoreCase("three")) {
                displayPokemon();
            }

            if (input.equals("4") || input.equalsIgnoreCase("four")) {
                displayAllPokemon();
            }

            if (input.equals("5") || input.equalsIgnoreCase("five")) {
                break;
            }
        }
    }

    public void createPokemon(){
        String name = "";
        while (!name.equals("q")) {
            System.out.println("Enter Pokemon name or press 'q' to exit: ");
            name = scn.nextLine();
            if (name.equals("q")) {
                break;
            }
            System.out.println("Enter Pokemon HP: ");
            int hp = scn.nextInt();
            scn.nextLine();
            Pokemon pokemon = new Pokemon(name, hp);
            pokedex.addPokemon(pokemon);

            String move = "";
            while (!move.equals("q")) {
                System.out.println("Enter Pokemon move name: ");
                move = scn.nextLine();
                System.out.println("Enter move power: ");
                int power = scn.nextInt();
                scn.nextLine();
                System.out.println("Enter move speed: ");
                int speed = scn.nextInt();
                scn.nextLine();
                Move move1 = new Move(move, power, speed);
                pokemon.addMove(move1);
                System.out.println("Enter 'q' to enter new Pokemon or enter next move to continue.");
                move = scn.nextLine();
            }
            System.out.println(pokemon.toString() + " has been added to the Pokedex.");
        }
    }

    public void deletePokemon() {
        System.out.println("Enter name of Pokemon you want to delete: ");
        String name = scn.nextLine();
        Pokemon pokemon = pokedex.getPokemon(name);
        if (pokedex.getAllPokemon().contains(pokemon)) {
            pokedex.removePokemon(pokedex.getPokemon(name));
        }

        else {
            System.out.println("Pokemon not found.");
        }


    }

    public void displayPokemon() {
        System.out.println("Enter name of Pokemon to display info: ");
        String name = scn.nextLine();
        Pokemon pokemon = pokedex.getPokemon(name);

        if (pokedex.getAllPokemon().contains(pokemon)) {
            System.out.println(pokemon.toString());
        }

        else {
            System.out.println("Pokemon not found.");
        }

    }

    public void displayAllPokemon() {
        for (Pokemon pokemon : pokedex.getAllPokemon()) {
            System.out.println(pokemon.toString());
        }
    }
}
