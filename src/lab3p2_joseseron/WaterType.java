package lab3p2_joseseron;

/**
 *
 * @author joser
 */
public class WaterType extends Pokemon {

    boolean amfibio;
    int nado;

    public WaterType() {
        super();
    }

    public boolean isAmfibio() {
        return amfibio;
    }

    public void setAmfibio(boolean amfibio) {
        this.amfibio = amfibio;
    }

    public int getNado() {
        return nado;
    }

    public void setNado(int nado) {
        this.nado = nado;
    }

    @Override
    public String toString() {
        return "WaterType{" + super.toString() + "amfibio=" + amfibio + ", nado=" + nado + '}';
    }

}
