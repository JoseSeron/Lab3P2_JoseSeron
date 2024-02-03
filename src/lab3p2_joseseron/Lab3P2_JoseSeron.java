package lab3p2_joseseron;

import java.util.ArrayList;
import java.util.Random;
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
    static Random random = new Random();

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
                    input.nextLine();
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
                                System.out.println(pokemons.indexOf(pokemon) + ") " + pokemon);
                            }
                        }
                        for (Pokemon pokemon : pokemons) {
                            if (pokemon instanceof WaterType) {
                                System.out.println(pokemons.indexOf(pokemon) + ") " + pokemon);
                            }
                        }
                        for (Pokemon pokemon : pokemons) {
                            if (pokemon instanceof GrassType) {
                                System.out.println(pokemons.indexOf(pokemon) + ") " + pokemon);
                            }
                        }

                    }
                    break;
                case '4': // eliminar pokemon
                    System.out.println("Que tipo de pokemon desea eliminar? (1=Fire, 2=Water, 3=Grass)");
                    int tipoBorrar = inputInt.nextInt();
                    if (tipoBorrar == 1) {

                        for (Pokemon pokemon : pokemons) {
                            if (pokemon instanceof FireType) {
                                System.out.println(pokemons.indexOf(pokemon) + ") " + pokemon);
                            }
                        }
                        int indiceBorrar;
                        do {
                            System.out.println("Ingrese el indice (de los mostrados arriba) que desea eliminar: ");
                            indiceBorrar = inputInt.nextInt();

                            if (!(pokemons.get(indiceBorrar) instanceof FireType)) {
                                System.out.println("El indice ingresado no corresponde a un pokemon tipo fuego");
                            }
                        } while (!(pokemons.get(indiceBorrar) instanceof FireType));

                        pokemons.remove(indiceBorrar);

                    } else if (tipoBorrar == 2) {
                        for (Pokemon pokemon : pokemons) {
                            if (pokemon instanceof WaterType) {
                                System.out.println(pokemons.indexOf(pokemon) + ") " + pokemon);
                            }
                        }

                        int indiceBorrar;
                        do {
                            System.out.println("Ingrese el indice (de los mostrados arriba) que desea eliminar: ");
                            indiceBorrar = inputInt.nextInt();

                            if (!(pokemons.get(indiceBorrar) instanceof WaterType)) {
                                System.out.println("El indice ingresado no corresponde a un pokemon tipo agua");
                            }
                        } while (!(pokemons.get(indiceBorrar) instanceof WaterType));

                        pokemons.remove(indiceBorrar);

                    } else if (tipoBorrar == 3) {
                        for (Pokemon pokemon : pokemons) {
                            if (pokemon instanceof GrassType) {
                                System.out.println(pokemons.indexOf(pokemon) + ") " + pokemon);
                            }
                        }

                        int indiceBorrar;
                        do {
                            System.out.println("Ingrese el indice (de los mostrados arriba) que desea eliminar: ");
                            indiceBorrar = inputInt.nextInt();

                            if (!(pokemons.get(indiceBorrar) instanceof GrassType)) {
                                System.out.println("El indice ingresado no corresponde a un pokemon tipo grass");
                            }
                        } while (!(pokemons.get(indiceBorrar) instanceof GrassType));

                        pokemons.remove(indiceBorrar);

                    }

                    break;
                case '5': // capturar
                    if (pokebolas.isEmpty() || pokemons.isEmpty()) {
                        System.out.println("No hay suficientes pokebolas o pokemons para capturar.");
                        break;
                    }

                    System.out.println("Seleccione una pokebola para capturar:");
                    for (int i = 0; i < pokebolas.size(); i++) {
                        System.out.println(i + ") " + pokebolas.get(i));
                    }

                    int indicePokebola = inputInt.nextInt();
                    Pokebola seleccionPokebola = pokebolas.get(indicePokebola);

                    ArrayList<Pokemon> PokemonsLibres = new ArrayList<>();
                    for (Pokemon pokemon : pokemons) {
                        if (!pokemon.isAtrapado()) {
                            PokemonsLibres.add(pokemon);
                        }
                    }

                    if (PokemonsLibres.isEmpty()) {
                        System.out.println("No hay pokemons disponibles para capturar.");
                        break;
                    }

                    int randomPokemonIndice = random.nextInt(0, pokemons.size());
                    Pokemon randomPokemon = PokemonsLibres.get(randomPokemonIndice);

                    System.out.println("¡EL POKEMON " + randomPokemon.getNombre() + " HA APARECIDO!");

                    System.out.println("Desea utilizar la pokebola para 1=capturar o 2=huir?");
                    int opcionCaptura = inputInt.nextInt();

                    switch (opcionCaptura) {
                        case 1: // Capturar
                          
                            int randomAtrapar = random.nextInt(0, 4);

                            if (seleccionPokebola.getEficiencia() == 3) {
                                System.out.println("Pokemon Capturado!");
                                pokebolas.remove(indicePokebola);
                                randomPokemon.setAtrapado(true);
                            } else if ((seleccionPokebola.getEficiencia() == 2) && (randomAtrapar == 1 || randomAtrapar == 2)) {
                                System.out.println("Pokemon Capturado!");
                                pokebolas.remove(indicePokebola);
                                randomPokemon.setAtrapado(true);
                            } else if ((seleccionPokebola.getEficiencia() == 1) && randomAtrapar == 1) {
                                System.out.println("Pokemon Capturado!");
                                pokebolas.remove(indicePokebola);
                                randomPokemon.setAtrapado(true);
                            } else {
                                System.out.println("No has logrado capturar al Pokemon!");
                                 pokebolas.remove(indicePokebola);
                            }
                           

                            break;

                        case 2: // Huir
                            System.out.println("Has huido del encuentro.");
                            break;

                        default:
                            throw new AssertionError();
                    }
                    break;

                case '6': //modificar
                    System.out.println("Que tipo de pokemon desea modificar, 1.- fire 2.-water 3.-grass:");
                    int tipoModificar = inputInt.nextInt();

                    switch (tipoModificar) {
                        case 1:

                            for (Pokemon pokemon : pokemons) {
                                if (pokemon instanceof FireType) {
                                    System.out.println(pokemons.indexOf(pokemon) + ") " + pokemon);
                                }
                            }

                            int indiceModificar;
                            do {
                                System.out.println("Ingrese el indice (de los mostrados arriba) que desea modificar: ");
                                indiceModificar = inputInt.nextInt();

                                if (!(pokemons.get(indiceModificar).atrapado)) {
                                    System.out.println("El indice ingresado no corresponde a un pokemon atrapado");
                                }
                            } while (!(pokemons.get(indiceModificar).atrapado));

                            System.out.println("Que atributo desesa modificar?\n"
                                    + "1.-Nombre\n"
                                    + "2.-Numero de entrada en la pokedex\n"
                                    + "3.-Potencia de llamas");
                            int attModificarFire = inputInt.nextInt();

                            switch (attModificarFire) {
                                case 1:
                                    System.out.println("Ingrese el nuevo nombre:");
                                    String nombreModFire = input.nextLine();
                                    pokemons.get(indiceModificar).setNombre(nombreModFire);
                                    System.out.println("El nombre se cambio modifico exitosamente!");
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nuevo numero de entrada en la pokedex");
                                    int modNumEntradaFire = inputInt.nextInt();
                                    pokemons.get(indiceModificar).setEntradaPokedex(modNumEntradaFire);
                                    System.out.println("El numero de entrada se modifico exitosamente!");
                                    break;
                                case 3:
                                    System.out.println("Ingrese la nueva potencia de llamas (1-100):");
                                    int modPotencia = inputInt.nextInt();

                                    FireType pokeFuego = (FireType) pokemons.get(indiceModificar);
                                    pokeFuego.setPotencia(modPotencia);
                                    System.out.println("La potencia se modifico exitosamente!");
                                    break;

                                default:
                                    throw new AssertionError();
                            }

                            break;
                        case 2:

                            for (Pokemon pokemon : pokemons) {
                                if (pokemon instanceof WaterType) {
                                    System.out.println(pokemons.indexOf(pokemon) + ") " + pokemon);
                                }
                            }
                            int indiceModificarwater;
                            do {
                                System.out.println("Ingrese el indice (de los mostrados arriba) que desea eliminar: ");
                                indiceModificarwater = inputInt.nextInt();

                                if (!(pokemons.get(indiceModificarwater).atrapado)) {
                                    System.out.println("El indice ingresado no corresponde a un pokemon atrapado");
                                }
                            } while (!(pokemons.get(indiceModificarwater).atrapado));

                            System.out.println("Que atributo desesa modificar?\n"
                                    + "1.-Nombre\n"
                                    + "2.-Numero de entrada en la pokedex\n"
                                    + "3.-Puede vivir fuera del agua");
                            int attModificarWater = inputInt.nextInt();

                            switch (attModificarWater) {
                                case 1:
                                    System.out.println("Ingrese el nuevo nombre:");
                                    String nombreModFire = input.nextLine();
                                    pokemons.get(indiceModificarwater).setNombre(nombreModFire);
                                    System.out.println("El nombre se cambio modifico exitosamente!");
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nuevo numero de entrada en la pokedex");
                                    int modNumEntradaFire = inputInt.nextInt();
                                    pokemons.get(indiceModificarwater).setEntradaPokedex(modNumEntradaFire);
                                    System.out.println("El numero de entrada se modifico exitosamente!");
                                    break;

                                case 3:
                                    System.out.println("Ingrese si el pokemon puede vivir en el agua(1=si, 2=no)");
                                    int amfibioMod = inputInt.nextInt();

                                    switch (amfibioMod) {
                                        case 1:
                                            WaterType awaPoke = (WaterType) pokemons.get(indiceModificarwater);
                                            awaPoke.setAmfibio(true);
                                            System.out.println("Se modifico exitosamente!");
                                            break;
                                        case 2:
                                            WaterType awaPoke1 = (WaterType) pokemons.get(indiceModificarwater);
                                            awaPoke1.setAmfibio(false);
                                            System.out.println("Se modifico exitosamente!");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }

                                    break;

                                default:
                                    throw new AssertionError();
                            }

                            break;
                        case 3:

                            for (Pokemon pokemon : pokemons) {
                                if (pokemon instanceof GrassType) {
                                    System.out.println(pokemons.indexOf(pokemon) + ") " + pokemon);
                                }
                            }

                            int indiceModificargrass;
                            do {
                                System.out.println("Ingrese el indice (de los mostrados arriba) que desea eliminar: ");
                                indiceModificargrass = inputInt.nextInt();

                                if (!(pokemons.get(indiceModificargrass).atrapado)) {
                                    System.out.println("El indice ingresado no corresponde a un pokemon atrapado");
                                }
                            } while (!(pokemons.get(indiceModificargrass).atrapado));

                            System.out.println("Que atributo desesa modificar?\n"
                                    + "1.-Nombre\n"
                                    + "2.-Numero de entrada en la pokedex\n"
                                    + "3.-Habitat");
                            int attModificarGrass = inputInt.nextInt();

                            switch (attModificarGrass) {
                                case 1:
                                    System.out.println("Ingrese el nuevo nombre:");
                                    String nombreModFire = input.nextLine();
                                    pokemons.get(indiceModificargrass).setNombre(nombreModFire);
                                    System.out.println("El nombre se cambio modifico exitosamente!");
                                    break;
                                case 2:
                                    System.out.println("Ingrese el nuevo numero de entrada en la pokedex");
                                    int modNumEntradaFire = inputInt.nextInt();
                                    pokemons.get(indiceModificargrass).setEntradaPokedex(modNumEntradaFire);
                                    System.out.println("El numero de entrada se modifico exitosamente!");
                                    break;

                                case 3:
                                    System.out.println("Ingrese el nuevo habitat: ");
                                    String modHabitat = input.nextLine();
                                    GrassType montePoke = (GrassType) pokemons.get(indiceModificargrass);
                                    montePoke.setHabitat(modHabitat);
                                    System.out.println("Se modifico el Habitat exitosamente!");
                                    break;

                                default:
                                    throw new AssertionError();
                            }
                            break;

                        default:
                            throw new AssertionError();
                    }
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
