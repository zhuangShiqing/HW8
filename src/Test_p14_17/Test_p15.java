package Test_p14_17;

public class Test_p15 {
	public static void main(String[] args) {
		CarCar car1;
		car1 =new CarCar();
		int number=12345;
		double gasoline=39.5;
		
		car1.setNumGas(number, gasoline);
	}
}
class CarCar{
	int num;
	double gas;
	
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}