package Test_p24_28;
//�h��
//�غc��
public class Test_p26 {
	public static void main(String[] args) {
		Constructor_t car1;
		car1=new Constructor_t();
		
		car1.show();
	}
}
class Constructor_t{
	private int num;
	private double gas;
	
	//�إ߫غc���A��W�٭n�P���Oclass�W�٬ۦP
	public Constructor_t() {
		//�غc������l�Ƴ]�w(�q�`)
		num=0;
		gas=0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void show() {
		System.out.println("�����O"+this.num);
		System.out.println("�T�o�q�O"+this.gas);
	}
}
