class IfElseladderDemo{

public static void main(String args[]){
{
System.out.println("Main started.....");

int num =10;

if( num >=0 && num < 9){
    System.out.println("The given number is a single digit number");
}
else if (num > 9 && num < 100){
  System.out.println("The given number is a two digit number");
}

else if (num > 99 && num < 100){
   System.out.println("The given number is a three digit number");
}
else if (num > 999 && num < 1000){
    System.out.println("The given number is a four digit number");
}
else {
         System.out.println("please provide a number between the range 0-10000");
}

System.out.println("Main end.....");
}
}
}