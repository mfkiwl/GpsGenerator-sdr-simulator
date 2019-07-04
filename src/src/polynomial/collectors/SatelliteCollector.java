package src.polynomial.collectors;

import src.generators.DataUtils;
import src.polynomial.PolynomialState;

import java.util.ArrayList;
import java.util.List;

public class SatelliteCollector implements PolynomialCollector {
    private final int[] indexes;
    private final List<Integer> values = new ArrayList<Integer>();

    /**
     * @param indexes, example from 1 to 10
     */
    public SatelliteCollector(int[] indexes) {
        this.indexes = indexes;
    }

    @Override
    public final int apply(PolynomialState state) {
        int value = DataUtils.exOr(state.getValues(), indexes);
        values.add(value);
        return value;
    }

    public List<Integer> getValues() {
        return values;
    }
}
