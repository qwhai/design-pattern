## Reactor

### Classic TCP Coding

1. 服务端
```java
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
```

```java
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
```

2. 客户端
```java
public class Main {

    private static final String DOMAIN = "127.0.0.1";
    private static final int PORT = 23413;

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Hello Reactor Client.");

        Socket socket = new Socket(DOMAIN, PORT);

        String data = "";
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
```

### Base Reactor (Single Thread)

