import java.io.IOException;
import java.net.*;

public class Server{

    private ServerSocket serverSocket;

    public Server(ServerSocket serverSocket){
        this.serverSocket = serverSocket;
    }

    public void startServer(){
        try {

            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                // System.out.println("Klien baru terhubung!");
                ClientHandler clientHandler = new ClientHandler(socket);

                Thread thread = new Thread(clientHandler);
                thread.start();
            }

        } catch (IOException e){

        }
    }

    public void closeServerSocket(){
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(6789);
        Server server = new Server(serverSocket);
        server.startServer();
    }

}