package basic_array_problems;

public class movezeroes {
	 static void swap(int i,int j,int arr[]){
	        int temp=arr[i];
	        arr[i]=arr[j];
	        arr[j]=temp;
	    }
	    static void moveZeroes(int arr[]){
	        int j=-1;
	        //encountering first zero 
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]==0){
	                j=i;
	                break;
	            }
	        }
	         for (int i = j + 1; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                swap(i, j, arr);
	                j++; // Move zero pointer forward
	            }
	        }
	    
	            if(j==-1) return;
	            
	        }
	      public static void main(String[] args) {
	          System.out.println("Try programiz.pro");
	          int arr[]=new int[]{1,0,2,3,0,0};
	          moveZeroes(arr);
	          for(int i=0;i<arr.length;i++){
	              System.out.print(arr[i]+" ");
	          }
	      }

}
