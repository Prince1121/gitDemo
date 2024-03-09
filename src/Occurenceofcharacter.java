
public class Occurenceofcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jhgfdfghkjhgf";
		char c ='h';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(c == ch)
			{
				count++;
			}
		}
		System.out.print(count);

	}

}
