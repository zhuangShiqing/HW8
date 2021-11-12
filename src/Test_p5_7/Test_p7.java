package Test_p5_7;//建立新物件及存取成員資料

public class Test_p7 {
	public static void main(String[] args) {
		Car7 car1;
		car1 =new Car7();
		car1.num=1234;
		car1.gas=20.5;
		
		Car7 car2;
		car2 =new Car7();
		car2.num=2345;
		car2.gas=50.5;
		
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
		System.out.println("車號是"+car2.num);
		System.out.println("汽油量是"+car2.gas);
	}
}
class Car7{
	//Car類別
	int num;
	double gas;
}
//同一個package不能有重名的class