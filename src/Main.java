public class Main {
    public static void main(String[] args) {
            for (int year = 2021; year < 4000; year++) {
            if ((year % 4 == 0) && year % 100 != 0)
            {
                System.out.println(year + " Весокосный год");
            }
            else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
            {
                System.out.println(year + "Весокосный год");
            }
            else
            {
                System.out.println(year + " Не весокосный год");
            }}}}