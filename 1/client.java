import java.net.*;
import java.io.*;
import java.util.Scanner;
public class client {
    public static void main(String[] args) throws IOException{
    	Scanner kb = new Scanner(System.in);
    	int port = 3333;
        Socket s = new Socket("localhost",port);
    
	System.out.print("Input text from keyboard : ");
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        String word = kb.next();
        pr.println(word);
        kb.close();
        pr.flush();
        
	System.out.println("******* Send data finish *******");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String wordSv = br.readLine();
        System.out.println("Disply text => "+ wordSv);
	
    }
}
