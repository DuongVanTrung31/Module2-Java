package BT_nextdaycalculator;

public class NextDayCalculator3 {
    private static int day;
    private static int month;
    private static int year;

    public NextDayCalculator3() {
    }

    public NextDayCalculator3(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean checkYear(int year) {
        boolean isLeapYear = false;
        boolean isDivisionBy4 = year % 4 == 0;
        if (isDivisionBy4) {
            boolean isDivisionBy100 = year % 100 == 0;
            if (isDivisionBy100) {
                boolean isDivisionBy400 = year % 400 == 0;
                if (isDivisionBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    public static int[] display(int day, int month, int year) {
        boolean dayofleapyear = (day > 31 || day < 1 || month < 1 || month > 12 || (day == 30 && month == 2) || (day == 31 && month == 2));
        int[] arr = new int[3];
        if (dayofleapyear) {
            return arr = new int[]{0, 0, 0};
        } else if(day == 29 && month == 2) {
            return arr = new int[]{1, month+1, year};
        } else {
            setDayOfMonth(day, month, year);
        }
        return arr;
    }

    public static int[] display1(int day, int month, int year) {
        boolean dayofyear = (day > 31 || day < 1 || month < 1 || month > 12 || (day == 30 && month == 2) || (day == 31 && month == 2) || (day == 29 && month == 2));
        int[] arr = new int[3];
        if (dayofyear) {
            System.out.println("Day does not of year!");
        } else if(day == 28 && month == 2) {
            return arr = new int[]{1, month+1, year};
        } else {
            setDayOfMonth(day, month, year);
        }
        return arr;
    }

    public static int[] setDayOfMonth(int day, int month, int year) {
        int[] arr = new int[3];
        if(day == 31 && month == 12) {
            return arr = new  int[]{1, 1, year+1};
        }else if (day == 30) {
            boolean month30day = (month == 4 || month == 6 || month == 9 || month == 11);
            if (month30day) {
                return arr = new int[]{1, month+1, year};
            } else {
                return arr = new int[]{31, month, year};
            }
        } else if (day == 31) {
            boolean month31day = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12);
            if (month31day) {
                return arr = new int[]{1, month+1, year};
            } else {
                return arr = new int[]{0, 0, 0};
            }
        } else
            return arr = new int[]{day+1, month, year};
    }
}
