package Test_p31_51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_p47 {
	public static void main(String[] args)throws IOException{
		Car47 car1;
		car1=new Car47();
		car1.show();
		
		System.out.println("�г]�w����");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		System.out.println("�г]�w�T�o�q");
		String str2=br.readLine();
		
		int number=Integer.parseInt(str1);
		double gasoline=Double.parseDouble(str2);
		car1.setCar(number, gasoline);
		System.out.println("�Ь����l���W�r");
		String str3=br.readLine();
		car1.setName(str3);
		car1.show();
	}
}
class Car47{
	private int num;
	private double gas;
	private String name;
	
	public Car47() {
		num=0;
		gas=0.0;
		name="�|�����W";
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	public void setName(String nm) {
		name=nm;
		System.out.println("�T���W�ٳ]��"+name);
	}
	public void show() {
		System.out.println("--------------------------");
		System.out.println("�T���W:"+this.name);
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
		System.out.println("--------------------------");
	}
}