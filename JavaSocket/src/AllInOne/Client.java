package AllInOne;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
public class Client {
    static Socket socket;
    BufferedReader br;
    DataOutputStream dOut;

     public Client() throws Exception {
         client();
    }
    public static void client() throws  Exception{
        System.out.println("Client is started");
        Socket socket = new Socket("localhost",9999);
        DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String so = br.readLine();
            dOut.writeUTF(so);
            if(so.equalsIgnoreCase("exit"));
            break;
        }
        socket.close();
    }
}


