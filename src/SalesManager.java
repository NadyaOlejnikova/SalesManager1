public class SalesManager {

    protected int[] sales = {15000, 500, 300, 100, 1000};

    public SalesManager() {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int average() {
        int average = 0;
        int count = 0;
        int averageWithoutMinAndMax = 0;
        for (int sale : sales) {
            if (sale != min() && sale != max()) {
                count++;
                average += sale;
                averageWithoutMinAndMax = average / count;
            }
        }
        return averageWithoutMinAndMax;
    }

    public String toString() {
        return "Наиболее покумаемое количество товара  " + max() + "\n" + "Наимение покупаемое количество товара  " + min() + "\n"
                + "Cреднее количество продаж среди всех продаж, за исключением самой максимальной и самой минимальной цифры " + average();
    }
}