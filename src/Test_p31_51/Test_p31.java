package Test_p31_51;
//���O�\��
//���O�ܼƩM���O��k
public class Test_p31 {
	//main�]�O�@�����O��k�A�z�L�[�Wstatic void�׹��l�Φ�
	public static void main(String[] args) {
		//���ݭn�إߪ���->Car ���O�W��->���O�W��=new Car();
		//�I�s���O��k
		Car.showsum();
		
		Car car1;
		car1=new Car();
		car1.setCar(454,99.7);
		Car.showsum();
		
		Car car2;
		car2=new Car();
		car2.setCar(4566,7.8);
		Car.showsum();
	}
}
class Car{
	//���O�ܼ�
	public static int sum=0;
	
	private int num;
	private double gas;
	//�غc�l->��l��
	public Car() {
		num=0;
		gas=0.0;
		sum++;
		System.out.println("�Ͳ��F���l");
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+",�T�o�q��"+gas+"�����l");
	}
	//���O��k
	public static void showsum() {
		System.out.println("���l�`�@��"+sum+"�x");
	}
	public void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
	
}
