import java.util.Scanner;

import static java.lang.String.valueOf;

public class validate {


    // Returns true if given

// card number is valid
        static boolean checkLuhn(long cardNo)
        {


            String newCard=String.valueOf(cardNo);

            int nDigits = newCard.length();
            int nSum = 0;
            boolean isSecond = false;
            for (int i = nDigits - 1; i >= 0; i--)
            {
                int d = newCard.charAt(i) - '0';
                if (isSecond)
                    d = d * 2;

                // We add two digits to handle
                // cases that make two digits
                // after doubling
                nSum += d / 10;
                nSum += d % 10;

                isSecond = !isSecond;
            }
            return (nSum % 10 == 0);
        }

        // Driver code
        static public void main (String[] args)
        {

            Scanner CardNo = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter Card Number: ");

            long cardno = CardNo.nextLong();  // Read user input
            if (checkLuhn(cardno))
                System.out.println(cardno + "is valid");
            else
                System.out.println(cardno+" is invalid");

        }
    }


