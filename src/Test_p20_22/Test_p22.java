package Test_p20_22;//�����s������

public class Test_p22 {
	//num�Bgas��̬�private�L�k�q�~�������s�h
	//car1.num��car1.gas�L�k�ϥ�
	public static void main(String[] args) {
		Car_r car1;
		car1=new Car_r();
		car1.setNumGas(345667, 40.6);
		car1.show();
		
		System.out.println("���w�����T���T�o�q(-10.0)�ݬ�");
		car1.setNumGas(345667, -10.0);
		car1.show();
	}
}
class Car_r{
	//private �~�ȵL�k�����s��
	private int num;
	private double gas;
	
	public void setNumGas(int n,double g) {
		if(g>0 && g<100) {
			num=n;
			gas=g;
			System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
		}
		else {
			System.out.println(g+"���O���T���T�o�q");
			System.out.println("�L�k�ܧ�T�o�q");
		}
	}
	
	public void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}