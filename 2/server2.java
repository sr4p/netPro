import java.net.*;
import java.io.*;
import java.util.Base64;

public class server2 {
    public static void main(String[] args) throws IOException{
	System.out.println("Waiting data from client..... ");
    	int port = 3333;
        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String b64 = br.readLine();
        String decode = "Decode.jpg";
        FileOutputStream imageOutFile = new FileOutputStream(decode);
        byte[] bytedata = Base64.getDecoder().decode(b64);
        imageOutFile.write(bytedata);
        System.out.println("Encode file name => "+decode+" from client.");
	System.out.print("********* Finish **********");
    }
}