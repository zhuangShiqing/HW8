package Test_p31_51;

public class Test_p51 {
	public static void main(String[] args){
		Car51[] car;
		car=new Car51[12];
		for(int i=0;i<car.length;i++) {
			car[i]=new Car51();
			System.out.print("��"+(i+1)+"�x");
			car[i].setCar(1231+i,100.0+0.5*i);
			car[i].show();
		}
	}
}
class Car51{
	int num;
	double gas;
	public Car51() {
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