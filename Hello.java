import java.util.*;
import javax.swing.JOptionPane;//GUI
import java.util.random.*;//random numbers
class Hello {
    /**
     * @param args
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       // System.out.println("Hello World!");   prints HELLO World! 

        //This is a single line comment

        /*Comments
                  in
                    java
         */

        /*This is a
                   multi-line
                               comment*/
       //int x=34;     
       //System.out.println("x");  prints x
       //System.out.println(x);    prints34
       //System.out.println("the value of x:" +x); #string concatenation
       

       /*Datatypes 
                  in 
                     java
        */
       //int x = 123;
       //double y = 3.14;
       //boolean z = true;https://www.blackbox.ai/share/bgLZrbM
       //char a = 'a'; 
       //String s = "Hello World!"; //String is a class in java
       

       /*swaping 
                values of variables
                                in java
        */
       //String a = "vivek";
       //String b = "ritviz";
       //String temp;
       //temp = a;
       //a = b;
       //b = temp;
       //System.out.println(a);    it will print ritviz
       //System.out.println(b);    it will print vivek
       //System.out.println(temp); it will print vivek(totally unnecessary line of code)

       /*Taking 
               input from
                          the user
        */
       
       //System.out.println("Enter the value of digit:");
       //int digit = sc.nextInt(); taking user input
       //System.out.println("The value of x:" +digit); displaying the user input

       /*type conversion in java */
       //implicit type conversion(automatic conversion)
        // int x = 34;
         //double y = x; //implicit type conversion
        // System.out.println(y);
         //explicit type casting 
         //double z = 34.5;
         //int a = (int)z; //explicit type casting


       /*java GUI */
      // String name = JOptionPane.showInputDialog("Enter your name:");
      // JOptionPane.showMessageDialog((null), "Hello "+name);
      // int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
      // JOptionPane.showMessageDialog((null), "You are "+age+" years old");
      // double height = Double.parseDouble(JOptionPane.showInputDialog("enter your  height"));
      // JOptionPane.showMessageDialog((null), "You are "+height+" cm tall");
      
      /*Math class
                  in java
       */
      //double x = 2.0;
      //double y = 8.0;
      //double power = Math.pow(x,y);
      //System.out.println((int)power);  
     // double sqrt = Math.sqrt(64.0);
     // System.out.println(sqrt);
     //double abs = Math.abs(-34.0); ignores negative symbol and has the exact value
     //System.out.println(abs);
     //double ceil = Math.ceil(34.20);// rounds up the value
     //System.out.println(ceil);
     //double floor = Math.floor(34.20);//rounds down the value
     //System.out.println(floor);
     //double round = Math.round(34.20);//rounds the value to the nearest integer
    //System.out.println(round);

    /* random numbers */
    //Random random = new Random();
    // int x = random.nextInt(6)+1;
    // double y =  random.nextDouble();
    // boolean z = random.nextBoolean();
    // System.out.println(x);
    // System.out.println(y);
    // System.out.println(z);

    /*if else ladder*/
    //System.out.println("enter your age:");
    //int age = sc.nextInt();
    //if(age<18){
    //  System.out.println("you can't have a driving licennce");
    //}
    //else if (age>=18 && age<60){
    // System.out.println("You can have a permanent driving licence");
    //}
    //else{
    //  System.out.println("You need to have a medical certificate to renew your driving licence");
    //}

    /*Switch case statement */
   // System.out.println("enter the day:");
   // String day = sc.next();

    //switch (day.toLowerCase()) {
    //  case "sunday": System.out.println("It's sunday");
    //  break;
    //  case "monday": System.out.println("It's monday today");
    //  break;
    //  case "tuesday": System.out.println("It's tuesday today");
    //  break;
    //  case "wednesday": System.out.println("It;s wednesday today");
    //  break;
    //  case "thursday": System.out.println("It's thursday today");
    //  break;
    //  case "friday": System.out.println("It's friday today");
    //  break;
    //  case "saturday": System.out.println("It's saturday");
    //  break;
    
    //  default:
    //  System.out.println("Invalid input");
    //    break;
    //}


    /*loops in java */
          //while loop
          //int i = 1; // Initialize the counter variable
  
          // While loop to print numbers from 1 to 10
          //while (i <= 10) {
          //    System.out.println(i); // Print the current value of i
          //    i++; // Increment the counter variable
          //}

          //for loop
          //for (int i = 1; i <= 10; i++) {
          //System.out.println(i); // Print the current value of i
        //}
        //do while loop
        //int i = 1; // Initialize the counter variable

        // Do-while loop to print numbers from 1 to 10
        //do {
        //    System.out.println(i); // Print the current value of i
        //    i++; // Increment the counter variable
        //} while (i <= 10);

      //array in java

     // int arr[];
     // arr = new int[5];
     // arr[0] = 1;
     // arr[1] = 5;
     // arr[2] = 10;
     // arr[3] = 28;
     // System.out.println("The value of array in the index: 2 is:" +arr[2]);
    
    // String car[] = {"Maruti Suzuki","Ford","Mahindra","Tata","Force"};
    //for(int i=0;i<car.length;i++){
    //  System.out.println(i);
    //}  
    
   
   // int arr[][] = new int[5][5];
   // arr[0][0] = 1;
   // arr[0][1] = 5;
   // arr[0][2] = 10;
   // arr[0][4] = 23;
   // 
   // arr[1][0] = 12;
   // arr[1][1] = 15;
   // arr[1][2] = 19;
   // arr[1][4] = 29;
   // 
   // arr[2][0] = 11;
   // arr[2][1] = 51;
   // arr[2][2] = 18;
   // arr[2][4] = 26;
   // 
   // arr[3][0] = 21;
   // arr[3][1] = 53;
   // arr[3][2] = 105;
   // arr[3][4] = 235;
   // 
   // arr[4][0] = 163;
   // arr[4][1] = 534;
   // arr[4][2] = 1063;
   // arr[4][4] = 2356;
   // 
   // for(int i = 0 ; i < arr.length ; i++) {
   //   for(int j = 0 ; j < arr[i].length ; j++){
   //     if(arr[i][j] != 0)
   //       System.out.println(arr[i][j]);
   //     else
   //       break;
   //   }
   // }
      
  

    
  }
}