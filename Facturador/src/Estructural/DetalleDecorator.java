/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructural;

import Creacional.*;
import java.util.List;

/**
 *
 * @author carlasanchez
 */
public class DetalleDecorator {
    
    private ComprobanteElectronico comprobante;
    
    public DetalleDecorator() {
    }
    

    public DetalleDecorator(ComprobanteElectronico comprobante) {
            this.comprobante=comprobante;
    }

    
    
    public List<String> getDetallesEmisor(){
        return this.comprobante.getDetallesEmisor();
    }
    
    public ComprobanteElectronico getComprobante() {
        return this.comprobante;
    }
    
}
