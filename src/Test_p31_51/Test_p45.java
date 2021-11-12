package Test_p31_51;
//類別型態的變數
public class Test_p45 {
	public static void main(String[] args){
		System.out.println("宣告car1");
		Car45 car1;
		car1=new Car45();
		car1.setCar(34555, 46.5);
		
		System.out.println("宣告car2");
		Car45 car2;
		car2=new Car45();
		car2.setCar(55556, 33.4);
		
		System.out.println("將car1指定給car2");
		car2=car1;
		System.out.println("car1的");
		car1.show();
		System.out.println("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		car1.setCar(1111, 11.1);
		System.out.println("car1的");
		car1.show();
		System.out.println("car2的");
		car2.show();
	}
}
class Car45{
	private int num;
	private double gas;
	
	public Car45() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}