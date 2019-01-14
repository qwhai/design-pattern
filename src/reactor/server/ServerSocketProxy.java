package reactor.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketProxy implements Runnable {

    private Thread thread;
    private Socket socket;

    public ServerSocketProxy(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String line = null;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("传输成功！");

            socket.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public void start() {
        if (null == thread) {
            thread = new Thread(this);
            thread.start();
        }
    }
}
