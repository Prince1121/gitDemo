
public class Fuctiondemo1 {
	
 static int myMethod(int x, int y)
	{
		return x +y;
	}
 static double myMethod(double x, double y)
	{
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		//System.out.println(myMethod(20, 30));
		int sum =  myMethod(20,30);
		double sumf =  myMethod(20.56,50.45);
		System.out.println("sume of integer " + sum);
		System.out.print("sume of double " + sumf);
		
		//method overloading method have same name but different datatype or no. of parameter and it is process at complie time.
		

	}

}
