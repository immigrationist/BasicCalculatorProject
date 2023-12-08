public class readNumber {
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
}
