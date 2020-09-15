package exam;

public class Event_test {
		String minute="40";
		String second="00";
		int second1=Integer.parseInt(second);
		int minute1=Integer.parseInt(minute);
		public String lefttime(){
			String lefttime="距离考试结束还有"+"\n"+"  "+minute+" 分: "+second+" 秒";
		    return lefttime;
		}
		public void settime(){
			while(true)
				if(minute1==0&&second1==0)  
					{
					   break;
					}
				if(minute1<10){
					minute="0"+minute1;
				}
				lefttime();
				if(second1==0){
					minute1--;
					second1=60;
				}
				second1--;
				minute=""+minute1;
				if(second1>=10){
					second=""+second1;
				}
				else {
					if(second1<10)
					{
						second="0"+second1;
					}
				}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	   

}
