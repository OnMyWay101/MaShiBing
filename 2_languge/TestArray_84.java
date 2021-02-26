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
			System.out.print("请输入第" + (i + 1) + "个同学的成绩：");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		System.out.println("十个学生的总成绩为："+ sum);
		System.out.println("十个学生的平均成绩为："+ sum / 10);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("第" + (i + 1) + "个学生的成绩为：" + scores[i]);
		}
		
		for(int score:scores)
		{
			System.out.println(score);
		}
	}
}