package Test_p24_28;
//�h��
//�غc��
public class Test_p24 {
	public static void main(String[] args) {
		overLoading car1;
		car1=new overLoading();
		car1.setCar(1234, 45.6);
		car1.show();
		System.out.println("�ܧ�T�o�q");
		car1.setCar(78.8);
		car1.show();
		System.out.println("�ܧ󨮸�");
		car1.setCar(567);;
		car1.show();
	}
}
//�h�� 
class overLoading{
	private int num;
	private double gas;
	//��R�W�ۦP�W�٦��|�]���Ѽƫ��O�M�ƶq�A�v�T�ǤJ����k
	public void setCar(int n) {
		num=n;
		System.out.println("�N�����]��"+num);
	}
	public void setCar(double g) {
		gas=g;
		System.out.println("�N�T�o�q�]��"+gas);
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