package Test_p9_12;//物件的欄位與方法

public class Test_p12 {
	public static void main(String[] args) {
		Car3 car1;
		car1 =new Car3();
		car1.num=1234;
		car1.gas=45.5;
		car1.showCar();
	}
}
class Car3{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	void showCar() {
		System.out.println("開始顯示車子資料");
		this.show();
	}
}