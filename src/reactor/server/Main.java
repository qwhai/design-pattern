package reactor.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    private static final int PORT = 10004;

    public static void main(String[] args) throws Exception {

        System.out.println("Hello Reactor Server.");

        ServerSocket server = new ServerSocket(PORT);

        boolean stop = false;
        while (!stop) {
            new ServerSocketProxy(server.accept()).start();
        }

        server.close();
    }
}
