
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {


    public void run() throws  IOException,UnknownHostException{
        int port= 8090;
        InetAddress address = InetAddress.getByName("localhost");//my machine's IP address
        Socket socket = new Socket(address, port);
        PrintWriter toServer= new PrintWriter(socket.getOutputStream(), true);
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        toServer.println("Hello from the client side!");
        String line = fromServer.readLine();//taking whatever is coming from server
        System.out.println("Response from the line is:"+ line);
        toServer.close();
        fromServer.close();
        socket.close();

    }


    public static void main(String[] args) {
        try {
            Client singlethreadedWebClient_server= new Client();
            singlethreadedWebClient_server.run();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
