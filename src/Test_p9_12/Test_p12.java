package Test_p9_12;//�������P��k

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
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	void showCar() {
		System.out.println("�}�l��ܨ��l���");
		this.show();
	}
}