package Intro2;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
        public static void main(String[] args) throws  Exception{
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

