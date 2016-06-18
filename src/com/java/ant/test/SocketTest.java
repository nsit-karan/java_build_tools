package com.java.ant.test;

import com.java.ant.networking.SocketConnect;

public class SocketTest {
	
	
	public void testSocketConnect() {
		SocketConnect socketConnect = new SocketConnect();
		socketConnect.connect("127.0.0.1", 80);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Dummy main func");
	}

}
