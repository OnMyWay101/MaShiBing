import java.util.Scanner;

public class TestArray_84
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[10];
		int sum = 0;
		for(int i = 0 ;i < 10; i++)
		{
			System.out.print("�������" + (i + 1) + "��ͬѧ�ĳɼ���");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		System.out.println("ʮ��ѧ�����ܳɼ�Ϊ��"+ sum);
		System.out.println("ʮ��ѧ����ƽ���ɼ�Ϊ��"+ sum / 10);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("��" + (i + 1) + "��ѧ���ĳɼ�Ϊ��" + scores[i]);
		}
		
		for(int score:scores)
		{
			System.out.println(score);
		}
	}
}