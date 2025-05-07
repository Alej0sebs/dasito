package practicarprueba;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.sql.Connection;

public class mitabla extends JTable {

    public mitabla() {
        super();
        cargarDatos();
    }

    private void cargarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cédula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");

        try {
            Connection con = Conexion.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM estudiantes");

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("cedulaEst"),
                    rs.getString("nombreEst"),
                    rs.getString("apellidoEst"),
                    rs.getString("DireccionEst"),
                    rs.getInt("TelefonoEst")
                };
                modelo.addRow(fila);
            }

            this.setModel(modelo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
