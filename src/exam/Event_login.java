package exam;
import java.sql.ResultSet;
import java.sql.SQLException;



import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
	public class Event_login extends JFrame{
		
		public static boolean check(String tablename,String id,String psd){
			Getconnection getconn=new Getconnection();
			java.sql.Connection conn=getconn.getconn();
			ResultSet rs=getconn.getRs("select * from "+tablename);
			boolean  check=false;
			try {
				String id1,psd1;
				while(rs.next()){
					id1= rs.getString("id");
					psd1 = rs.getString("psd");
					// System.out.println(id+pas); 
					if(id.equals(id1)&&psd.equals(psd1))
					{
						check=true;
						break;
					}
				}
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				rs.close();
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return check;
		}
		public void select_tea(String id,String psd)
		{
			if(check("user_tea",id,psd))
			{JOptionPane.showMessageDialog(null, "登录成功", "成功",
					JOptionPane.INFORMATION_MESSAGE);
			Tea_main tea_main = new Tea_main();
			tea_main.setTitle("欢迎"+id+"老师登陆");
			tea_main.login_id=id;
			tea_main.setVisible(true);
			dispose();
			}
			else {JOptionPane.showMessageDialog(null, "用户名或密码错误", "提示",
					JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		 public void select_stu(String id,String psd)
		{  
			if(check("user_stu",id,psd))
			{JOptionPane.showMessageDialog(null, "登录成功", "成功",
					JOptionPane.INFORMATION_MESSAGE);

			Stu_main stu_main = new Stu_main();
			stu_main.setTitle("欢迎"+id+"同学登陆");
			stu_main.login_id=id;
			stu_main.label_id.setText(id);
			stu_main.setVisible(true);
			dispose();
			}
			else {JOptionPane.showMessageDialog(null, "用户名或密码错误", "提示",
					JOptionPane.INFORMATION_MESSAGE);
			}
		}
	
}
