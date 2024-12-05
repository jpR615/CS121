package weekTwelve.fileIO.labTen;
import weekTwelve.fileIO.FileReadPokemon;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
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

            else if (input.equals("2") || input.equalsIgnoreCase("two")) {
                deletePokemon();
            }

            else if (input.equals("3") || input.equalsIgnoreCase("three")) {
                displayPokemon();
            }

            else if (input.equals("4") || input.equalsIgnoreCase("four")) {
                displayAllPokemon();
            }

            else if (input.equals("5") || input.equalsIgnoreCase("five")) {
                break;
            }
        }
    }

    private void createPokemon() {
        String name, moveName;
        int hp, movePower, moveSpeed, userChoice;
        Pokemon pokemon;
        Move move;

        System.out.println("Please select a number: ");
        System.out.println("1. Enter Pokemon details manually.");
        System.out.println("2. Select Pokemon from a file.");
        System.out.println("3. Exit.");
        userChoice = Integer.parseInt(scn.nextLine());

        if (userChoice == 1) {
            System.out.println("Enter a pokemon name: ");
            name = scn.nextLine();
            System.out.println("Enter the Pokemon's hp: ");
            hp = Integer.parseInt(scn.nextLine());
            pokemon = new Pokemon(name, hp);
            addMovesToPokemon(pokemon);
            pokedex.addPokemon(pokemon);
            System.out.printf("%s added to Pokedex\n\n", name);
        }

        else if(userChoice == 2) {
            FileReadPokemon file = new FileReadPokemon();
            ArrayList<String[]> pokemonData;
            try {
                pokemonData = file.readPokemonData("CharacterStatsFile.txt");
                if (pokemonData.isEmpty()) {
                    System.out.println("No Pokemon data in available in file.");
                    return;
                }

                for (int i = 0; i < pokemonData.size(); i++) {
                    System.out.printf("%d : %s", (i + 1), pokemonData.get(i)[0]);
                }

                int selectedIndex = Integer.parseInt(scn.nextLine()) - 1;

                if (selectedIndex >= 0 && selectedIndex < pokemonData.size()) {
                    String[] selectedPokemonData = pokemonData.get(selectedIndex);
                    name = selectedPokemonData[0];
                    hp = Integer.parseInt(selectedPokemonData[1]);
                    moveName = selectedPokemonData[2];
                    movePower = Integer.parseInt(selectedPokemonData[3]);
                    moveSpeed = Integer.parseInt(selectedPokemonData[4]);
                    pokemon = new Pokemon(name, hp);
                    move = new Move(moveName, movePower, moveSpeed);
                    pokemon.addMove(move);
                    pokedex.addPokemon(pokemon);
                    System.out.println("The pokemon has been added to the Pokedex from the file data.");

                } else {
                    System.err.println("From createPokemon() ERROR: invalid selection");
                }
                pokemonData = file.readPokemonData("CharacterStatsFile.txt");
            }
            catch (FileNotFoundException e) {
                System.err.println("No Pokemon data available in file.");
            }
        }

        else {
            System.err.println("Invalid selection");
        }

        while (true) {
            System.out.println("\tEnter a move name or q if finished.");
            moveName = scn.nextLine();
            if (moveName.equalsIgnoreCase("q")) {
                break;
            }
            System.out.println("\tEnter move power: ");
            movePower = Integer.parseInt(scn.nextLine());
            System.out.println("\tEnter move speed: ");
            moveSpeed = Integer.parseInt(scn.nextLine());

            move = new Move(moveName, movePower, moveSpeed);
            //pokemon.addMove(move);
        }
    }

    private void addMovesToPokemon(Pokemon pokemon) {
        while (true) {
            System.out.print("Enter a Move name for q if finished: ");
            String moveName = scn.nextLine();
            if (moveName.equalsIgnoreCase("q")) {
                break;
            }
            System.out.println("\tEnter Move's Power:");
            int movePower = Integer.parseInt(scn.nextLine());
            System.out.println("\tEnter Move's Speed: ");
            int moveSpeed = Integer.parseInt(scn.nextLine());

            Move move = new Move(moveName, movePower, moveSpeed);
            pokemon.addMove(move);

        }
    }


    private void deletePokemon() {
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

    private void displayPokemon() {
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

    private void displayAllPokemon() {
        ArrayList<Pokemon> pokemonArrayList = pokedex.getAllPokemon();
        if (pokemonArrayList.isEmpty()) {
            System.out.println("No Pokemon in the Pokedex!");
            return;
        }
        System.out.println("All Pokemon in the pokedex");
        for(Pokemon pokemon : pokemonArrayList){
            System.out.printf("Name: %s", pokemon.getName());
            System.out.printf("HP: %d", pokemon.getHp());

            ArrayList<Move> movesArrayList = pokemon.getMoveArrayList();
            if(movesArrayList.isEmpty()){
                System.out.println("No moves available for this Pokemon!");
            }
            else {
                System.out.println("Moves: ");
                for (Move move : movesArrayList) {
                    System.out.printf("\t\t Move Names: %s", move.getMoveName());
                    System.out.printf("\t\t Move Power: %s", move.getMovePower());
                    System.out.printf("\t\t Move Speed: %s", move.getMoveSpeed());
                }
            }
            System.out.println();
        }
        for (int i = 0; i < pokemonArrayList.size(); i++) {
            System.out.printf("%d.) %s\n\n ", (i + 1), pokemonArrayList.get(i));
        }
    }
}
