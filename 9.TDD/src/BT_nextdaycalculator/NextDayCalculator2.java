package BT_nextdaycalculator;

public class NextDayCalculator2 {
    private int day;
    private int month;
    private int year;

    public NextDayCalculator2() {
    }

    public NextDayCalculator2(int day, int month, int year) {
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

    public void display(int day, int month, int year) {
        boolean dayofleapyear = (day > 31 || day < 1 || month < 1 || month > 12 || (day == 30 && month == 2) || (day == 31 && month == 2));
        if (dayofleapyear) {
            System.out.println("Day does not of year!");
        } else if(day == 29 && month == 2) {
            System.out.println("Day : " + 1 + " , month : " + (month+1) + " , year : " + year);
        } else {
            setDayOfMonth(day, month, year);
        }
    }

    public void display1(int day, int month, int year) {
        boolean dayofyear = (day > 31 || day < 1 || month < 1 || month > 12 || (day == 30 && month == 2) || (day == 31 && month == 2) || (day == 29 && month == 2));
        if (dayofyear) {
            System.out.println("Day does not of year!");
        } else if(day == 28 && month == 2) {
            System.out.println("Day : " + 1 + " , month : " + (month + 1) + " , year : " + year);
        } else {
            setDayOfMonth(day, month, year);
        }
    }

    private void setDayOfMonth(int day, int month, int year) {
        if(day == 31 && month == 12) {
            System.out.println("Day : " + 1 + " , month : " + 1 + " , year : " + (year+1));
        }else if (day == 30) {
            boolean month30day = (month == 4 || month == 6 || month == 9 || month == 11);
            if (month30day) {
                System.out.println("Day : " + 1 + " , month : " + (month + 1) + " , year : " + year);
            } else {
                System.out.println("Day : " + 31 + " , month : " + month + " , year : " + year);
            }
        } else if (day == 31) {
            boolean month31day = (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12);
            if (month31day) {
                System.out.println("Day : " + 1 + " , month : " + (month + 1) + " , year : " + year);
            } else {
                System.out.println("Day does not of year!");
            }
        } else
            System.out.println("Day : " + (day + 1) + " , month : " + month + " , year : " + year);
    }
}
