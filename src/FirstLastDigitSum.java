public class FirstLastDigitSum {


    public static int sumFirstAndLastDigit (int number) {

        if(number < 0) {
            return -1;
        }
        int num = number;
        int lastDigit = num % 10;
        while(num > 9 ){
            num = num/10;
        }
        System.out.println(lastDigit + num);
        return lastDigit + num;
        }

}




