package Intro2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws  Exception{
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server is started, Please start the client to connect  to the server");
        Socket socket = serverSocket.accept();

        System.out.println("connected");
        DataInputStream dOut = new DataInputStream(socket.getInputStream());
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String message = dOut.readUTF();
            System.out.println("Client: " + message);
                if(message.equalsIgnoreCase("exit"));
                break;
        }
        socket.close();
    }
}
