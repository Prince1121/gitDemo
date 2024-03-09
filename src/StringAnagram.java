import java.util.Arrays;

public class StringAnagram {
	
	static boolean  Anagram(char[] str1, char[] str2) {
		
		
		int n1= str1.length;
		int n2 = str2.length;
		if(n1 !=n2)
		{
			return false;
		}
		
		Arrays.sort(str2);
		Arrays.sort(str1);
		
		for(int i=0;i<n1;i++)
		{
			
		    if(str1[i] != str2[i])
		     {
			return false;
		     }
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char str1[] = {'s','i','l','e','n','t'};
		char str2[] = {'v','i','l','e','n','t'};
		
		if(Anagram(str1,str2))
		{
			System.out.println("both string ara anagram");
			System.out.println("both string ara anagram");
			System.out.println("both string ara anagram");
			System.out.println("both string ara anagram");
			System.out.println("both string ara anagram");
			System.out.println("both string ara anagram");
			System.out.println("both string ara anagram");
		}
		else
		{
			System.out.println("both string ara anagram");
		}

	}

}
