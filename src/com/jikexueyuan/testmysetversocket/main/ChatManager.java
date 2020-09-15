package com.jikexueyuan.testmysetversocket.main;
import java.util.HashMap;
public class ChatManager {
	
    public String username[]=new String[20];
	private ChatManager(){}
	private static final ChatManager cm = new ChatManager();
	public static ChatManager getChatManager() {
		return cm;
	}
	
	HashMap<String,ChatSocket> hs = new HashMap<String,ChatSocket>();
//	public void add(String username,ChatSocket cs) {
//		hs.put(username,cs);
//	}
	
	public void remove(ChatSocket cs) {
		hs.remove(cs);
	}
	public void sendto(String username,String out) {
		     
			ChatSocket csChatSocket = hs.get(username);
			csChatSocket.out(out);
			//if (!cs.equals(csChatSocket)) {
		   
			//}
		
	}
	public void publish(String out,ChatSocket cs) {
		for (int i = 0; i < hs.size(); i++) {
//			Set<HashMap.Entry<String,ChatSocket>> set=hs.entrySet();
//			Iterator<HashMap.Entry<String,ChatSocket>> iter=set.iterator();
			ChatSocket csChatSocket = hs.get(username[i]);
			csChatSocket.out(out);
			//if (!cs.equals(csChatSocket)) {
		   
			//}
		}
	}

	public void add(String line, ChatSocket cs) {
		// TODO Auto-generated method stub
		hs.put(line,cs);
	}
}
