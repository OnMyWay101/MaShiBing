import java.util.Scanner;
public class TestVar_44{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���������֣�");
		String name = sc.next();

		System.out.print("���������䣺");
		int age = sc.nextInt();
		
		System.out.print("��������ߣ�");
		double height = sc.nextDouble();
		
		System.out.print("�������Ա�");
		String sexStr = sc.next();	
		char sex = sexStr.charAt(0);
		
		System.out.println("ѧ������ϢΪ������-" + name
			+ " ����-" + age + " ���-" + height + " �Ա�" + sex);
	}
	
}