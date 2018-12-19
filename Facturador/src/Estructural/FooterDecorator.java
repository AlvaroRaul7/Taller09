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
public class FooterDecorator extends DetalleDecorator {
    
    private ComprobanteElectronico comprobante;

    public FooterDecorator(ComprobanteElectronico comprobante) {
        super(comprobante);
    }

    public FooterDecorator() {
    }
    
     public List<String> getDetalleEmisor(){
        return this.comprobante.getDetallesEmisor();
    }
    @Override
	public String toString() {
		return comprobante.toString()+"[Footer]";
	}
}
