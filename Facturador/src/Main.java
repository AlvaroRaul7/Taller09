/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlasanchez
 */
import java.util.ArrayList;
import java.util.List;

import Creacional.*;
import Estructural.*;
import Comportamentales.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {	
            //Creacion de comprobantes 
	    ComprobantesFactory comprobante = new ComprobantesFactory();
	    Factura factura = (Factura) comprobante.getComprobante("FACTURA");
	    NotaCredito ncredito = (NotaCredito) comprobante.getComprobante("NOTACREDITO");
	    GuiaRemision gremision = (GuiaRemision) comprobante.getComprobante("GUIAREMISION");
	   
	    
	    ncredito.setDetalleModificacion("Devolución de mercadería en mal estado");
	    ncredito.setValorAPagar(20);
	    ncredito.setNombreCliente("Alvaro");
	    DetalleDecorator ncEncabezado=new LogoDecorator(ncredito);
	    
            factura.setNombreCliente("Carla");
            factura.setCodigo(120193);
            factura.setClaveAcceso("120408");
	    
	    gremision.setNombreCliente("Maykel");
            gremision.setCodigo(140194);
            gremision.setClaveAcceso("120408");
            gremision.setDestino("Quito");
            gremision.setPlacaVehiculo("GRE-2345");
	    
	   System.out.println(factura.toString());
	    System.out.println("\t*************");
            System.out.println(ncredito.toString());
	    System.out.println("\t*************");
            System.out.println(gremision.toString());
            System.out.println("\t*************");
            
        AutorizadorSRI autorizador = new AutorizadorSRI();
        Scanner sc = new Scanner(System.in);

        System.out.print("Esquema de facturación: \n");
        System.out.print("1. Online\n2. Offline\n");
        int opc3 = sc.nextInt();
        if(opc3==1){
                autorizador.setEsquema(new EsquemaOnline());
                autorizador.autorizar(factura);
        }else{
                autorizador.setEsquema(new EsquemaOffline());
                autorizador.autorizar(factura);
               

        }
        System.out.println(factura.toString());
        
                
                
        }

        
                
                
        

}

