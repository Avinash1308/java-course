public class palle{
    public static void main (String[] arg){
        
    // *************** for loop syntax: 
                    // for loop also known as iterative statement

// for(initialization; condition ; increment/decrement){
//     java code
// }



// print 1,2,....10;
for(int i=1;i<=10;i++) {
    System.out.println(i);
}



// print 100,99....0
for(int i=100;i>=0;i--) {
    System.out.println(i);
}


// print 0,2,4,6...100:
for(int i=0;i<=100;i=i+2) {
    System.out.println(i);
}


// print 1,2,3.......99,100; print all numbers side by side with , between them
for(int i=1;i<=10;i++) {
    System.out.print(i+",");   // if you '' it will print ASCII value so put ""
}


// print 1,2,4,8,16,..2048
for (int i=1;i<=2048;i=i*2){
    System.out.println(i);
}


// print A,C,E,....Y
for(char i='A';i<='Y';i+=2){
    System.out.println(i);
}
    
 



// print 1 to 10 in 1st line
//      11 to 20 in 2nd line upto 10 line and use only one for loop
for (int i=1;i<=99;i++){
    System.out.print(i+",");
    if(i==10 || i==20 || i==30 || i==40 || i==50 || i==60 || i==70 ||i==80||i==90){
        
        System.out.println();
        continue;
    }
}
System.out.println(100);




// take number series 0 to 100 and 
           // check if number is div by 3 return fizz 
            // num div by 5 return buzz and
            //  div by both fizz buzz else return number itself
int div_by_both=0;  
int div_by_3=0;
int div_by_5=0;       
for (int i=0;i<=100;i++){
    if(i%3==0 && i%5 == 0){
        System.out.println("fizzbuzz");
        div_by_both++;
    }
    else if(i%3 == 0 ){
        System.out.println("fizz");
        div_by_3++;
    }
    else if( i%5 == 0){
        System.out.println("buzz");
        div_by_5++;
    }
    else{
        System.out.println(i);
    }
}
System.out.println("Total number within 1 to 100 which is divisible by both 3 and 5 are : "+div_by_both);
System.out.println("Total number within 1 to 100 which is divisible by both 3 and 5 are : "+div_by_3);
System.out.println("Total number within 1 to 100 which is divisible by both 3 and 5 are : "+div_by_5);
int rem=(100-div_by_3-div_by_5-div_by_both);
System.out.println("remaining numbers are :"+ rem);

    }
}
