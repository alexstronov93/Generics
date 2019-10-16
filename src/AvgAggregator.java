public class AvgAggregator implements Aggregator<Double, Double> {
    @Override
    public Double aggregate(Double[] items) {
        double sum = 0;
        for (Double num : items) {
            sum += num;
        }
        return sum / items.length;
    }
}
