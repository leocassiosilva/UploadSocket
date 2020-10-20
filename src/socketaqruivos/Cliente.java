package socketaqruivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leocassio
 */
public class Cliente {

    public static void main(String[] args) {
        try {
            Socket conexao = new Socket("localhost", 999); //estabelecer a conexao
            System.out.println("Conectado!");

            ObjectOutputStream out = new ObjectOutputStream(conexao.getOutputStream());//serve para enviar/escrevr 

            File file = new File("C:\\z\\resolução-4k.jpg"); //colocar na variavel file o cainho e arquivo

            FileInputStream fileInputStream = new FileInputStream(file);//ler os dados 

            System.out.println(file.length()); //informa o tamanho do arquivo

            byte[] array = new byte[4096]; //array de byte

            while (true) {
                int len = fileInputStream.read(array);//leitura 
                if (len == -1) {
                    break;
                }
                out.write(array, 0, len);//escrita
            }

            System.out.println("Enviado para o servidor!"); 
            //Finalizando
            conexao.close();
            fileInputStream.close();
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
