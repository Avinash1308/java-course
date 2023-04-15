public class palle{
    public static void main(String[]arg){
       
        int[] arr7={1,2,3,4,5,6};
        for (int i=0;i<=arr7.length-1;i++)   //always try t0 avoid hardcoding condition  i.e. l<3(any fixed number)
        {
            System.out.println(arr7[i]);
           
        }





        //print array in reverse order
        int[] arr8={1,2,3,4,5,6};
        for (int i=arr8.length-1;i>=0;i--)   
        {
            System.out.println(arr8[i]);
           
        }




        //print alternative element of array
        int[] arr9={1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<arr9.length-1;i+=2)   
        {
            System.out.println(arr9[i]);
           
        }




        //print alternative element of array in reverse order
        int[] arr10={1,2,3,4,5,6,7,8,9,10};
        for (int i=arr10.length-1;i>=1;i-=2)   
        {
            System.out.println(arr10[i]);
           
        }



        // print 2,1,4,3,6,5,8,7,10,9
        int[] arr11={1,2,3,4,5,6,7,8,9,10};
        for (int i=1;i<=9;i=i+2){
            System.out.println(arr11[i]);
            System.out.println(arr11[i-1]);
        }

        

    }
}

