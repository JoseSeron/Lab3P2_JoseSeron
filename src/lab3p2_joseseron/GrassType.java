/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_joseseron;

/**
 *
 * @author joser
 */
public class GrassType extends Pokemon{
    String habitat;
    int dominioPlantas;

    public GrassType() {
        super();
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominioPlantas() {
        return dominioPlantas;
    }

    public void setDominioPlantas(int dominioPlantas) {
        this.dominioPlantas = dominioPlantas;
    }

    @Override
    public String toString() {
        return "GrassType{" +super.toString()+ "habitat=" + habitat + ", dominioPlantas=" + dominioPlantas + '}';
    }
    
    
    
}
