import java.util.Scanner;


public class FuLi {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		System.out.println("** ����������� **");
		int years= scanner.nextInt();
		System.out.println("** ��������ȷ�Ľ�� **");
		double money=scanner.nextDouble();
		double sum=0;
		System.out.println("** ������������ **");
		double r=scanner.nextDouble();
		for(int i = 1 ; i<=years; i++){
			   sum = (1+ r) * i *money; 
			   System.out.println("�����"+i+"���Ĵ���ܶ�Ϊ��"+sum);
			  }
		

	}

}
