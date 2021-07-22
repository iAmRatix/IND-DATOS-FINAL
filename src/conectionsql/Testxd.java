/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectionsql;

import CRUD.ClienteBO;
import Clases.Cliente;
import CRUD.PedidoBO;
import Clases.Pedido;


/**
 *
 * @author Ratix
 */
public class Testxd {
    PedidoBO pbo = new PedidoBO();
    Pedido ped = new Pedido();
    ClienteBO cbo = new ClienteBO();
    Cliente cli = new Cliente();
    String mensaje = "";
    
    
    public void pinsertar(){
        ped.setDnicli("70047895");
        ped.setEstado("FINALIZADO");
        ped.setPrecio(1000);
        ped.setFvisita("21/07/2021");
        ped.setFentrega("21/08/2021");
        ped.setDireccion("JR LAS QUE WENA 1234");
        ped.setDescri("4BAÑOS 1 SALA");
        ped.setCantidad(69);
        ped.setAlto("54");
        ped.setLargo("12");
        ped.setAncho("1");               
        
        mensaje = pbo.agregarPedido(ped);
        System.out.println(mensaje);  
    }
    
    public void peliminar(){
        ped.setDnicli("70047895");
        ped.setEstado("FINALIZADO");
        ped.setPrecio(1000);
        ped.setFvisita("21/07/2021");
        ped.setFentrega("21/08/2021");
        ped.setDireccion("JR LAS QUE WENA 1234");
        ped.setDescri("4BAÑOS 1 SALA");
        ped.setCantidad(69);
        ped.setAlto("54");
        ped.setLargo("12");
        ped.setAncho("1"); 
        mensaje = pbo.eliminarPedido(ped);
        System.out.println(mensaje);  
    }
    /*
    public void pmodificar(){
        ped.setId(2);
        ped.setDnicli("999999");
        ped.setEstado("FINALIZADO");
        ped.setNrocontrato("5555");
        ped.setFvisita("20/07/2021");
        ped.setFentrega("20/08/2021");
        ped.setDireccion("JR LAS HOJAS 1234");
        ped.setDescri("4 SALA");
        ped.setPrecio("1000");
        ped.setAlto("54");
        ped.setLargo("12");
        ped.setAncho("1");               
        
        mensaje = pbo.modificarPedido(ped);
        System.out.println(mensaje);  
    }*/
    /*
    public void insertar(){
        cli.setDni("13213112");
        cli.setNombre("GONZALES");
        cli.setCelular("456789132");
        cli.setDireccion("JR LAS HOJAS 1234");
        cli.setCorreo("PEDRO@HOTMAIL.COM");
        
        mensaje = cbo.agregarCliente(cli);
        System.out.println(mensaje);  
    }
    public void modificar(){
        cli.setId(21);
        cli.setDni("1111111");
        cli.setNombre("ggggggg");
        cli.setCelular("gggg2");
        cli.setDireccion("gggggggOJAS 1234");
        cli.setCorreo("ggggTMAIL.COM");
        
        mensaje = cbo.modificarCliente(cli);
        System.out.println(mensaje);
    }
    public void eliminar(){
        mensaje = cbo.eliminarCliente(1);
        System.out.println(mensaje);  
    }
    
    */
    
    
    public static void main(String[] args) {
        Testxd test = new Testxd();
        //test.pinsertar();
        //test.peliminar();
        //test.pmodificar();
        
    }
}
