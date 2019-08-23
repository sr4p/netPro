import java.net.*;
import java.io.*;
public class server {
    public static void main(String[] args) throws IOException{
    	System.out.println("Waiting connect client..... ");
    	int port = 3333;
        ServerSocket ss = new ServerSocket(port);
        Socket s = ss.accept();

        System.out.println("********* Client Connect **********");
	System.out.println("Waiting data from client..... ");
        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String word = br.readLine();
        System.out.println("text from client : "+ word);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println(word);
        pr.flush();
        pr.close();
	System.out.print("********* Finish **********");
		
    }
}