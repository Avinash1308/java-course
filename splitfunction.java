public class Main{
  public static void main(String[] arg){
    String s="palle tech java j2ee";
    String[] arr=s.split(" ");                    // splic is used to split the string 
    for (int i=0;i<arr.length;i++){
      System.out.print(arr[i]); 
    }
    
    
    [-
    // print words in reverse order i.e j2ee,java,tech,palle
    String s="palle tech java j2ee";
    String[] arr=s.split(" ");
    for (int i=arr.length-1;i>=0;i--){
      System.out.print(arr[i]); 
      
      
      
      
      
    // swap the first char of word with last char of same word 
    String s="palle tech java j2ee";
    String[] arr=s.split(" ");
    for (int i=0;i<arr.length;i++){
      String ele=arr[i];
      
      char first=ele.charAt(0);
      char last=ele.charAt(ele.length()-1);
      String remaining=ele.substring(1,ele.length()-1);
       
        
      
      System.out.print(last+remaining+first+" ");  // out put  eallp hect aavj e2ej
      
      
      
      
      
      
    //  reverse string 
    '=[-ring s="palle tech java j2ee";
    String[] arr=s.split(" ");
    
    for (int i=0;i<arr.length;i++){
      
      String ele=arr[i];
      
      for (int j=ele.length()-1;j>=0;j--){
        
        System.out.print(ele.charAt(j));
        
      }
      System.out.print(" ");
      
       
  }
  
}
