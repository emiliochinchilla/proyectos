
package Entidades;


public class Cargo {
    private String codigo;
    private String nombreCargo;
    private double salarioxHora;

    public Cargo(String codigo, String nombreCargo, double salarioxHora) {
        this.codigo = codigo;
        this.nombreCargo = nombreCargo;
        this.salarioxHora = salarioxHora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public double getSalarioxHora() {
        return salarioxHora;
    }

    public void setSalarioxHora(double salarioxHora) {
        this.salarioxHora = salarioxHora;
    }
    
    
    
    
}
