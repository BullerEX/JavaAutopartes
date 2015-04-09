
package ConectioDB;
/**
 * you mama.
 */

import java.sql.*;
import javax.swing.JOptionPane;
 /**
 *Clase encargada de la conexion a la base de datos
 * @author Felipe Cardona
 * @author Alexander Orlas
 * @author Angelo Rodriguez
 *  

 */
public class Conxiondb {

    public String db = "Autopartes.sqlite";

    public String url = "jdbc:sqlite:" + db;

    public String user = "root";

    public String pass = "";

    public Connection Conectar() {

        Connection Link = null;

        try {
            Class.forName("org.sqlite.JDBC");
            Link = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return Link;
    }
 /**
  * @param user bla bla bla bla
  */
    
    public void mostrar(){
        System.out.println("#");
    }
  
}

// Conxiondb sqlite = new Conxiondb ();
//java.sql.Connection cn= sqlite.Conectar();
