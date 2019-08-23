import java.net.*;
import java.io.*;
import java.util.Base64;

public class client2 {
    public static void main(String[] args) throws IOException{
        int port = 3333;
        Socket s = new Socket("localhost",port);

        File file = new File("TU44.jpg");
        FileInputStream img = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        img.read(data);
        String b64 = Base64.getEncoder().encodeToString(data);
        System.out.println("Encode file name => "+file+" to server.");

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println(b64);
        pr.flush();

	 System.out.println("******* Finish *******");

	}
}
