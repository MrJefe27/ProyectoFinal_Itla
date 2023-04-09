package BDConection;
//Christopher Peguero / 2022-1024

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {  
    public static Connection getConnection(){
        Connection con = null;
        try {                
                String url = "jdbc:mysql://db4free.net:3306/grupo_itla";
                String username = "cpeguero1024";
                String password = "itla_1024";
    
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,username,password);
                System.out.println("Conectado a la base de datos");           
              
	} catch (ClassNotFoundException | SQLException e) {
                    System.out.println("Conexion no establecida");
		}
                return con;
    }
}       
   
    //Metodo main para confirmar la conexion a la base de datos
    /*
        class main{
        public static void main(String[]args){
            Connection con = Conexion.getConnection();
            if(con != null){
                System.out.println("Conexion establecida");
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexion");
                }
            } else {
                System.out.println("Conexion no establecida");
            }

        }

    }
    */

    