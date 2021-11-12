package Test_p31_51;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

//做大小寫字母轉換
public class Test_p37 {
	public static void main(String[] args)throws IOException{
		System.out.println("請輸入英文單字");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		//轉成大寫
		String stru=str.toUpperCase();
		//轉乘小寫
		String strl=str.toLowerCase();
		
		System.out.println("轉換成大寫時為"+stru);
		System.out.println("轉換成小寫時為"+strl);
	}
}
