package BT_fizzbuzz;

public class FizzBuzz {
    private static String a; //hàng đơn vị
    private static String b; //hàng chục
    private static String c;
    private int num;

    public FizzBuzz(int num) {
        this.num = num;
    }

    public FizzBuzz() {
    }

    public static String getA(int num) {
        return getNum(num%10);
    }

    public static String getB(int num) {
        return getNum2((num-(num%10))/10);
    }

    public static String getNum(int num) {
        switch (num) {
            case 1:
                a = "one";
                break;
            case 2:
                a = "two";
                break;
            case 3:
                a = "three";
                break;
            case 4:
                a = "four";
                break;
            case 5:
                a = "five";
                break;
            case 6:
                a = "six";
                break;
            case 7:
                a = "seven";
                break;
            case 8:
                a = "eight";
                break;
            case 9:
                a = "nine";
                break;
            case 10:
                a = "ten";
                break;
            case 11:
                a = "eleven";
                break;
            case 12:
                a = "twelfth";
                break;
            case 13:
                a = "thirteen";
                break;
            case 14:
                a = "fourteen";
                break;
            case 15:
                a = "fifteen";
                break;
            case 16:
                a = "sixteen";
                break;
            case 17:
                a = "seventeen";
                break;
            case 18:
                a = "eighteen";
                break;
            case 19:
                a = "nineteen";
                break;
            default:
                a = "";
        }
        return a;
    }

    public static String getNum2(int num){
        switch (num){
            case 2:
                b = "twenty";
                break;
            case 3:
                b = "thirty";
                break;
            case 4:
                b = "forty";
                break;
            case 5:
                b = "fifty";
                break;
            case 6:
                b = "sixty";
                break;
            case 7:
                b = "seventy";
                break;
            case 8:
                b = "eighty";
                break;
            case 9:
                b = "ninety";
            case 0:
            case 1:
                b = "";
        }
        return b;
    }

    public static String getResult(int num) {
        if(num%15 == 0){
            c = "FizzBuzz";
        }else if(num%5 == 0 || (num-(num%10))/10 == 5){
            c = "Buzz";
        }else if(num%3 == 0 || num%10 == 3){
            c = "Fizz";
        }else if(num >=1 && num <=20) {
            c = getA(num);
        }else if(num == 100){
            c = "One hundred";
        }else
            c = (getB(num) + " - " + getA(num));
        return c;
    }
}
