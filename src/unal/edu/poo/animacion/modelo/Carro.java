/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.edu.poo.animacion.modelo;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private int x;
    private int y;
    private Chasis chasis;
    private Rueda[] ruedas;

    public Carro(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void crearChasis(int x, int y){
        Chasis chasis = new Chasis(x,y);
        this.chasis = chasis;
    }
    public void crearRueda(int x, int y){
        Rueda rueda = new Rueda(x,y);
        for(int i=0; i<2; i++){
            if(ruedas[i]!=null){
                ruedas[i] = rueda;
            }
        }
    }
}
