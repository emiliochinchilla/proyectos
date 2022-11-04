package AccesoDatos;

import Entidades.Articulo;
import Entidades.Cliente;
import Entidades.Vendedor;
import Entidades.Venta;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class AccesoDatos {
    

//En la base de datos se manejan 4 tablas separadas, por lo tanto, tenemos 4 métodos distintos para enviar información para cada una de las tablas
//Metodos para cliente, articulo y vendedor son muy parecidos, solo cambia la información y donde guarda.    
    public boolean InsertarCliente(Venta venta) {//recibe información de la clase Venta

        try {

            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdproyecto", "root", "");//String de conexión con BD

            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("insert into cliente values (?,?,?,?)");//String sql inserta 4 valores en la tabla cliente

            sentencia.setString(1, "0");//Se guarda la información en el mismo orden que tiene la tabla de la BD
            sentencia.setString(2, venta.getElCliente().getCodigoCliente());
            sentencia.setString(3, venta.getElCliente().getCedula());
            sentencia.setString(4, venta.getElCliente().getNombre());
            


            sentencia.executeUpdate();//Se ejecuta la sentencia
           
            return true;//Devuelve true para validar en capaLogica que se haya guardado correctamente
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos insertarCliente", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }
    
    
    public boolean InsertarArticulo(Venta venta) {

        try {

            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdproyecto", "root", "");

            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("insert into articulo values (?,?,?,?)");

            sentencia.setString(1, "0");
            sentencia.setString(2, venta.getElArticulo().getMarca());
            sentencia.setString(3, venta.getElArticulo().getDescripcion());
            sentencia.setString(4, venta.getElArticulo().getPrecio().toString());
            
            sentencia.executeUpdate();

           
            return true;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos Articulo", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }
    
    
    public boolean InsertarVendedor(Venta venta) {

        try {

            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdproyecto", "root", "");

            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("insert into vendedor values (?,?,?,?)");

            sentencia.setString(1, "0");
            sentencia.setString(2, venta.getElVendedor().getCodigoVendedor());
            sentencia.setString(3, venta.getElVendedor().getNombre());
            sentencia.setString(4, venta.getElVendedor().getCedula());
            

            sentencia.executeUpdate();

            return true;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos Venta", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public boolean InsertarVenta(Venta venta) { //Ese metodo tiene que correr después que los métodos para los otros objetos. 
        //primero extrae el id de la BD desde cada una de las tablas y las guarda en un rs. Después guarda los id en la tabla "venta"

        try {

            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdproyecto", "root", "");
            Statement stmt = cn.createStatement();//Se crean 3 statements porque cada rs va a tener información diferente
            Statement stmt1 = cn.createStatement();
            Statement stmt2 = cn.createStatement();
            
            
            PreparedStatement sentencia2 = (PreparedStatement) cn.prepareStatement("insert into venta values (?,?,?,?)");
            
            ResultSet rs = stmt.executeQuery("select max(id) as idArticulo FROM articulo");//Al ser incremental, maximo id siempre es el ultimo guardado
            rs.next(); 
            sentencia2.setString(1, "0");//primary key de venta
            sentencia2.setString(2, rs.getString("idArticulo"));//foreign key 
            
            ResultSet rs1 = stmt1.executeQuery("select max(id) as idVendedor FROM vendedor");
            rs1.next();
            sentencia2.setString(4, rs1.getString("idVendedor"));//foreign key 
            
            ResultSet rs2 = stmt2.executeQuery("select max(id) as idCliente FROM cliente");
            rs2.next();
            sentencia2.setString(3, rs2.getString("idCliente"));//foreign key 
            
                                   
            sentencia2.executeUpdate();//ejecuta la sentencia
           
            return true;//Devuelve true para validar en capaLogica que se haya guardado correctamente
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos Venta", "Error de base de datos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public List<Venta> extraerVentas(){//Extrae todas las ventas(registros) de BD y las devuelve como lista de tipo Venta
        
        try {
            
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdproyecto", "root", "");
            //String sql para hacer un Inner Join. Une las tablas vendedor, cliente y articulo con la tabla venta y trae todos los registros en los que coincidan los id de la tabla Venta con cada uno de los id primarios de cada tabla
            PreparedStatement sentencia = (PreparedStatement) cn.prepareStatement("SELECT * FROM venta INNER JOIN cliente ON venta.idCliente = cliente.id INNER JOIN vendedor ON venta.idVendedor = vendedor.id INNER JOIN articulo ON venta.idArticulo = articulo.id");//innerjoin
            ResultSet rs = sentencia.executeQuery();//Se guardan todos los registros en rs
            
            List<Venta>listaVentas = new ArrayList();//Lista para guardar todas las ventas
            Venta ventaAEnlistar = new Venta();//Objeto para guardar cada una de las ventas
            ventaAEnlistar = null;
            
            while (rs.next()) { //loop para ir creando cada uno de los objetos e ir guardando toda la información proveniente de las tablas                
                
                ventaAEnlistar = new Venta();
                Articulo elArticulo = new Articulo();
                Cliente elCliente = new Cliente();
                Vendedor elVendedor = new Vendedor();
                
                elArticulo.setDescripcion(rs.getString("descripcion"));
                elArticulo.setMarca(rs.getString("marca"));
                elArticulo.setPrecio(Double.parseDouble(rs.getString("precio")));
                
                elCliente.setCedula(rs.getString("cedulaC"));
                elCliente.setNombre(rs.getString("nombreC"));
                elCliente.setCodigoCliente(rs.getString("codigoCliente"));
                
                elVendedor.setCedula(rs.getString("cedulaV"));
                elVendedor.setNombre(rs.getString("nombreV"));
                elVendedor.setCodigoVendedor(rs.getString("codigoVendedor"));
                
                ventaAEnlistar.setElArticulo(elArticulo);
                ventaAEnlistar.setElCliente(elCliente);
                ventaAEnlistar.setElVendedor(elVendedor);
                
                listaVentas.add(ventaAEnlistar);//Se agrega cada venta a la lista
                
            }
            
            
            
            
            return listaVentas;//devuelve la lista para ser utilizada en Logica
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error a nivel de base de datos. Extraer registros", "Error de base de datos", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

   
    
    
}
