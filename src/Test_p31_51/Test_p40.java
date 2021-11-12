package Test_p31_51;
//類別應用方法
//StringBuffer
//append
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_p40 {
	public static void main(String[] args)throws IOException{
		System.out.println("請輸入字串。");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		System.out.println("請輸入要新增的文字");
		String str2=br.readLine();
		//StringBuffer類別可以修改字串內容
		StringBuffer sb=new StringBuffer(str1);
		//將str1存到可修改的sb內並新增str2至sb內
		sb.append(str2);
		System.out.println("在"+str1+"後新增<"+str2+">，就會變成<"+sb+">。");
	}
}
