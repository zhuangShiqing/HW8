package Test_p20_22;//�����s������

public class Test_p20 {
	public static void main(String[] args) {
		Car car1;
		car1=new Car();
		car1.num=1234;
		//���w���~���T�o�q���
		car1.gas=-10;
		car1.show();
	}
}
class Car{
	int num;
	double gas;
	
	void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}