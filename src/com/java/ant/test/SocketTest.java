package com.java.ant.test;

import com.java.ant.networking.SocketConnect;

public class SocketTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SocketConnect socketConnect = new SocketConnect();
		socketConnect.connect("127.0.0.1", 80);
	}

}
