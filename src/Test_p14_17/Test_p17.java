package Test_p14_17;

public class Test_p17 {
	public static void main(String[] args) {
		CarCar1 car1;
		car1 =new CarCar1();
		car1.setNumGas(12345, 33.6);
		
		int number=car1.getNum();
		double gasoline=car1.getGas();
		System.out.println("調查樣品車時得知");
		car1.show();
		
	}
}
class CarCar1{
	int num;
	double gas;
	int getNum() {
		System.out.println("調查車號");
		return num;
	}
	double getGas() {
		System.out.println("調查汽油量");
		return gas;
	}
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	void show() {
		System.out.print("車號是"+num+",汽油量是"+gas);
	}
}