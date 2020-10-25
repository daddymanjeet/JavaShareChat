package shareChat;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class forReceiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ServerSocket ss=new ServerSocket(76); // here number 76 is for verification, it must be same as the the number given by the sender. 
			Socket s=ss.accept();
			DataInputStream dis=new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF());
			dis.close();
			s.close();
			ss.close();
		}catch(Exception e){}

	}

}
