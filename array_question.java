import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class palle{
    public static void main(String [] arg){
        

       // print max number from array
        int[] arr={1,2,3,4,5,10,6,7,8,9};
        int max=arr[0];
        for (int i=1;i<arr.length-1;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);


        // find biggest even number in array              
        int[] arr1={100,2,398,4292,57,990,62203,13870,8,9};
        int maxi_even=arr1[0];
        for (int i=1;i<arr1.length-1;i++){
            if(maxi_even<arr1[i] && arr1[i]%2==0 ){
                maxi_even=arr1[i];
            }
        }
        System.out.println(maxi_even);
            // ABOVE LOGIC WILL NOT WORK FOR SOME CASES LIKE 
                // 1. If array contain all odd numbers
                // 2. if array[0] is greater and odd {121,2,3,59}
                // 3. if array is of negative numbers 
            
        // solution for all above test cases are given below
        int[] arr5={-1,21,-3,-41,5,61};
        int max=Integer.MIN_VALUE;
        String b;

        for (int i=0;i<=arr5.length-1;i++){
            if(max<arr5[i] && arr5[i]%2==0){
                max=arr5[i];

            }
            
            
        }
        
        
             
        





    }
}
