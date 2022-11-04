
package Entidades;

import java.util.ArrayList;
import java.util.List;


public class Funcionario extends Persona{
    private String carneDefuncionario;
    private int cantidadHorasTrabajadas;
    private Cargo elCargo;
    private List <Cargo> listaDeCargos;

    public Funcionario(String carneDefuncionario, int cantidadHorasTrabajadas, Cargo elCargo, String cedula, String nombre, String apellido) {
        super(cedula, nombre, apellido);
        this.listaDeCargos = new ArrayList();
        this.carneDefuncionario = carneDefuncionario;
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
        this.elCargo = elCargo;
    }



    public String getCarneDefuncionario() {
        return carneDefuncionario;
    }

    public void setCarneDefuncionario(String carneDefuncionario) {
        this.carneDefuncionario = carneDefuncionario;
    }

    public int getCantidadHorasTrabajadas() {
        return cantidadHorasTrabajadas;
    }

    public void setCantidadHorasTrabajadas(int cantidadHorasTrabajadas) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }

    public Cargo getElCargo() {
        return elCargo;
    }

    public void setElCargo(Cargo elCargo) {
        this.elCargo = elCargo;
    }

    public List<Cargo> getListaDeCargos() {
        return listaDeCargos;
    }

    public void setListaDeCargos(List<Cargo> listaDeCargos) {
        this.listaDeCargos = listaDeCargos;
    }
    
    
    
}
