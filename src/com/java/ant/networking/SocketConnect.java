package com.java.ant.networking;

import java.io.IOException;
import java.net.Socket;

public class SocketConnect {
	
	/*
	 * Make it interactive, i.e, keep the socket open for certain time
	 * and then close it
	 */
	public void connect(String ipAddress, int port) {
		try {
			Socket socket = new Socket(ipAddress, port);
			if (socket.isConnected()) {
				System.out.println("Successfully connected to the socket");
			}
		} catch (IOException e) {
			System.out.printf("Unable to connect to (%s:%d), reason : %s", ipAddress, port, e.getLocalizedMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}
}
