package com.yychatclient.control;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.yychat.model.User;

public class ClientConnect {
	
	Socket s;
	
    public ClientConnect(){
    	try {
			s=new Socket("127.0.0.1",3456);//������ַ���ز��ַ
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	  	
    }
    
public void loginValidate(User user){
	//������������󣬷��Ͷ���
	//�ֽ���������� ��װ �������������

	ObjectOutputStream oos;
	try {
        oos=new ObjectOutputStream(s.getOutputStream());
        oos.writeObject(user);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	
}
	
	
	
	public static void main(String[] args) {
		

	}

}