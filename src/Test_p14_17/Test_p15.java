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
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	
	void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}