/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamentales;

import Creacional.ComprobanteElectronico;

/**
 *
 * @author alvaro-pc
 */
public class EsquemaOnline implements Esquema {

    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        comprobante.setNumeroAutorizacion(String.valueOf((int) (Math.random() * 1000)));    }
    
}
