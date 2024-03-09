
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str1 = "jshgy";
      String str2 = "aeiou";
      boolean found = false;
      for(int i=0;i< str1.length();i++)
      {
    	  char ch  = str1.charAt(i);
    	  for(int j =0;j<str2.length();j++)
    	  {
    		  char c = str2.charAt(j);
    		  if( c ==  ch)
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
    	  System.out.println("vowel found");
      }
      else
      {
    	  System.out.println("vowel not found");
    
      }

   

}
}
