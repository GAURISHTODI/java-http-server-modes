
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server{

    public void run() throws IOException, UnknownHostException{


        int port =8090;//this is main port
        ServerSocket socket = new ServerSocket(port);//socket opend on this port
        socket.setSoTimeout(40000);//port 10s bad khaali ho jaega
        while(true){
            System.out.println("Server is listening on port: "+ port);
            Socket acceptedConnection= socket.accept();
            System.out.println("Connection accepted from client"+ acceptedConnection.getRemoteSocketAddress());
            PrintWriter toCient = new PrintWriter(acceptedConnection.getOutputStream(), true);
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
            toCient.println("Hello from server ");

            toCient.close();
            fromClient.close();
            socket.close();
            
        }

    }

    public static void main(String[] args)
    {   

        try {
            Server server= new Server();
            server.run();
            
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}