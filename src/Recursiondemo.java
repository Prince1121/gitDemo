
public class Recursiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int z = sum(5,10);
		System.out.println(z);

	}
	
	static int sum(int start, int end)
	{
		if(end>start)
		{
			return end + sum(start, end - 1);  // 10+ 9 +8 + 7 + 6;
		}
		else
		{
			return end;
		}
	}

}
