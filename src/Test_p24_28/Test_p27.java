package Test_p24_28;
//�h��
//�غc��
public class Test_p27 {
	public static void main(String[] args) {
		Car_oc car1;
		//�I�s�S���Ѽƪ��غc��
		car1=new Car_oc();
		car1.show();
		
		Car_oc car2;
		//�I�s����ӰѼƪ��غc��
		car2=new Car_oc(1234,45.7);
		car2.show();
		
	}
}
class Car_oc{
	//overloading
	//constructor
	private int num;
	private double gas;
	//�S���Ѽƪ��غc��constructor
	public Car_oc() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	//��ӰѼƫغc��
	public Car_oc(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+",�T�o�q��"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}