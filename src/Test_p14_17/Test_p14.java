package Test_p14_17;

public class Test_p14 {
	public static void main(String[] args) {
		Car car1;
		car1 =new Car();
		car1.setNum(99);
		car1.setGas(20.5);
	}
}
class Car{
	int num;
	double gas;
	void setNum(int n) {
		num=n;
		System.out.println("�N�����]��"+num);
	}
	void setGas(double g) {
		gas=g;
		System.out.println("�N�T�o�q�]��"+gas);
	}
}