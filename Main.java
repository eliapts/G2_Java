import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  task1();
 
}
 public static void task1() {

    System.out.println("C++");
    System.out.println("C#");
    System.out.println("java");
    System.out.println("pascal");
    System.out.println("php");
    System.out.println("Javascript");
    System.out.println("ActionScript");

  }
  
  public static void task2() {

   Scanner input = new Scanner(System.in);
   System.out.println( "Enter 1st integer: ");
   int number1 = input.nextInt();
   System.out.println( "Enter 2nd integer: ");
   int number2 = input.nextInt();
   System.out.println(number1/number2);
   System.out.println(number2%number1);
  }

  
 public static void task3() {

   Scanner input = new Scanner(System.in);
   System.out.println( "Enter 1st integer: ");
   int numb1 = input.nextInt();
   System.out.println( "Enter 2nd integer: ");
   int numb2 = input.nextInt();
   System.out.println( "Enter 3rd integer: ");
   int numb3 = input.nextInt();
   System.out.println("მათი ჯამია: "+ (numb1+numb2+numb3));
   System.out.println("მათი ნამრავლია: " + numb1*numb2*numb3);
  }
  
  
  public static void task4() {
  
   Scanner input = new Scanner(System.in);
   System.out.println( "Enter three-digit integer: ");
   int number = input.nextInt();
   while(number>0) {
    System.out.println( number % 10);
    number /= 10;
    }
    
    
   public static void task5() {
   
   Scanner input = new Scanner(System.in);
   System.out.println( "Enter four-digit integer: ");
   int number = input.nextInt();
   int sum = 0;
   while(number>0) {
    sum= sum + number % 10;
    number /= 10;
    }
    System.out.println(sum);
   }
   
   
    public static void task6() {
    
   Scanner input = new Scanner(System.in);
   System.out.println( "Enter an integer: ");
   int number = input.nextInt();
   int sum = 0;
   while(number>0) {
    sum= sum + number % 10;
    number /= 10;
    }
    System.out.println(sum);
   }
   
   public static void task8() {
   
   Scanner input = new Scanner(System.in);
   System.out.println( "Enter starting integer: ");
   int start_numb = input.nextInt();
   System.out.println( "Enter final integer: ");
   int last_numb = input.nextInt();
   for (int i=start_numb; i<last_numb; i++)
      System.out.println(i + "\t");
   }
   
   
  public static void task9() {
     
  int[] numbers = {5,89,10,-5,12,0,-45,100};
  System.out.println("Elements of given array: ");    
        for (int i = 0; i < numbers.length; i++) {   
            System.out.println(numbers[i] + " ");   
        }    
  int maxValue = numbers[0];
  for(int i=1;i < numbers.length;i++){
    if(numbers[i] > maxValue){
    maxValue = numbers[i];
  }
  }
  System.out.println("Maximum value is : " + maxValue);
  int minValue = numbers[0];
  for(int i=1;i<numbers.length;i++){
    if(numbers[i] < minValue){
    minValue = numbers[i];
  }
  }
  System.out.println("Minimum value is : " + minValue);
  }
  
  
  public static void task10 () {
   int [] array = {5,89,10,-5,12,0,-45,100};
   int temp;
   for (int i = 1; i < array.length; i++) {
    for (int j = i; j > 0; j--) {
     if (array[j] < array [j - 1]) {
      temp = array[j];
      array[j] = array[j - 1];
      array[j - 1] = temp;
     }
    }
   }
   for (int i = 0; i < array.length; i++) {
     System.out.println(array[i]);
   }
  }


 public static void task11() {
  
    int [] array = new int[8];
    for (int i = 1; i <array.length; i++) {
      array[i] = (int) (Math.random() * 100);
}
    System.out.print("Array members are: ");
    for(int i=0; i < array.length; i++){
        System.out.print(array[i] + " ");
    }
  }


  public static void task12() {
    int temp;
    int [] array = new int[8];
    for (int i = 1; i <array.length; i++) {
      array[i] = (int) (Math.random() * 100);
}
    System.out.print("Array members are: ");
    for(int i=0; i < array.length; i++){
        System.out.print(array[i] + " ");
    }
    for (int i = 0; i <array.length; i++) 
        {
            for (int j = i + 1; j < array.length; j++) 
            {
                if (array[i] < array[j]) 
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("\n" + "Descending Order:");
        for (int i = 0; i < array.length - 1; i++) 
        {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length - 1]);
    }

