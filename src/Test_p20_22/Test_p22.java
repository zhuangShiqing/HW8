package Test_p20_22;//成員存取限制

public class Test_p22 {
	//num、gas兩者為private無法從外部直接存去
	//car1.num及car1.gas無法使用
	public static void main(String[] args) {
		Car_r car1;
		car1=new Car_r();
		car1.setNumGas(345667, 40.6);
		car1.show();
		
		System.out.println("指定不正確的汽油量(-10.0)看看");
		car1.setNumGas(345667, -10.0);
		car1.show();
	}
}
class Car_r{
	//private 外務無法直接存取
	private int num;
	private double gas;
	
	public void setNumGas(int n,double g) {
		if(g>0 && g<100) {
			num=n;
			gas=g;
			System.out.println("將車號設為"+num+",汽油量設為"+gas);
		}
		else {
			System.out.println(g+"不是正確的汽油量");
			System.out.println("無法變更汽油量");
		}
	}
	
	public void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}