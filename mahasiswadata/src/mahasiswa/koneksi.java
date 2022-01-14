package mahasiswa;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection koneksi;
    
     public static Connection getKoneksi() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/db_siswa";
            String user = "root";
            String pass = "";
            
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass);
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "koneksi gagal");
            }
        return koneksi;
     } 
        
    }
    