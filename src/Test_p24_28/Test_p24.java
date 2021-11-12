package Test_p24_28;
//多載
//建構式
public class Test_p24 {
	public static void main(String[] args) {
		overLoading car1;
		car1=new overLoading();
		car1.setCar(1234, 45.6);
		car1.show();
		System.out.println("變更汽油量");
		car1.setCar(78.8);
		car1.show();
		System.out.println("變更車號");
		car1.setCar(567);;
		car1.show();
	}
}
//多載 
class overLoading{
	private int num;
	private double gas;
	//當命名相同名稱但會因為參數型別和數量，影響傳入的方法
	public void setCar(int n) {
		num=n;
		System.out.println("將車號設為"+num);
	}
	public void setCar(double g) {
		gas=g;
		System.out.println("將汽油量設為"+gas);
	}
	public void setCar(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	public void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}