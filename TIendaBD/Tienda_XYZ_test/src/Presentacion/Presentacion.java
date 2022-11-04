package Presentacion;

import Entidades.Articulo;
import Entidades.Cliente;
import Entidades.Vendedor;
import Entidades.Venta;
import Logica.Logica;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkContrastIJTheme;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Presentacion extends javax.swing.JFrame {

    public Presentacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblCedulaC = new javax.swing.JLabel();
        lblNombreC = new javax.swing.JLabel();
        lblCodigoC = new javax.swing.JLabel();
        txtCedulaC = new javax.swing.JTextField();
        txtNombreC = new javax.swing.JTextField();
        txtCodigoC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedulaV = new javax.swing.JTextField();
        txtNombreV = new javax.swing.JTextField();
        txtCodigoV = new javax.swing.JTextField();
        lblCedulaV = new javax.swing.JLabel();
        lblNombreV = new javax.swing.JLabel();
        lblCodigoV = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnEstadistica = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCedulaC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedulaC.setText("Cédula");
        jPanel2.add(lblCedulaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        lblNombreC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreC.setText("Nombre");
        jPanel2.add(lblNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        lblCodigoC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoC.setText("Código de cliente");
        jPanel2.add(lblCodigoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));
        jPanel2.add(txtCedulaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 152, -1));
        jPanel2.add(txtNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 152, -1));

        txtCodigoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 152, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("Informacion cliente");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setText("Informacion vendedor");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, -1, -1));
        jPanel2.add(txtCedulaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 179, -1));
        jPanel2.add(txtNombreV, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 179, -1));
        jPanel2.add(txtCodigoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 179, -1));

        lblCedulaV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedulaV.setText("Cédula");
        jPanel2.add(lblCedulaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 120, -1, -1));

        lblNombreV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreV.setText("Nombre");
        jPanel2.add(lblNombreV, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, -1, -1));

        lblCodigoV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoV.setText("Código de vendedor");
        jPanel2.add(lblCodigoV, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 660, -1, -1));

        btnRefrescar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRefrescar.setText("Refrescar tabla");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 720, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("Articulo vendido");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Marca");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));
        jPanel2.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 152, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Descripción");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Precio");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, -1, -1));
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, 152, -1));

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo cliente", "Cedula cliente", "Nombre cliente", "Codigo vendedor", "Cedula vendedor", "Nombre vendedor", "Marca del articulo", "Descripcion", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblInfo);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 620, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtDescripcion.setColumns(20);
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        txtDescripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 152, -1));

        btnEstadistica.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEstadistica.setText("Estadística");
        btnEstadistica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticaActionPerformed(evt);
            }
        });
        jPanel2.add(btnEstadistica, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 780, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tienda_XYZ_test/src/img/DALL_E_2022-08-19_17.47.12_-_orange_logo_for_a_store_named_XYZ__1_-removebg-preview.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 260, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoCActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtCedulaC.getText().isEmpty() || txtNombreC.getText().isEmpty() || txtCodigoC.getText().isEmpty() || txtCedulaV.getText().isEmpty() //Verifica que todos los campos estén llenos en el formulario
                || txtNombreV.getText().isEmpty() || txtCodigoV.getText().isEmpty() || txtMarca.getText().isEmpty()
                || txtDescripcion.getText().isEmpty() || txtPrecio.getText().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos", "Datos Faltantes", JOptionPane.WARNING_MESSAGE);//Si hay alguno vacío, indica al usuario el error
            
        } else { //Si todo está lleno, empieza creando los objetos

            Cliente elCliente = new Cliente();//Crea el objeto Cliente
            elCliente.setCedula(txtCedulaC.getText());//Guarda info desde los cuadros de texto en cada atributo
            elCliente.setNombre(txtNombreC.getText());
            elCliente.setCodigoCliente(txtCodigoC.getText());

            Vendedor elVendedor = new Vendedor();
            elVendedor.setCedula(txtCedulaV.getText());
            elVendedor.setNombre(txtNombreV.getText());
            elVendedor.setCodigoVendedor(txtCodigoV.getText());

            Articulo elArticulo = new Articulo();
            elArticulo.setDescripcion(txtDescripcion.getText());
            elArticulo.setMarca(txtMarca.getText());
            elArticulo.setPrecio(Double.parseDouble(txtPrecio.getText()));

            Venta laVenta = new Venta();//Crea la venta y guarda los otros 3 objetos.
            laVenta.setElArticulo(elArticulo);
            laVenta.setElCliente(elCliente);
            laVenta.setElVendedor(elVendedor);

            Logica logica = new Logica();
            boolean resultado;
            resultado = logica.ValidarLogica(laVenta); //Se guardo la informacion proveniente del método ValidarLogica en la variable. ValidarLogica devuelve booleano.

            if (resultado) {//Valida que haya información en Venta (Venta se utilizó como registro). Si hay información, ValidarLogica devuelve true.
                JOptionPane.showMessageDialog(null, "¡Los datos se guardaron correctamente!", "Guardado de datos exitoso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al guardar los datos", "Error al guardado de datos", JOptionPane.WARNING_MESSAGE);
            }
            this.limpiarCampos();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private TableModel CompletarTableModel() {//metodo para completar la tabla

        try {
            Logica laCapaDeLogica = new Logica();
            List<Venta> miListaDeVentas = laCapaDeLogica.extraerVentas(); //crea lista y guarda la lista que viene desde el metodo de logica
            Object[] columnas = new Object[]{"Codigo cliente", "Cedula cliente", "Nombre cliente", "Codigo vendedor", "Cedula vendedor", "Nombre vendedor", "Marca del articulo", "Descripcion", "Precio"};//arreglo para ir guardando la informacion de cada columna
            Object[][] datos = new Object[miListaDeVentas.size()][columnas.length];//arreglo doble donde el primer campo es la fila y el segundo la columna
            for (int i = 0; i < miListaDeVentas.size(); i++) {//loop que recorre toda la lista y va guardando en cada columna de la tabla la información. EJ: datos[3][2] guarda en la tercera fila, tercera columna

                datos[i][0] = miListaDeVentas.get(i).getElCliente().getCodigoCliente();
                datos[i][1] = miListaDeVentas.get(i).getElCliente().getCedula();
                datos[i][2] = miListaDeVentas.get(i).getElCliente().getNombre();
                datos[i][3] = miListaDeVentas.get(i).getElVendedor().getCodigoVendedor();
                datos[i][4] = miListaDeVentas.get(i).getElVendedor().getCedula();
                datos[i][5] = miListaDeVentas.get(i).getElVendedor().getNombre();
                datos[i][6] = miListaDeVentas.get(i).getElArticulo().getMarca();
                datos[i][7] = miListaDeVentas.get(i).getElArticulo().getDescripcion();
                datos[i][8] = miListaDeVentas.get(i).getElArticulo().getPrecio();

            }

            DefaultTableModel model = new DefaultTableModel(datos, columnas);
            return model;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "La tabla no se cargo correctamente", null, 1);
        }
        return null;

    }

    private void RefrescarTabla() {
        TableModel tableModel = this.CompletarTableModel(); //Llama el método para llenar la tabla
        tblInfo.setModel(tableModel); //indica cual es la tabla que tenemos que llenar (tblInfo)

    }


    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed

        this.RefrescarTabla();//llama el metodo al clickear el boton btnRefrescar


    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void btnEstadisticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticaActionPerformed

        Logica Logica = new Logica();//Se instancia la logica
        Logica.Calculos();//Se llama el metodo calculos
        double total = Logica.getTotal();//Se obtiene el total con el metodo getTotal
        double promedio = Logica.getPromedio();//Se obtiene el promedio con el metodo getPromedio

        JOptionPane.showMessageDialog(null, "El total de ventas es " + total + "\n El promedio de las ventas es de " + promedio, "Resumen de estadística", JOptionPane.INFORMATION_MESSAGE);//Mensaje que enseña los resultados de los calculos
    }//GEN-LAST:event_btnEstadisticaActionPerformed

    public void limpiarCampos(){
        txtCedulaC.setText("");
        txtCedulaV.setText("");
        txtCodigoC.setText("");
        txtCodigoV.setText("");
        txtDescripcion.setText("");
        txtMarca.setText("");
        txtNombreC.setText("");
        txtNombreV.setText("");
        txtPrecio.setText("");
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            FlatDarkPurpleIJTheme.setup();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadistica;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCedulaC;
    private javax.swing.JLabel lblCedulaV;
    private javax.swing.JLabel lblCodigoC;
    private javax.swing.JLabel lblCodigoV;
    private javax.swing.JLabel lblNombreC;
    private javax.swing.JLabel lblNombreV;
    private javax.swing.JTable tblInfo;
    private javax.swing.JTextField txtCedulaC;
    private javax.swing.JTextField txtCedulaV;
    private javax.swing.JTextField txtCodigoC;
    private javax.swing.JTextField txtCodigoV;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtNombreV;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
