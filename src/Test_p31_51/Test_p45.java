package Test_p31_51;
//���O���A���ܼ�
public class Test_p45 {
	public static void main(String[] args){
		System.out.println("�ŧicar1");
		Car45 car1;
		car1=new Car45();
		car1.setCar(34555, 46.5);
		
		System.out.println("�ŧicar2");
		Car45 car2;
		car2=new Car45();
		car2.setCar(55556, 33.4);
		
		System.out.println("�Ncar1���w��car2");
		car2=car1;
		System.out.println("car1��");
		car1.show();
		System.out.println("car2��");
		car2.show();
		
		System.out.println("����car1���������");
		car1.setCar(1111, 11.1);
		System.out.println("car1��");
		car1.show();
		System.out.println("car2��");
		car2.show();
	}
}
class Car45{
	private int num;
	private double gas;
	
	public Car45() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	public void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}