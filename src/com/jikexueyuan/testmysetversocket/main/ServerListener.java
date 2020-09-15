package com.jikexueyuan.testmysetversocket.main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerListener extends Thread {

	@Override
	public void run() {
		//1-65535
		try {
			ServerSocket serverSocket = new ServerSocket(12345);
			while (true) {
				Socket socket = serverSocket.accept();
				JOptionPane.showMessageDialog(null, "已经有程序连接到本机12345端口");
				ChatSocket cs = new ChatSocket(socket);
				cs.start();
				//ChatManager.getChatManager().add(cs);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
