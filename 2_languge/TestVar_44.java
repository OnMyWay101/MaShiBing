import java.util.Scanner;
public class TestVar_44{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入名字：");
		String name = sc.next();

		System.out.print("请输入年龄：");
		int age = sc.nextInt();
		
		System.out.print("请输入身高：");
		double height = sc.nextDouble();
		
		System.out.print("请输入性别：");
		String sexStr = sc.next();	
		char sex = sexStr.charAt(0);
		
		System.out.println("学生的信息为：名字-" + name
			+ " 年龄-" + age + " 身高-" + height + " 性别" + sex);
	}
	
}