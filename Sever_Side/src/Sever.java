import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	public static void main(String[] args) throws IOException {
		System.out.println("Waiting client...");
//=================================================================	
//		ServerSocket svSocket = new ServerSocket(2727);
//		Socket sket = svSocket.accept(); // chap nhan socket

//		DataOutputStream dos = new DataOutputStream(sket.getOutputStream());
//		String str = "Data 1 ...";
//		dos.writeUTF(str); // truyen toi client
//
//		System.out.println("client connected");
//
//		DataInputStream dis = new DataInputStream(sket.getInputStream());
//		System.out.println(dis.readUTF()); // doc tu client
//		dos.close();
//		sket.close();
//		svSocket.close();
//=================================================================
//		ServerSocket svSocket = new ServerSocket(2727);
//		int i = 0;
//		while (true) {
//			Socket sket = svSocket.accept();
//			DataOutputStream dos = new DataOutputStream(sket.getOutputStream());
//			String str = "Dataaaa...";
//
//			dos.writeUTF(str);
//
//			System.out.println("client connected ");
//		}
//=================================================================		
//		ServerSocket svSocket = new ServerSocket(2727);
//		int i = 0;
//		while (true) {
//			Socket sket = svSocket.accept();
//			DataOutputStream dos = new DataOutputStream(sket.getOutputStream());
//			for (int j = 0; j < 10; j++) {
//				dos.writeUTF(" " + j);
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}
//=================================================================		
		ServerSocket svSocket = new ServerSocket(2727);
		int i = 0;
		while(true) {
			Socket sket = svSocket.accept();
			DataOutputStream dos = new DataOutputStream(sket.getOutputStream());
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for (int j = 0; j < 30; j++) {
						
						try {
							try {
								dos.writeUTF(" " + j);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				}
			}).start();
			
		}
		}
		

}
