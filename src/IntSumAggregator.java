public class IntSumAggregator extends SumAggregator<Integer> {

    @Override
    protected Integer sum(Integer x, Integer y) {
        return x != null ? (y != null ? x + y : x) : y;
    }
}
