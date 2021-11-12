package Test_p24_28;
//多載
//建構式
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
	
	//建立建構式，其名稱要與類別class名稱相同
	public Constructor_t() {
		//建構式做初始化設定(通常)
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	
	public void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}
