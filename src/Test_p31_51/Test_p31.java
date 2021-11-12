package Test_p31_51;
//類別功能
//類別變數和類別方法
public class Test_p31 {
	//main也是一種類別方法，透過加上static void修飾子形成
	public static void main(String[] args) {
		//不需要建立物件->Car 類別名稱->類別名稱=new Car();
		//呼叫類別方法
		Car.showsum();
		
		Car car1;
		car1=new Car();
		car1.setCar(454,99.7);
		Car.showsum();
		
		Car car2;
		car2=new Car();
		car2.setCar(4566,7.8);
		Car.showsum();
	}
}
class Car{
	//類別變數
	public static int sum=0;
	
	private int num;
	private double gas;
	//建構子->初始化
	public Car() {
		num=0;
		gas=0.0;
		sum++;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
	//類別方法
	public static void showsum() {
		System.out.println("車子總共有"+sum+"台");
	}
	public void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
	
}
