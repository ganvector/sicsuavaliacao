/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sicsutrabalho.Modulos;

import sicsutrabalho.Modulos.Cadeira;

/**
 *
 * @author Vitor
 */
public interface DefinicaoCadeira {
    void imprimir();
    void serializar();
    Cadeira desserializar();
}
