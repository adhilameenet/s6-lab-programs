import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(8013);
        Socket cs = null;
        while (true) {
            cs = s.accept();
            System.out.println("Client Connected");
            InputStream in = cs.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String str = br.readLine();
            System.out.println("client data is " + str);
        }
    }
}