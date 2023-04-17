
public class palle{
    public static void main(String[] arg){


        // print even numbers from the array
        int[] arr1={1,2,3,4,5,6,7,8,9};
        for (int i=0;i<=arr1.length-1;i++){
            if(arr1[i]%2==0){
                System.out.println(arr1[i]);
            }
        }



        // count  even and odd numbers present in array
        int[] arr2={1,2,3,4,5,6,7,8,9};
        int count_even=0;
        int count_odd=0;
        for (int i=0;i<=arr2.length-1;i++){
            if(arr2[i]%2==0){
                // System.out.println( arr2[i]);
                count_even++;
            }
            else{
                // System.out.println(+arr2[i]);
                count_odd++;

            }
        }
        System.out.println("Total Even numbers in an array are : " +count_even);
        System.out.println("Total Odd numbers in an array are : " +count_odd);



        // take array of 5 numbers if number is even print number else print "palle"
        int [] arr3={10,25,3,84,51};
        for(int i=0;i<=arr3.length-1;i++){
            if(arr3[i]%2==0){
                System.out.println(arr3[i]);
            }
            else{
                System.out.println("palle");
            }
        }




        // take array of 10 numbers, print even element present in event position
        int [] arr4={10,25,32,84,51};
        for(int i=0;i<=arr4.length-1;i+=2){
            if(arr4[i]%2==0 ){
                System.out.println(arr4[i]);
            }
            
        }



        // calculate sum of array Element
        int[] arr5={1,2,3,4,5};
        int sum=0;
        for (int i=0;i<=arr5.length-1;i++){
            sum+=arr5[i];
        }
        System.out.println(sum);


    }
}
