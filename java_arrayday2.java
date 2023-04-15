public class palle{
    public static void main(String[]arg){
        // store 10,20,30 in array
        int [] arr={10,20,30};
        System.out.println(arr);
        
        char[] arr2={'a','b','c'};
        System.out.println(arr2);

        // store 1, ramesh,3.5,false in array
        Object[] arr6={1,"ramesh",3.5,false};
        System.out.println(arr6);


        // array will be stored in heap memory
        // every array will have a predefined variable length,
        // which contains size of array
        // array index from 0 to n-16
        //  print array using for loop
        int[] arr7={1,2,3,4,5,6};
        for (int i=0;i<arr7.length;i++){
            System.out.println(arr7[i]);
    
        }

    }
}
