package Creacional;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Palacios
 */
public class ComprobanteElectronico  {
    
    protected List<String> detallesEmisor;
    protected String nombreCliente ;
    protected long codigo;
    protected LocalDate fecha;
    protected String numeroAutorizacion;
    protected String claveAcceso;

    public ComprobanteElectronico(String cliente, long codigo, LocalDate fecha) {
        this.nombreCliente = cliente;
        this.codigo = codigo;
        this.fecha = fecha;
        this.detallesEmisor = new LinkedList<>();
    }

    public ComprobanteElectronico() {
        this.detallesEmisor = new LinkedList<>();
    }

    public List<String> getDetallesEmisor() {
        return detallesEmisor;
    }

    public void setDetallesEmisor(List<String> detallesEmisor) {
        this.detallesEmisor = detallesEmisor;
    }


    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public void setNumeroAutorizacion(String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    @Override
    public String toString() {
        return "ComprobanteElectronico{" + "detallesEmisor=" + detallesEmisor + ", cliente=" + nombreCliente + ", codigo=" + codigo + ", fecha=" + fecha + ", numeroAutorizacion=" + numeroAutorizacion + ", claveAcceso=" + claveAcceso + '}';
    }

    
    
    
    
}