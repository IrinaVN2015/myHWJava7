package ru.netology.myHWJava7.stats;

public class StatsService {
    public int sumSales(int[] sales) {
        int sumMonth = 0;
        for (int value : sales) {
            sumMonth = sumMonth + value;
        }
        return sumMonth;
    }

    public int averageSales(int[] sales) {
        int numberArray = sales.length;
        int sumMonth = sumSales(sales);
        int averageMonth = sumMonth / numberArray;
        return averageMonth;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthsLowestSales(int[] sales) {
        int average = averageSales(sales);
        int count = 0; //счетчик месяцев
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int monthsGreatestSales(int[] sales) {
        int average = averageSales(sales);
        int count = 0; //счетчик месяцев
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}


