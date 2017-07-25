package com.example;

public enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}


    Month month;

    private String[] englishName = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Month() {
        this.month = month;
    }

    public String[] getEnglishName() {
        return englishName;
    }

    public void switchMonths() {
        switch (month) {
            case JANUARY:
                System.out.println("You selected January, the remaining months in the year are: February, March, April, May, June, July, August, September, Ocotober, November, December");
                break;
            case FEBRUARY:
                System.out.println("You selected Febraury, the remaining months in the year are: March, April, May, June, July, August, September, Ocotober, November, December");
                break;
            case MARCH:
                System.out.println("You selected March, the remaining months in the year are: April, May, June, July, August, September, Ocotober, November, December");
                break;
            case APRIL:
                System.out.println("You selected April, the remaining months in the year are: May, June, July, August, September, Ocotober, November, December");
                break;
            case MAY:
                System.out.println("You selected May, the remaining months in the year are: June, July, August, September, Ocotober, November, December");
                break;
            case JUNE:
                System.out.println("You selected June, the remaining months in the year are: July, August, September, Ocotober, November, December");
                break;
            case JULY:
                System.out.println("You selected July, the remaining months in the year are: August, September, Ocotober, November, December");
                break;
            case AUGUST:
                System.out.println("You selected August, the remaining months in the year are: September, Ocotober, November, December");
                break;
            case SEPTEMBER:
                System.out.println("You selected September, the remaining months in the year are: Ocotober, November, December");
                break;
            case OCTOBER:
                System.out.println("You selected October, the remaining months in the year are: November, December");
                break;
            case NOVEMBER:
                System.out.println("You selected November, the remaining month in the year are: December");
                break;

            default:
                System.out.println("There are no remaining months in the year.");
                break;
        }


    }







