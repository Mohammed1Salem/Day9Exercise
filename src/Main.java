import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //18 - Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user.

        System.out.println("Enter a Sentence to see how many time 'a' appeared");

        String word18 = sc.nextLine();
        int aAppeared = 0;
        for (int i = 0 ; i < word18.length()-1 ; i++){
            if(word18.charAt(i) == 'a'){
                aAppeared++;
            }
        }
        System.out.println("number of a's: "+ aAppeared);


        //17 - Write a program to enter the numbers till the user wants and at the end the
        //program should display the largest and smallest numbers entered.

        int biggest = 0;
        int smallest = 0;
        System.out.println("Enter how many numbers you want to check");
        try {


            int count = sc.nextInt();
            while (count != 0) {
                int temp = sc.nextInt();
                if (temp > biggest) {
                    biggest = temp;
                }
                if (temp < smallest) {
                    smallest = temp;
                }
                count++;
            }
        }catch (Exception e){
            System.out.println("You didnt enter integer number.");
        }
        sc.nextLine();
        System.out.println("Biggest is: " + biggest + "\nSmallest is: "+smallest);

        //16 - Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.

        System.out.println("Enter number to reverse it");
        try {
        int first16 = sc.nextInt();
        String word16 = Integer.toString(first16);
        String rev16 ="";
        for (int i = word16.length()-1; 0 <= i ; --i){
            rev16 += word16.charAt(i);
        }
        System.out.println(rev16);
        }catch (InputMismatchException e){
            System.out.println("You didnt enter Integer number.");
        }


        sc.nextLine();

        //15.Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered (End loop use -1 ,
        //Don’t count -1).

        System.out.println("Enter numbers to check how many positive, negative and 0 and enter -1 to stop ");

        int neg=0;
        int pos = 0;
        int zero = 0;
        try {


            while (true) {
                int temp = sc.nextInt();
                if (temp == -1) {
                    break;
                }
                if (temp > 0) {
                    pos++;
                } else if (temp < 0) {
                    neg++;
                } else zero++;
            }
        }catch (InputMismatchException e){
            System.out.println("You didnt enter Integer number.");
        }
        System.out.println(pos + " Positive \n" + neg +" Negative\n" + zero + " Zero");
        sc.nextLine();

        //14. Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.

        System.out.println("Enter a number to check if + or - or 0: ");
        try {
            double first14 = sc.nextDouble();
            if (first14 > 0) {
                System.out.println("Number is positive");
            } else if (first14 < 0) {
                System.out.println("Number is negative");
            } else System.out.println("Number is 0");
        }catch (Exception e){
            System.out.println("You didnt enter Integer number.");
        }
        sc.nextLine();

        //13. Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise
        try {


            System.out.println("Enter for integer to check equality: ");
            System.out.println("First number");
            int first13 = sc.nextInt();
            System.out.println("Second Number");
            int second13 = sc.nextInt();
            System.out.println("Third number");
            int third13 = sc.nextInt();
            System.out.println("Fourth");
            int fourth13 = sc.nextInt();

            if (first13 == second13 && first13 == third13 && first13 == fourth13) {
                System.out.println("Numbers are equal");
            } else System.out.println("Numbers are not equal");
        }catch (InputMismatchException e){
            System.out.println("You didnt enter Integer number.");
        }
        sc.nextLine();

        //12. Write a Java program to convert seconds to hours, minutes and seconds.
        try {


            System.out.println("Enter second to convert to hours");
            int totalSecs = sc.nextInt();
            int hours = (totalSecs / 3600) % 24;
            int minutes = (totalSecs % 3600) / 60;
            int seconds = totalSecs % 60;

            System.out.println(hours + ":" + minutes + ":" + seconds);
        }catch (Exception e){
            System.out.println("You didnt enter Integer number.");
        }
        sc.nextLine();

        //11. Write a Java program to compare two numbers.

        try {


            System.out.println("Enter  2 integer to compare \n First Number ");
            int first11 = sc.nextInt();
            System.out.println("Second number");
            int second11 = sc.nextInt();
            if (first11 > second11) {
                System.out.println(first11 + " > " + second11);
            } else if (first11 != second11 && first11 < second11) System.out.println(first11 + " < " + second11);

            if (first11 >= second11) {
                System.out.println(first11 + " >= " + second11);
            } else System.out.println(first11 + " <= " + second11);
            if (first11 == second11) {
                System.out.println(first11 + " = " + second11);
            } else System.out.println(first11 + " != " + second11);
            //10. Write a Java program to print the area and perimeter of a rectangle.

            System.out.println("Enter width of a rectangle");
            double width10 = sc.nextDouble();
            System.out.println("Enter height of rectagle");
            double height10 = sc.nextDouble();
            System.out.println("Area is " + width10 + " * " + height10 + " = " + width10 * height10);
            System.out.println("perimeter is " + 2 + " * " + width10 + " + " + height10 + ") = " + (2 * (width10 + height10)));
        }catch (InputMismatchException e){
            System.out.println("You didnt enter a number");
        }
        sc.nextLine();

        //9 - Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.

        try {


            System.out.println("Enter a String");
            String word9 = sc.nextLine();
            System.out.println("Enter the number of the index:");
            int first9 = sc.nextInt();
            System.out.println(word9.charAt(first9));
        }catch (InputMismatchException e){
            System.out.println("you didnt enter a number");
        }
        sc.nextLine();

        //8 - Java program to convert the temperature in Centigrade to Fahrenheit
        try {
            System.out.println("Enter temperature in Centigrade: \n");
            double first8 = sc.nextDouble();
            System.out.println("Temperature in Fahrenheit is: " + ((first8 * 1.8) + 32));
        }catch (Exception e){
            System.out.println("you didnt enter a number");
        }
        sc.nextLine();
        //7 - Java program to check whether the given number is even or odd

        try {
            evenOdd(sc);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("You didnt enter a number");
        }
        sc.nextLine();
        //6. Write a Java program to reverse a word.

        try {
            reversAWord(sc);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.

        try {
            System.out.println("Enter three integers\nFirst integer");
            int first5 = sc.nextInt();
            System.out.println("Second integer");
            int second5 = sc.nextInt();
            System.out.println("Third integer");
            int third5 = sc.nextInt();
            System.out.println("First number is: " + first5 + "\nSecond number is: " + second5 + "\nThird number is: " + third5);
            if (first5 + second5 == third5) {
                System.out.println("Result: true");
            } else System.out.println("Result false");
        }catch (Exception e){
            System.out.println("You didnt enter a number");
        }

        //4. Java program to find out the average of a set of integers
        try {
            System.out.println("Enter the count of numbers: \n");
            int countLoop = sc.nextInt();
            double sum = 0;
            for (int i = 0; i < countLoop; i++) {
                System.out.println("Enter Integer");
                sum += sc.nextDouble();
            }
            System.out.println("The average is: " + (sum / countLoop));
        }catch (InputMismatchException e){
            System.out.println("You didnt enter a number");
        }

        sc.nextLine();

        //Write a Java program to print the area and perimeter of a circle.
        try {
            circule(sc);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("You didnt enter a number");
        }

        // Write a Java program that takes a number as input and prints its multiplication table up to
        //10.
        try {
            multiByTen(sc);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("you didnt enter a number");
        }
        //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //two numbers , takes two numbers as input
        try {
            operatinos(sc);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("You didnt enter a number");
        }
    }

    static void operatinos(Scanner sc) throws ArithmeticException {
        System.out.println("Enter 2 number to preform  * + / - on them\n First number");
        int firstNum1 = sc.nextInt();
        System.out.println("Second number");
        int secondNum1 = sc.nextInt();

        if(secondNum1 == 0){
            throw new ArithmeticException("You cant divide by 0 as second number");
        }

        System.out.println(firstNum1 + " + " + secondNum1 + " = " + (firstNum1 + secondNum1));
        System.out.println(firstNum1 + " - " + secondNum1 + " = " + (firstNum1 - secondNum1));
        System.out.println(firstNum1 + " * " + secondNum1 + " = " + (firstNum1 * secondNum1));
        System.out.println(firstNum1 + " / " + secondNum1 + " = " + (firstNum1 / secondNum1));
        System.out.println(firstNum1 + " % " + secondNum1 + " = " + (firstNum1 % secondNum1));

    }

    static void multiByTen(Scanner sc)throws ArithmeticException {
        System.out.println("Enter a number to see its muli to 10");
        int firstNum2 = sc.nextInt();
        if(firstNum2 ==0){
            throw new ArithmeticException("Any number multiplied by 0 is 0");
        }
        for (int i =0; i<10;i++){
            System.out.println(firstNum2+" * "+i+" = "+(firstNum2*i));
        }
    }

    static void circule(Scanner sc) throws ArithmeticException {
        System.out.println("Enter a radius of a circle");
        double radius = sc.nextDouble();
        if(radius<=0){
            throw new ArithmeticException("if radius is 0 or below that is not circle anymore");
        }
        System.out.println("Area is: " + 3.14*(radius*radius));
        System.out.println("Perimeter is: " + (2 * 3.14*radius));
    }

    static void evenOdd(Scanner sc) throws ArithmeticException {
        System.out.println("Enter a number");
        int first7 = sc.nextInt();
        if(first7 ==0){
            throw new ArithmeticException("Zero is not even or odd number");
        }
        if(first7 % 2 ==0){
            System.out.println("The number is even");
        }else System.out.println("The number is odd");
    }
    static void reversAWord(Scanner sc) throws Exception{
        System.out.println("Enter a word to reverse it: ");
        String  word6 = sc.nextLine();
        if(word6.length() ==1){
            throw new Exception("You entered a 1 length word which the reverse for it is just it.");
        }
        System.out.println("Reversed: "+ new StringBuilder(word6).reverse());

    }
}