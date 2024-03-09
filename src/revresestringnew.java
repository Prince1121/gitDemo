
public class revresestringnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//remove the duplicate 
    
		String str = "jhgsfdwdywdiuyt";
		String vowel  =  "aieou";
		boolean found = false;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			for(int j=0;j<vowel.length();j++)
			{
				char ch2 = vowel.charAt(j);
				if( ch2 ==ch)
				{
					found = true;
					break;
				}
			}
			if(found)
			{
				break;
			}
		}
		if(found)
		{
			System.out.println("vowel is present");
		}
		else
		{
			System.out.println("not found");
		}
		
	
	
	 }

}
