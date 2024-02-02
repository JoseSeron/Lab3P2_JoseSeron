package lab3p2_joseseron;

/**
 *
 * @author joser
 */
public class FireType extends Pokemon {

    int potencia;

    public FireType() {
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "FireType{" + super.toString() + "potencia=" + potencia + '}';
    }

}
