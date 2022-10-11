package Intro;
import java.io.*;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) throws Exception {
//        String ip = "localhost";
//        int port = 9999;
//        Socket socket = new Socket(ip,port);
//         String name = "Abraham Ekene-onwon Hanson";
//
//        OutputStreamWriter os = new OutputStreamWriter(socket.getOutputStream());
//        PrintWriter out = new PrintWriter(os);
//        out.println(name);
//        os.flush();
//
//    }
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
