package Test_p9_12;//�������P��k

public class Test_p11 {
	public static void main(String[] args) {
		Car2 car1;
		car1 =new Car2();
		car1.num=1234;
		car1.gas=45.5;
		
		car1.show();
		car1.show();
	}
}
class Car2{
	int num;
	double gas;
	
	void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}