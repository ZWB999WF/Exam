package com.jikexueyuan.testmysetversocket.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.Socket;

public class ChatSocket extends Thread {
	Socket socket;
	String username;
	public ChatSocket(Socket s){
		// this.username=username;
		 this.socket =s;
	}
//	public  ChatSocket getChatSocket() {
//		return this;
//	}
	public void out(String out) {
		try {
			socket.getOutputStream().write((out+"\n").getBytes());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("断开了一个连接");
			//ChatManager.getChatManager().remove(this);
			e.printStackTrace();
		}
	}

	public void run() {
		out("你已经连接到本服务器了");
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			String line = null;
			while ((line = br.readLine()) != null) {
				if(line.startsWith("id")){
					ChatManager.getChatManager().add(line,this);
					int size=ChatManager.getChatManager().hs.size();
					System.out.println("count of id : "+size);
					ChatManager.getChatManager().username[size-1]=line;
					for(int i=0;i<size;i++){
						System.out.println("第"+i+"个用户用户名为  "+ChatManager.getChatManager().username[i]);
					}
				 } else if(line.startsWith("send")){
					 System.out.println(line);
					 String s=line.substring(6, 11);
					 System.out.println(s+"0000");
					 ChatManager.getChatManager().sendto(s,line);
					 System.out.println("done000");
				 }
				   else if(line.startsWith("zaixian")){
					int size=ChatManager.getChatManager().hs.size();
					for(int i=0;i<size;i++){
						String zaixian=ChatManager.getChatManager().username[i];
						ChatManager.getChatManager().publish(zaixian,this);
					}
				}
				    else{
					System.out.println(line);
					ChatManager.getChatManager().publish(line,this);
				}
			}
			br.close();
			System.out.println("断开了一个连接");
			ChatManager.getChatManager().remove(this);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("断开了一个连接");
			ChatManager.getChatManager().remove(this);
			e.printStackTrace();
		}
		
	}
}
