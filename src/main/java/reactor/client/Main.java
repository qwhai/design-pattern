package reactor.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    private static final String DOMAIN = "127.0.0.1";
    private static final int PORT = 23413;

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Hello Reactor Client.");

        Socket socket = new Socket(DOMAIN, PORT);

        String data;
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        while (!(data = input.nextLine()).equalsIgnoreCase("eof")){
            out.write(data);
            out.newLine();
            out.flush();
        }

        socket.shutdownOutput();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String str = in.readLine();
        System.out.println(str);

        socket.close();
    }
}
