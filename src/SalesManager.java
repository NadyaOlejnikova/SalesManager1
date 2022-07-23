public class SalesManager {
    protected long[] sales = {100, 200, 300};

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


    public String toString() {
        return "Наиболее покумаемое количество товара  " + max();
    }
}