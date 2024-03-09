
public class Printrepeatcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "hjhfdhgbg";
String str2="";
for(int i=0;i<str1.length();i++)
{
	char ch = str1.charAt(i);
	if(str2.indexOf(ch) ==-1)
	{
		str2 = str2+ch;
	}
}

System.out.println(str2);
	}

}
