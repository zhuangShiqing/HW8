package Test_p14_17;

public class Test_p17 {
	public static void main(String[] args) {
		CarCar1 car1;
		car1 =new CarCar1();
		car1.setNumGas(12345, 33.6);
		
		int number=car1.getNum();
		double gasoline=car1.getGas();
		System.out.println("�լd�˫~���ɱo��");
		car1.show();
		
	}
}
class CarCar1{
	int num;
	double gas;
	int getNum() {
		System.out.println("�լd����");
		return num;
	}
	double getGas() {
		System.out.println("�լd�T�o�q");
		return gas;
	}
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	void show() {
		System.out.print("�����O"+num+",�T�o�q�O"+gas);
	}
}