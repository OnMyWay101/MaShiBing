public class TestDynamicArgs_91
{
	public static void main(String[] args)
	{
		method();
		method(10);
		method(1, 2, 3);
		method(new int[]{4, 5, 6});
	}
	
	private static void method(int...nums)
	{
		System.out.println("method working:");
		for(int num:nums)
		{
			System.out.println(num);
		}
	}
}