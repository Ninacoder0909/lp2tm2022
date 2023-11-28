package prgs;

//import formularios.menuprincipal;
//import formularios.acceso;
import formularios.acceso;
import java.sql.*;
import javax.swing.*;

public class conexion
{
    public static String poreljar = "si";
     
    //public String user = "userlp2";
    //public String pass = "123";
    //public String bd   = "lp2";
    
    public String user = acceso.vuser;
    public String pass = acceso.vpas;
    public String bd   = acceso.vbd;
    
    
    /////los nuevos
    public final String host = "jdbc:mysql://"+acceso.vhost+"/";
    public Connection conexion = null; //el mas importante
    
    public Statement sentencia;
    public ResultSet resultado;
    ////
    public conexion()// constructor
    {
        try  // todo bien if 
        {
            Class.forName("com.mysql.jdbc.Driver");//Se registra el Driver jdbc de MySQL
            conexion = DriverManager.getConnection(host+bd,user,pass);
            
             if(poreljar.equals("si"))
             { 
                  JOptionPane.showMessageDialog(null, "YA ESTAS CONECTADO  A LA BASE DE DATOS","Bienvenidos",JOptionPane.INFORMATION_MESSAGE);                        
                                
                  poreljar= "no";          
             }
             
             
           
                //
                // SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceSteelBlueTheme");           
               // SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceLatchWatermark");     
       
              
          //sentencia = conexion.createStatement(); 
         /// resultado = sentencia.executeQuery("SELECT * from pais");
       
          
          // while(resultado.next()==true)
           //{
              // System.out.print(resultado.getString("pai_cod")+"-");
              // System.out.println(resultado.getString("pai_descri"));         
       ///   } // fin mientras
            
   // sentencia.executeUpdate("insert into pais(pai_cod,pai_descri) values(6,'desdeapp')");
     //sentencia.executeUpdate("delete from  pais where  pai_cod= 6");
      //sentencia.executeUpdate("update pais set pai_descri= 'xxxx' where pai_cod = 5");

            
        }//fin todo bien
         catch (Exception e) // error de conexion else
        {
             JOptionPane.showMessageDialog(null, "Problemas con la Sintaxis SQL o Parametros de Conexion" , "Verifiquelo",JOptionPane.INFORMATION_MESSAGE);
             System.exit(0);//salir
        }
    }//fin del constructor

    public static void main(String[] args) // programa principal
    {
		new conexion();// llama al constructor
    }
 }




