package lab3p2_joseseron;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joser
 */
public class Lab3P2_JoseSeron {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);
    static Scanner inputInt = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Pokebola> pokebolas = new ArrayList();
        ArrayList<Pokemon> pokemons = new ArrayList();

        boolean salir = true;

        while (salir) {
            System.out.println("\n---Menu Principal");
            System.out.println("1.- CREAR POKEMON\n"
                    + "2.- CREAR POKEBOLA\n"
                    + "3.- LISTAR POKEMON\n"
                    + "4.- ELIMINAR POKEMON\n"
                    + "5.- CAPTURAR POKEMON\n"
                    + "6.- MODIFICAR POKEMON\n"
                    + "7.- SALIR");

            char opMenu = input.nextLine().charAt(0);

            switch (opMenu) {
                case '1': //crear
                    char opCrear;

                    System.out.println("Que tipo de pokemon quiere agregar?\n"
                            + "1.- Fire Type\n"
                            + "2.- Water Type\n"
                            + "3.- Grass Type");
                    opCrear = input.nextLine().charAt(0);

                    System.out.println("Ingrese un nombre para el pokemon: ");
                    String nombre = input.nextLine();
                    System.out.println("Ingrese naturaleza del pokemon(ej. timido, energetico, misterioso): ");
                    String naturaleza = input.nextLine();
                    System.out.println("Ingrese numero de entrada en la pokedex: ");
                    int entradaPokedex = inputInt.nextInt();
                    //pokebola en null y atrapado en false

                    switch (opCrear) {
                        case '1': //fuego
                            System.out.println("Ingrese potencia de las llamas del pokemon (1-100): ");
                            int potencia = inputInt.nextInt();
                            FireType nuevoFire = new FireType();
                            nuevoFire.setAtrapado(false);
                            nuevoFire.setEntradaPokedex(entradaPokedex);
                            nuevoFire.setNombre(nombre);
                            nuevoFire.setNaturaleza(naturaleza);
                            nuevoFire.setPokebola(null);
                            nuevoFire.setPotencia(potencia);
                            pokemons.add(nuevoFire);
                            System.out.println(nombre + " fue añadido!");

                            break;
                        case '2': //water
                            WaterType nuevoWater = new WaterType();
                            System.out.println("Puede vivir fuera del agua? (1=si, 2=no)");
                            char vivirFuera = input.nextLine().charAt(0);
                            if (vivirFuera == '1') {
                                nuevoWater.setAmfibio(true);
                            } else if (vivirFuera == '2') {
                                nuevoWater.setAmfibio(false);
                            }

                            System.out.println("Ingrese rapidez al nada (1-100):");
                            int nado = inputInt.nextInt();
                            nuevoWater.setAtrapado(false);
                            nuevoWater.setEntradaPokedex(entradaPokedex);
                            nuevoWater.setNado(nado);
                            nuevoWater.setNaturaleza(naturaleza);
                            nuevoWater.setNombre(nombre);
                            nuevoWater.setPokebola(null);
                            pokemons.add(nuevoWater);
                            System.out.println(nombre + " fue añadido!");

                            break;
                        case '3': // grass
                            GrassType nuevoGrass = new GrassType();
                            System.out.println("Ingrese habitat: ");
                            String habitat = input.nextLine();
                            System.out.println("Ingrese el dominio sobre las plantas (1-100):");
                            int dominio = inputInt.nextInt();
                            nuevoGrass.setAtrapado(false);
                            nuevoGrass.setDominioPlantas(dominio);
                            nuevoGrass.setEntradaPokedex(entradaPokedex);
                            nuevoGrass.setHabitat(habitat);
                            nuevoGrass.setNaturaleza(naturaleza);
                            nuevoGrass.setNombre(nombre);
                            nuevoGrass.setPokebola(null);
                            pokemons.add(nuevoGrass);
                            System.out.println(nombre + " fue añadido!");
                            break;
                        default:
                            throw new AssertionError();
                    }

                    break;
                case '2': // crear pokebola
                    // color serie eficiencia
                    Pokebola nuevaPokebola = new Pokebola();
                    System.out.println("Ingrese el color de la pokebola: ");
                    String colorPokebola = input.nextLine();
                    System.out.println("Ingrese el numero de serie: ");
                    int numeroPokebola = inputInt.nextInt();
                    System.out.println("Ingrese eficiencia de atrapado(1-3): ");
                    int eficiencia = inputInt.nextInt();
                    nuevaPokebola.setColor(colorPokebola);
                    nuevaPokebola.setEficiencia(eficiencia);
                    nuevaPokebola.setSerie(numeroPokebola);
                    System.out.println("Pokebola #" + numeroPokebola + " fue añadida!");
                    break;
                case '3': //listar
                    if (pokemons.isEmpty()) {
                        System.out.println("No hay ningun pokemon en la lista");
                    } else {
                        System.out.println("POKEMONS: ");

                        for (Pokemon pokemon : pokemons) {
                            if (pokemon instanceof FireType) {
                                System.out.println(pokemons.indexOf(pokemon) + ")" + pokemon);
                            }
                        }
                        for (Pokemon pokemon : pokemons) {
                            if (pokemon instanceof WaterType) {
                                System.out.println(pokemons.indexOf(pokemon) + ")" + pokemon);
                            }
                        }
                        for (Pokemon pokemon : pokemons) {
                            if (pokemon instanceof GrassType) {
                                System.out.println(pokemons.indexOf(pokemon) + ")" + pokemon);
                            }
                        }

                    }
                    break;
                case '4': // eliminar pokemon

                    break;
                case '5': //capturar

                    break;
                case '6': //modificar

                    break;
                case '7': //salir
                    System.out.println("Saliendo del programa...");
                    salir = false;
                    break;

                default:
                    throw new AssertionError();
            }

        } // wh salir menu principal

    } //main

}
