
public class removeduplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {52,364,352,52,52,67};
		int[] arr2 =  new int[arr.length];
		int k=0;
		for(int i = 0;i<arr.length;i++)
		{
			arr2[i]=-1;
		}
		 for(int i=0;i<arr.length;i++)
	       {
	           boolean duplicate = false;
	           for(int j = 0 ; j<arr2.length;j++)
	           {
	               if(arr[i]==arr2[j])
	               {
	                   duplicate = true;
	                   break;
	               }
	           }
	           if (!duplicate) {
	              arr2[k++] = arr[i];
	          }
	       }
	       for (int i = 0; i < k; i++) {
	           System.out.print(arr2[i] + " ");
	       }
		

	}

}
