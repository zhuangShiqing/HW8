package Test_p31_51;
//���O���Τ�k
//StringBuffer
//append
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_p40 {
	public static void main(String[] args)throws IOException{
		System.out.println("�п�J�r��C");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		System.out.println("�п�J�n�s�W����r");
		String str2=br.readLine();
		//StringBuffer���O�i�H�ק�r�ꤺ�e
		StringBuffer sb=new StringBuffer(str1);
		//�Nstr1�s��i�ק諸sb���÷s�Wstr2��sb��
		sb.append(str2);
		System.out.println("�b"+str1+"��s�W<"+str2+">�A�N�|�ܦ�<"+sb+">�C");
	}
}
