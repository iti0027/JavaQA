package Looping;


  public class Whileloop {
    public static void main(String[] args) {
      /*
       *          int counter = 1;

        while(counter <= 5){
            System.out.println("Counter is " + counter);
            counter++;
        }
       */
      // First exercise:

      int sum = 0;
      int number = 1;

      while (number <= 100){
        sum = sum + number;
        number++;
      }
      System.out.println("The sum of the first 100 numbers is " + sum);
      }
}
