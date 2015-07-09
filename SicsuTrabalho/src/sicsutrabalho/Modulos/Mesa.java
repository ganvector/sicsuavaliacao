/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sicsutrabalho.Modulos;

import sicsutrabalho.Modulos.Movel;
import java.io.*;

/**
 *
 * @author Vitor
 */
public class Mesa extends Movel implements Serializable, Decoracoes, DefinicaoMesa{
    private int numLugares;
    private double altura;
    private double largura;

    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int getNumPes() {
        return numPes;
    }

    @Override
    public void setNumPes(int numPes) {
        this.numPes = numPes;
    }

    @Override
    public String getTipoMaterial() {
        return tipoMaterial;
    }

    @Override
    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public void imprimir() {
        System.out.println("Mesa{" + "fabricante=" + fabricante + ", modelo=" + modelo + ", preco=" + preco + ", numPes=" + numPes + ", tipoMaterial=" + tipoMaterial + ", numLugares=" + numLugares + ", altura=" + altura + ", largura=" + largura + '}');
    }
    
    @Override
    public String montar(){
        return "seguir manual M1 das paginas 3 a 10";
    }
    
    @Override
    public String desmontar(){
        return "seguir manual M1 das paginas 11 a 21";
    }
    
    @Override
    public void serializar() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mesa.bin"));
            oos.writeObject(this);
            oos.close();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    @Override
    public Mesa desserializar() { 
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mesa.bin"));
            Mesa mesa = (Mesa) ois.readObject();
            
            this.modelo = mesa.modelo;
            this.preco = mesa.preco;
            this.numPes = mesa.numPes;
            this.tipoMaterial = mesa.tipoMaterial;
            this.numLugares = mesa.numLugares;
            this.altura = mesa.altura;
            this.largura = mesa.largura;
            
            ois.close();
            return mesa;
            
        } catch(Exception e) {
            throw new RuntimeException(e);
        }        
       
    }

    public Mesa(String modelo, double preco, int numPes, String tipoMaterial) {
        super(modelo, preco, numPes, tipoMaterial);
    }

    public Mesa() {
    }

    public Mesa(String modelo, double preco) {
        super(modelo, preco);
    }

    public Mesa(int numPes, String tipoMaterial) {
        super(numPes, tipoMaterial);
    }

    public Mesa(int numLugares, double altura, double largura, String modelo, double preco, int numPes, String tipoMaterial) {
        super(modelo, preco, numPes, tipoMaterial);
        this.numLugares = numLugares;
        this.altura = altura;
        this.largura = largura;
    }

    public Mesa(int numLugares, double altura, double largura) {
        this.numLugares = numLugares;
        this.altura = altura;
        this.largura = largura;
    }

    public Mesa(int numLugares, double altura, double largura, String modelo, double preco) {
        super(modelo, preco);
        this.numLugares = numLugares;
        this.altura = altura;
        this.largura = largura;
    }

    public Mesa(int numLugares, double altura, double largura, int numPes, String tipoMaterial) {
        super(numPes, tipoMaterial);
        this.numLugares = numLugares;
        this.altura = altura;
        this.largura = largura;
    }

    public Mesa(int numLugares, double altura, double largura, String modelo, double preco, String tipoMaterial) {
        super(modelo, preco, tipoMaterial);
        this.numLugares = numLugares;
        this.altura = altura;
        this.largura = largura;
    }

    public Mesa(int numLugares, double altura, double largura, String modelo, int numPes, String tipoMaterial) {
        super(modelo, numPes, tipoMaterial);
        this.numLugares = numLugares;
        this.altura = altura;
        this.largura = largura;
    }
    
    
}
