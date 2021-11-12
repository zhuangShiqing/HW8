package Test_p31_51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_p47 {
	public static void main(String[] args)throws IOException{
		Car47 car1;
		car1=new Car47();
		car1.show();
		
		System.out.println("請設定車號");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		System.out.println("請設定汽油量");
		String str2=br.readLine();
		
		int number=Integer.parseInt(str1);
		double gasoline=Double.parseDouble(str2);
		car1.setCar(number, gasoline);
		System.out.println("請為車子取名字");
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
		name="尚未取名";
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	public void setName(String nm) {
		name=nm;
		System.out.println("汽車名稱設為"+name);
	}
	public void show() {
		System.out.println("--------------------------");
		System.out.println("汽車名:"+this.name);
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
		System.out.println("--------------------------");
	}
}