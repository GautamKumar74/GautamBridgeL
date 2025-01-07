import java.util.*;
class Addition{
   public static void main(String[] args){
      System.out.println("Enter three integers to add");
      Scanner sc= new Scanner(System.in);
      int a= sc.nextInt();
      int b= sc.nextInt();
      int c= sc.nextInt();
      System.out.println("Addition : " + (a+b+c)); 
   }
}
