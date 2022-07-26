public class SalesManager {

    protected int[] sales = {1000, 100, 100, 300, 400};

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
        int sum = 0;
        int min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = (int) sale;
            }
            sum += sale;
        }
        return (int) ((sum - min - max()) / (sales.length - 2));
    }

    public String toString() {
        return "Наиболее покумаемое количество товара  " + max() + "\n" + "Наимение покупаемое количество товара  " + min() + "\n"
                + "Cреднее количество продаж среди всех продаж, за исключением самой максимальной и самой минимальной цифры " + average();
    }
}