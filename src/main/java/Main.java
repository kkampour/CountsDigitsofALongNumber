import java.util.Scanner;

public class Main {

        static int countDigitOfLong(long n)
        {
            int counter = 0;
            while (n != 0) {
                n = n / 10;
                ++counter;
            }
            return counter;
        }


        public static void main(String[] args)
        {

            System.out.println("Enter a number to count its digits");
            Scanner in = new Scanner(System.in);

            long n=in.nextLong();

            System.out.print("Number of digits : " + countDigitOfLong(n));
        }

}

