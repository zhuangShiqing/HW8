package Test_p24_28;
//多載
//建構式
public class Test_p28 {
	public static void main(String[] args) {
		Car_o car1;
		car1=new Car_o();
		car1.show();
		Car_o car2;
		car2=new Car_o(345,78.7);
		car2.show();
	}
}
//呼叫其他建構式
class Car_o{
	private int num;
	private double gas;
	//建構式是可以省略的，Java會自動升成一個預設建構式
	public Car_o() {
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public Car_o(int n,double g) {
		this(); //呼叫沒有帶參數的建構式//等同呼叫System.out.println("生產了車子");
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+",汽油量為"+gas+"的車子");
	}
	public void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}