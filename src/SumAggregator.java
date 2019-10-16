public class SumAggregator implements Aggregator<Integer, Integer> {
    @Override
    public Integer aggregate(Integer[] items) {
        int sum = 0;
        for (Integer num : items) {
            sum += num;
        }
        return sum;
    }

}

