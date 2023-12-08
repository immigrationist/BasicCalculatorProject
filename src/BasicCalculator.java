public class BasicCalculator {
        public static int readNumber()throws Exception{
            int number = 0;
            char digitAsciiCode = '0';
            int value = 0;

            digitAsciiCode = (char)System.in.read();
            while(digitAsciiCode != '\n'){
                value = digitAsciiCode - '0';
                number = number * 10 + value;
                digitAsciiCode = (char)System.in.read();
            }
            return number;
        }

    public static boolean validateArithOper(int num1, int num2,
                                            char oper  )
    {
        //This subroutine receives as input two integers and
        //an operation and returns false if the operation is
        //invalid or if we are trying to divide by 0 or true
        //otherwise
        boolean valid = true;

        if (oper != '+' && oper != '-' && oper != 'x'
                && oper != '/')
            valid = false;

        if (oper == '/' && num2 == 0)
            valid = false;

        return valid;

    }

    public static double performArithOper(int num1, int num2,
                                          char oper  )
    {
        //This subroutine receives as input two integers and
        //a character, performs the operation represented by
        //the character and then returns the result to the
        //calling program/subprogram

        double result = 0.0;

        if ( oper == '+')
            result = num1 + num2;
        else if ( oper == '-')
            result = num1 - num2;
        else if ( oper == 'x')
            result = num1 * num2;
        else if ( oper == '/')
            result = num1 / num2;

        return result;
    }

    public static void main(String[] args) {
        int number1;
        int number2;
        char operation;
        double result = 0.0;
        char answer = 'y';

        while(answer == 'y') {
            try {
                System.out.println("Enter first number");
                number1 = readNumber();
                System.out.println("Enter second number");
                number2 = readNumber();
                System.out.println("Enter operation");
                operation = (char) System.in.read();
                System.in.read();

                boolean success = validateArithOper(number1, number2, operation);

                if(success == true){
                    result = performArithOper(number1, number2, operation);
                    System.out.println("The result is " + result);
                }
                else
                    System.out.println("Invalid operation or division by 0");

                System.out.println("Try again, y/n?");
                answer = (char)System.in.read();
                System.in.read();

            } catch (Exception e) {
                System.out.println("Keyboard malfunctioned");
            }
        }
        System.out.println("The result is " + result);
    }
}
