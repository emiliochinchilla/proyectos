package Logica;

import AccesoDatos.AccesoDatos;
import Entidades.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Logica {

    double total = 0;//Variables se inicializan para utilizarlas dentro del método Calculos()
    double promedio = 0;//Variables se inicializan para utilizarlas dentro del método Calculos()
    
    public boolean ValidarLogica(Venta Venta) {//Metodo que valida que el registro enviado desde Presentación tenga información, Venta != null.
        if (Venta == null) {
            JOptionPane.showMessageDialog(null, "Error en logica", "Error de Logica", JOptionPane.WARNING_MESSAGE);
            return false;//Devuelve false si el registro viene vacío
        } else {

            AccesoDatos accesoDatos = new AccesoDatos();
            return accesoDatos.InsertarArticulo(Venta) && accesoDatos.InsertarCliente(Venta)//Devuelve true si todos los metodos de AccesoDatos lograron guardar la información en la base de datos
                    && accesoDatos.InsertarVendedor(Venta) && accesoDatos.InsertarVenta(Venta);//Se llaman los métodos de AccesoDatos para que sean ejecutados.
        }

    }

    public List<Venta> extraerVentas() {//Metodo que devuelve la lista que recibe de accesoDatos

        AccesoDatos accesoDatos = new AccesoDatos();
        return accesoDatos.extraerVentas();//devuelve la lista para ser utilizada en presentacion

    }
    
    public Double Calculos(){//Hace los calculos del promedio y suma del total de ventas
        
        
        AccesoDatos accesoDatos = new AccesoDatos();        
        List<Venta>listaVentas = accesoDatos.extraerVentas();//Crea una lista nueva y guarda en ella la lista que viene de AccesoDatos
        
        for (Venta lasVentas : listaVentas) {//loop que guarda en lasVentas cada uno de los objetos dentro de la listaVentas
            
            
            
            total = total + lasVentas.getElArticulo().getPrecio();//va sumando el precio de cada articulo y lo guarda en la variable
            promedio = total/listaVentas.size();//toma el valor de la variable total y lo divide entre el tamaño (cantidad de ventas) de la lista
            
        }
        
        
        
        return null;
    }
    
    //Se utilizaron Getters y Setters para poder devolver dos variables (promedio y total) con un mismo método
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
    
}
