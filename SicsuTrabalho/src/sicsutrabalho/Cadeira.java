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
public class Cadeira extends Movel implements Serializable, Decoracoes, DefinicaoCadeira {
    
    private String cor;
    private String tipoRevestimento;
    private boolean amortecedor;

    public String getFabricante() {
        return fabricante;
    }

    @Override
    public void setNumPes(int numPes){
        this.numPes = numPes;
    }
    
    @Override
    public int getNumPes(){
        return this.numPes;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getTipoMaterial() {
        return tipoMaterial;
    }

    @Override
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
        System.out.println("Cadeira{" + "fabricante=" + fabricante + ", modelo=" + modelo + ", preco=" + preco + ", cor=" + cor + ", tipoMaterial=" + tipoMaterial + ", tipoRevestimento=" + tipoRevestimento + ", amortecedor=" + amortecedor + '}');
        
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
    
    @Override
    public Cadeira desserializar() { 
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cadeira.bin"));
            Cadeira cadeira = (Cadeira) ois.readObject();
            
            this.amortecedor = cadeira.amortecedor;
            this.cor = cadeira.cor;
            this.modelo = cadeira.modelo;
            this.numPes = cadeira.numPes;
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
