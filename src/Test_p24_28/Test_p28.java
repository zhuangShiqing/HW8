package Test_p24_28;
//�h��
//�غc��
public class Test_p28 {
	public static void main(String[] args) {
		Car_o car1;
		car1=new Car_o();
		car1.show();
		Car_o car2;
		car2=new Car_o(345,78.7);
		car2.show();
	}
}
//�I�s��L�غc��
class Car_o{
	private int num;
	private double gas;
	//�غc���O�i�H�ٲ����AJava�|�۰ʤɦ��@�ӹw�]�غc��
	public Car_o() {
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	public Car_o(int n,double g) {
		this(); //�I�s�S���a�Ѽƪ��غc��//���P�I�sSystem.out.println("�Ͳ��F���l");
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+",�T�o�q��"+gas+"�����l");
	}
	public void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}