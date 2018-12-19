/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacional;

import java.time.LocalDate;

/**
 *
 * @author Palacios
 */
public class NotaCredito extends ComprobanteElectronico implements IComprobantes{
    private String detalleModificacion;
    private double valorAPagar;

    public NotaCredito(String detalleModificacion, double valorAPagar, String nombreCliente, long codigo, LocalDate fecha) {
        super(nombreCliente, codigo, fecha);
        this.detalleModificacion = detalleModificacion;
        this.valorAPagar = valorAPagar;
    }

    public NotaCredito() {
    }

    public String getDetalleModificacion() {
        return detalleModificacion;
    }

    public void setDetalleModificacion(String detalleModificacion) {
        this.detalleModificacion = detalleModificacion;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    @Override
    public String getComprobante() {
      return "Soy un comprobante tipo Nota de Creadito";
    }

  
   
    
    
    
    
    
}
