package socketaqruivos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leocassio
 */
public class Servidor {

    public static void main(String[] args) {

        try {
            ServerSocket servidor = new ServerSocket(5555);
            Socket socket;

            System.out.println("Servidor on!");
            Socket conexao = servidor.accept();

            System.out.println("Conexão efetuada " + conexao.getInetAddress().getHostAddress());
            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
