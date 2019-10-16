public class CountAggregator<T> implements Aggregator<Integer, T> {


    public Integer aggregate(T[] items) {
        return items.length;
    }
}
