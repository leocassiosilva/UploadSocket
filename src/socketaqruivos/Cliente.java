package socketaqruivos;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Leocassio
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            Socket conexao = new Socket("localhost", 5555);
            System.out.println("Conexao efetuada");
            conexao.close();
            JFileChooser fileChooser = new JFileChooser();
            int opt = fileChooser.showOpenDialog(null);
            
            if (opt == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                System.out.println(file);
            }
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
