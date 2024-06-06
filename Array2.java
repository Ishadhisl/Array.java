import java.util.*;

class Arrays1 {
    public static void main(String args[]) {
        int[] array = new int[20];
        Random r = new Random();

        int count=0;
        boolean isGreater90=false;
        for (int i = 0; i < 20; i++) {
            array[i] = r.nextInt(101);
            if(array[i]>=50){
				count++;
			}
			if(array[i]>90){
				isGreater90=true;
			}
        }

        System.out.println(Arrays.toString(array));
        int min=array[0];
        for (int j = 1; j < 20; j++) {
            if(min>array[j]){
               min=array[j];
            }
        }
        System.out.println("Minimum number is: "+min);
        System.out.println(count+" number of student pass the exam");
        System.out.println("There are students get more than 90: "+isGreater90);
        
    }
}
