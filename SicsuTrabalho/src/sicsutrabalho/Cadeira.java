/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sicsutrabalho;

import java.io.*;

/**
 *
 * @author leonardocordeiro
 */
public class Cadeira extends Movel implements Serializable {
    
    private String cor;
    private int numeroPes;
    private String tipoRevestimento;
    private boolean amortecedor;

    public String getFabricante() {
        return fabricante;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPes() {
        return numeroPes;
    }

    public void setNumeroPes(int numeroPes) {
        this.numeroPes = numeroPes;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getTipoRevestimento() {
        return tipoRevestimento;
    }

    public void setTipoRevestimento(String tipoRevestimento) {
        this.tipoRevestimento = tipoRevestimento;
    }

    public boolean isAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(boolean amortecedor) {
        this.amortecedor = amortecedor;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Cadeira{" + "fabricante=" + fabricante + ", modelo=" + modelo + ", preco=" + preco + ", cor=" + cor + ", numeroPes=" + numeroPes + ", tipoMaterial=" + tipoMaterial + ", tipoRevestimento=" + tipoRevestimento + ", amortecedor=" + amortecedor + '}');
        
    }
    
    @Override
    public String montar() { 
        return "seguir manual C1 das pags 2 a 8";
    }
    
    @Override
    public String desmontar() { 
        return "seguir manual c1 das pags 9 a 15";
    }
    
    @Override
    public void serializar() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cadeira.bin"));
            oos.writeObject(this);
            oos.close();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public Cadeira desserializar() { 
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cadeira.bin"));
            Cadeira cadeira = (Cadeira) ois.readObject();
            
            this.amortecedor = cadeira.amortecedor;
            this.cor = cadeira.cor;
            this.modelo = cadeira.modelo;
            this.numeroPes = cadeira.numeroPes;
            this.preco = cadeira.preco;
            this.tipoMaterial = cadeira.tipoMaterial;
            this.tipoRevestimento = cadeira.tipoRevestimento;

            ois.close();
            return cadeira;
            
        } catch(Exception e) {
            throw new RuntimeException(e);
        }        
       
    }      
    
}
