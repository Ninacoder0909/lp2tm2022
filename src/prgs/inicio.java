package prgs;

import formularios.*;
import org.jvnet.substance.SubstanceLookAndFeel;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class inicio 
{ 
    public static void main(String[] args) 
    {  
            menuprincipal.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MistAquaSkin"); //GreenMagic
            SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceAquaTheme");
            SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceBubblesWatermark");
            
            //new acceso().setVisible(true);
            new Thread(new Splash()).start();    
     }
    
     public static String inicial = "si";
}
