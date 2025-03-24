package basic_array_problems;

public class moveAllZeroesAtEnd {
    static void zerosAtLast(int arr[]){
        int n=arr.length;
        int i=0;int j=0;
        while(j<n){
            if(arr[j]!=0){
                
                swap(arr, i, j);
                i++;
            }
            
                j++;
            
        }
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[]=new int[]{1,2,0,3,0,0,4};
        zerosAtLast(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

}
