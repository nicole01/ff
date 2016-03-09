import java.util.Scanner;


public class FuLi {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		System.out.println("** 请输入多少年 **");
		int years= scanner.nextInt();
		System.out.println("** 请输入正确的金额 **");
		double money=scanner.nextDouble();
		double sum=0;
		System.out.println("** 请输入年利率 **");
		double r=scanner.nextDouble();
		for(int i = 1 ; i<=years; i++){
			   sum = (1+ r) * i *money; 
			   System.out.println("存入第"+i+"年后的存款总额为："+sum);
			  }
		

	}

}
