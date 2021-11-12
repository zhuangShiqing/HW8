package Test_p24_28;
//更
//篶Α
public class Test_p27 {
	public static void main(String[] args) {
		Car_oc car1;
		//㊣⊿Τ把计篶Α
		car1=new Car_oc();
		car1.show();
		
		Car_oc car2;
		//㊣Τㄢ把计篶Α
		car2=new Car_oc(1234,45.7);
		car2.show();
		
	}
}
class Car_oc{
	//overloading
	//constructor
	private int num;
	private double gas;
	//⊿Τ把计篶Αconstructor
	public Car_oc() {
		num=0;
		gas=0.0;
		System.out.println("ネ玻ó");
	}
	//ㄢ把计篶Α
	public Car_oc(int n,double g) {
		num=n;
		gas=g;
		System.out.println("ネ玻ó腹"+num+",═猳秖"+gas+"ó");
	}
	public void show() {
		System.out.println("ó腹琌"+this.num);
		System.out.println("═猳秖琌"+this.gas);
	}
}