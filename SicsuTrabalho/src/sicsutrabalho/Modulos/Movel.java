/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sicsutrabalho.Modulos;

import java.io.Serializable;

/**
 *
 * @author Vitor
 */
public abstract class Movel implements Serializable {
    protected final String fabricante = "Acme Ltda";
    protected String modelo;
    protected double preco;
    protected int numPes;
    protected String tipoMaterial;
    
    abstract void imprimir();
    abstract String montar();
    abstract String desmontar();
    abstract void serializar();

    public Movel(String modelo, double preco, int numPes, String tipoMaterial) {
        this.modelo = modelo;
        this.preco = preco;
        this.numPes = numPes;
        this.tipoMaterial = tipoMaterial;
    }

    public Movel() {
    }

    public Movel(String modelo, double preco, int numPes) {
        this.modelo = modelo;
        this.preco = preco;
        this.numPes = numPes;
    }

    public Movel(String modelo, double preco, String tipoMaterial) {
        this.modelo = modelo;
        this.preco = preco;
        this.tipoMaterial = tipoMaterial;
    }

    public Movel(String modelo, int numPes, String tipoMaterial) {
        this.modelo = modelo;
        this.numPes = numPes;
        this.tipoMaterial = tipoMaterial;
    }

    public Movel(double preco, int numPes, String tipoMaterial) {
        this.preco = preco;
        this.numPes = numPes;
        this.tipoMaterial = tipoMaterial;
    }

    public Movel(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public Movel(int numPes, String tipoMaterial) {
        this.numPes = numPes;
        this.tipoMaterial = tipoMaterial;
    }
    
    
}
