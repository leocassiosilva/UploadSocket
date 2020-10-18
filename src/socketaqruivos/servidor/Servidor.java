package socketaqruivos.servidor;

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
            ServerSocket serverSocket;
            Socket socket;
            serverSocket = new ServerSocket(5555);
            System.out.println("Servidor on!");

            
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
