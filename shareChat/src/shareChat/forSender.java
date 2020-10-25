package shareChat;
import java.io.*;
import java.net.Socket;

public class forSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Socket s=new Socket("192.168.43.103",76); //here number 76 is work as verification for the receiver(it can be any number as you wish).
			DataOutputStream dos=new DataOutputStream(s.getOutputStream());
			dos.writeUTF("this is the message that i want to send to the receiver.");
			dos.flush();
			dos.close();
			s.close();			
		}catch(Exception e){}

	}

}
