package Test_p5_7;//�إ߷s����Φs���������

public class Test_p7 {
	public static void main(String[] args) {
		Car7 car1;
		car1 =new Car7();
		car1.num=1234;
		car1.gas=20.5;
		
		Car7 car2;
		car2 =new Car7();
		car2.num=2345;
		car2.gas=50.5;
		
		System.out.println("�����O"+car1.num);
		System.out.println("�T�o�q�O"+car1.gas);
		System.out.println("�����O"+car2.num);
		System.out.println("�T�o�q�O"+car2.gas);
	}
}
class Car7{
	//Car���O
	int num;
	double gas;
}
//�P�@��package���঳���W��class