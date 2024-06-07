import java.util.*;

class Arrays1{
  public static void main(String[] args) {
       int ar[]={56,23,34,89,67,99,86,54,78};
       System.out.println(Arrays.toString(ar));

       //bubble sort
       for(int j=0; j<ar.length-1; j++){
         for(int i=0; i<ar.length-1; i++){
		    if(ar[i]>ar[i+1]){
			   int t=ar[i];
			   ar[i]=ar[i+1];
			   ar[i+1]=t;
		    }
	     }
	   }
	    System.out.println(Arrays.toString(ar));
  }
}
