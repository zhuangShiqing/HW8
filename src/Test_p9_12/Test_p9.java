package Test_p9_12;//物件的欄位與方法

public class Test_p9 {
	public static void main(String[] args) {
		Car car1;
		car1 =new Car();
		car1.num=1234;
		car1.gas=45.5;
	}
}
class Car{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}