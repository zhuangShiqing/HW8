package Test_p31_51;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

//���j�p�g�r���ഫ
public class Test_p37 {
	public static void main(String[] args)throws IOException{
		System.out.println("�п�J�^���r");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		//�ন�j�g
		String stru=str.toUpperCase();
		//�୼�p�g
		String strl=str.toLowerCase();
		
		System.out.println("�ഫ���j�g�ɬ�"+stru);
		System.out.println("�ഫ���p�g�ɬ�"+strl);
	}
}
