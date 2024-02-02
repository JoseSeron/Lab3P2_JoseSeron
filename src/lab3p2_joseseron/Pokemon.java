package lab3p2_joseseron;

/**
 *
 * @author joser
 */
public class Pokemon {

    String nombre;
    int entradaPokedex;
    String naturaleza;
    boolean atrapado = false;
    Pokebola pokebola;

    public Pokemon() {
    }

    public Pokemon(String nombre, int entradaPokedex, String naturaleza, Pokebola pokebola) {
        this.nombre = nombre;
        this.entradaPokedex = entradaPokedex;
        this.naturaleza = naturaleza;
        this.pokebola = pokebola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntradaPokedex() {
        return entradaPokedex;
    }

    public void setEntradaPokedex(int entradaPokedex) {
        this.entradaPokedex = entradaPokedex;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    public Pokebola getPokebola() {
        return pokebola;
    }

    public void setPokebola(Pokebola pokebola) {
        this.pokebola = pokebola;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + nombre + ", entradaPokedex=" + entradaPokedex + ", naturaleza=" + naturaleza + ", atrapado=" + atrapado + ", pokebola=" + pokebola + '}';
    }

}
