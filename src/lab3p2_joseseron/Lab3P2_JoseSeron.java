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
    public static void main(String[] args) {
        // Arraylist Pokebolas       ArrayList Pokedex
        ArrayList<Pokebola> pokebolas = new ArrayList();
        ArrayList<Pokemon> pokemons = new ArrayList();
        boolean salir = true;
        while (salir) {
            System.out.println("---Menu Principal");
            System.out.println("1.- CREAR POKEMON\n"
                    + "2.- CREAR POKEBOLA\n"
                    + "3.- LISTAR POKEMON\n"
                    + "4.- ELIMINAR POKEMON\n"
                    + "5.- CAPTURAR POKEMON\n"
                    + "6.- MODIFICAR POKEMON");
            
            char opMenu = input.nextLine().charAt(0);
            
            switch (opMenu) {
                case '1':
                    
                    break;
                      case '2':
                    
                    break;
                      case '3':
                    
                    break;
                      case '4':
                    
                    break;
                      case '5':
                    
                    break;
                      case '6': //salir
                          System.out.println("Saliendo del programa...");
                          salir=false;
                    break;
                default:
                    throw new AssertionError();
            }
                  

        } // salir menu principal

    }

}
