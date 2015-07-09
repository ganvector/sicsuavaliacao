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
public interface Decoracoes {
    /*protected String modelo;
    protected double preco;
    protected int numPes;
    protected String tipoMaterial;*/
    
    String getModelo();
    void setModelo(String modelo);
    
    double getPreco();
    void setPreco(double preco);
    
    int getNumPes();
    void setNumPes(int numPes);
    
    String getTipoMaterial();
    void setTipoMaterial(String tipoMaterial);
    
    String montar();
    String desmontar();
}
