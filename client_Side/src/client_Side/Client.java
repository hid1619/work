package client_Side;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket sket = new Socket("localhost", 2727); // connect
		System.out.println("conneted...");
		
		DataInputStream dis = new DataInputStream(sket.getInputStream());
		System.out.println(dis.readUTF()); // doc tu sv
		
		DataOutputStream dos = new DataOutputStream(sket.getOutputStream());
		String str = "Data 2 ...";
		dos.writeUTF(str); // truyen toi sv
		
		sket.close();
	}
}
