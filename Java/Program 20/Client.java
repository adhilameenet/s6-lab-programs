import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args) throws Exception {
        Socket cs = new Socket("127.0.0.1", 8013);
        OutputStream out = cs.getOutputStream();
        PrintWriter p = new PrintWriter(out, true);
        System.out.println("Networking");
        p.println("Hello ...");
        System.out.println("Message Sent");
    }
}