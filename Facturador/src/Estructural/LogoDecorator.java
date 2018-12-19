/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructural;

import Creacional.ComprobanteElectronico;
import java.util.List;

/**
 *
 * @author carlasanchez
 */
public class LogoDecorator extends DetalleDecorator {
   
    private ComprobanteElectronico comprobante;
    
    public LogoDecorator(ComprobanteElectronico comprobante) {
        super(comprobante);
    }

    public LogoDecorator() {
    }
    
     public List<String> getDetalleEmisor(){
        return this.comprobante.getDetallesEmisor();
    }
     
     @Override
	public String toString() {
		return "[Logo personalzado]\n"+comprobante.toString();
	}
}
