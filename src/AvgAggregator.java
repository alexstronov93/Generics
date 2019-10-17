public class AvgAggregator implements Aggregator<Double, Number> {
    @Override
    public Double aggregate(Number[] items) {
        if (items == null) {
            throw new IllegalArgumentException("Cant aggregate null");
        }
        int lenght = items.length;
        if (lenght == 0) {
            throw new IllegalArgumentException("Empty array");
        }
        double sum = 0;
        for (Number num : items) {
            if (num != null) {
                sum += num.doubleValue();
            }
        }
        return sum / lenght;
    }
}
