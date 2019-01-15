package reactor.server;

import java.net.ServerSocket;

public class Main {

    private static final int PORT = 23413;

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
