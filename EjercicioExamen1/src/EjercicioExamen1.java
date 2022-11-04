
import Entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidades.Cargo;

public class EjercicioExamen1 {

    


    public static void main(String[] args) {
        
        int opcion = 1;
        String cedulaFuncionario;
        String nombreFuncionario;
        String apellidoFuncionario;
        String nombreDelCargo;
        Double salarioPorHoraDelCargo;
        String carneDelFuncionario;
        int cantidadDeHorasTrabajadasDeFuncionario;
        String codigoCargo;
        
        List <Funcionario> listaDeFuncionarios = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Funcionario nuevo");
            System.out.println("Digite la cédula de la persona:");
            cedulaFuncionario = sc.nextLine();
            
            System.out.println("Digite el nombre de la persona:");
            nombreFuncionario = sc.nextLine();
            
            System.out.println("Digite el apellido de la persona:");
            apellidoFuncionario = sc.nextLine();
            
            System.out.println("Digite el nombre del cargo:");
            nombreDelCargo = sc.nextLine();
            
            System.out.println("Digite el codigo del cargo:");
            codigoCargo = sc.nextLine();

            System.out.println("Digite el salario por hora del cargo:");
            salarioPorHoraDelCargo = sc.nextDouble();
            sc.nextLine();
            
            System.out.println("Digite el carné del funcionario:");
            carneDelFuncionario = sc.nextLine();
            
            
            System.out.println("Digite la cantidad de horas trabajadas del funcionario:");
            cantidadDeHorasTrabajadasDeFuncionario = sc.nextInt();
            sc.nextLine();
            
            Cargo elCargo = new Cargo(codigoCargo, nombreDelCargo, salarioPorHoraDelCargo);
            Funcionario elFuncionario = new Funcionario (carneDelFuncionario, cantidadDeHorasTrabajadasDeFuncionario, elCargo, cedulaFuncionario, nombreFuncionario, apellidoFuncionario);
            
            listaDeFuncionarios.add(elFuncionario);
            
            System.out.println("Desea agregar otro funcionario?");
            System.out.println("1. SI 2. NO");
            opcion = sc.nextInt();
            sc.nextLine(); //Despues de usar NextInt() es mejor usar un NextLine para que el scanner no se salte el siguiente input
            System.out.println("");
                    
        }while(opcion==1);
        
            System.out.println("Informacion de los funcionarios");
            
        for(Funcionario elFuncionarios : listaDeFuncionarios){
            
            
            System.out.println("Nombre: " + elFuncionarios.getNombre());
            System.out.println("Apellido: " + elFuncionarios.getApellido());
            System.out.println("Cedula: " + elFuncionarios.getCedula());
            System.out.println("Cargo y codigo del cargo: " + elFuncionarios.getElCargo().getNombreCargo() + " " + elFuncionarios.getElCargo().getCodigo());
            System.out.println("Salario por hora: " + elFuncionarios.getElCargo().getSalarioxHora());
            System.out.println("Carne del funcionario: " + elFuncionarios.getCarneDefuncionario());
            System.out.println("Salario total: " + elFuncionarios.getElCargo().getSalarioxHora()*elFuncionarios.getCantidadHorasTrabajadas());
            
        }
        
        
    }
    
}
