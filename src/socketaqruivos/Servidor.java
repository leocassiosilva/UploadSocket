package socketaqruivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
            ServerSocket conexao = new ServerSocket(999); //Conexao
            System.out.println("Aguardando conexão");
            
            Socket servidor = conexao.accept(); //conexão aceita
            System.out.println("Conexão efetuada " + servidor.getInetAddress().getHostAddress()); //Apresenta quando um cliente se conecta ao servidor
            ObjectInputStream out = new ObjectInputStream(servidor.getInputStream());

            File file = new File("C:\\Users\\Leocassio\\Documents\\Projects\\newOrder.jpg"); //Adiciona a variavel file informações do caminhos e nome do arquivo

            FileOutputStream fileOutputStream = new FileOutputStream(file); //serve para escrever 

            byte[] array = new byte[4096]; //array de byte

            while (true) {//
                int len = out.read(array); //serve para realizar a leitura das informações que estão sendo enviadas 
                if (len == -1) {
                    break;
                }
                fileOutputStream.write(array, 0, len); // essa parte é responsavel pela escritado do arquivo na parte do servidor
            }
            
            //Aqui estão sendo finalizadas
            conexao.close();
            servidor.close();
            out.close();
            fileOutputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
