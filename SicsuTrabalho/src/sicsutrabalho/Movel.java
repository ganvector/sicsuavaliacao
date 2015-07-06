/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sicsutrabalho;

/**
 *
 * @author Vitor
 */
public abstract class Movel {
    protected final String fabricante = "Acme Ltda";
    protected String modelo;
    protected double preco;
    protected int numPes;
    protected String tipoMaterial;
    
    abstract void imprimir();
    abstract String montar();
    abstract String desmontar();
    abstract void serializar();
}
