package Test_p5_7;//建立新物件及存取成員資料

public class Test_p6 {
	public static void main(String[] args) {
		Car6 car1;
		car1 =new Car6();
		car1.num=1234;
		car1.gas=20.5;
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
	}
}
class Car6{
	//Car類別
	int num;
	double gas;
}
//同一個package不能有重名的class