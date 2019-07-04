package src.satellites;

import src.polynomial.PolynomialTwo;
import src.polynomial.collectors.SatelliteCollector;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Robert on 01.10.2017.
 */
public class SatellitesCaFactory {

    public static final int COMPLETE_CA = 1024;
    public static final int SAT_COUNT = 32;

    public static final int[] SAT_1 = new int[]{2, 6};
    public static final int[] SAT_2 = new int[]{3, 7};
    public static final int[] SAT_3 = new int[]{4, 8};
    public static final int[] SAT_4 = new int[]{5, 9};
    public static final int[] SAT_5 = new int[]{1, 9};
    public static final int[] SAT_6 = new int[]{2, 10};
    public static final int[] SAT_7 = new int[]{1, 8};
    public static final int[] SAT_8 = new int[]{2, 9};
    public static final int[] SAT_9 = new int[]{3, 10};
    public static final int[] SAT_10 = new int[]{2, 3};
    public static final int[] SAT_11 = new int[]{3, 4};
    public static final int[] SAT_12 = new int[]{5, 6};
    public static final int[] SAT_13 = new int[]{6, 7};
    public static final int[] SAT_14 = new int[]{7, 8};
    public static final int[] SAT_15 = new int[]{8, 9};
    public static final int[] SAT_16 = new int[]{9, 10};
    public static final int[] SAT_17 = new int[]{1, 4};
    public static final int[] SAT_18 = new int[]{2, 5};
    public static final int[] SAT_19 = new int[]{3, 6};
    public static final int[] SAT_20 = new int[]{4, 7};
    public static final int[] SAT_21 = new int[]{5, 8};
    public static final int[] SAT_22 = new int[]{6, 9};
    public static final int[] SAT_23 = new int[]{1, 3};
    public static final int[] SAT_24 = new int[]{4, 6};
    public static final int[] SAT_25 = new int[]{5, 7};
    public static final int[] SAT_26 = new int[]{6, 8};
    public static final int[] SAT_27 = new int[]{7, 9};
    public static final int[] SAT_28 = new int[]{8, 10};
    public static final int[] SAT_29 = new int[]{1, 6};
    public static final int[] SAT_30 = new int[]{2, 7};
    public static final int[] SAT_31 = new int[]{3, 8};
    public static final int[] SAT_32 = new int[]{4, 9};

    private static final List<int[]> goldNumbers = Arrays.asList(SAT_1, SAT_2, SAT_3, SAT_4, SAT_5, SAT_6, SAT_7, SAT_8, SAT_9, SAT_10, SAT_11, SAT_12, SAT_13, SAT_14, SAT_15, SAT_16, SAT_17, SAT_18, SAT_19, SAT_20,
            SAT_21, SAT_22, SAT_23, SAT_24, SAT_25, SAT_26, SAT_27, SAT_28, SAT_29, SAT_30, SAT_31, SAT_32);

    public static PolynomialTwo createFor(int[] goldNumbers) {
        return new PolynomialTwo(goldNumbers);
    }

    public static List<int[]> getGoldNumbersintArrayList(){
        return goldNumbers;
    }

    public static List<SatelliteCollector> createSatelliteCollectors() {
        return Arrays.asList(
                new SatelliteCollector(SatellitesCaFactory.SAT_1),
                new SatelliteCollector(SatellitesCaFactory.SAT_2),
                new SatelliteCollector(SatellitesCaFactory.SAT_3),
                new SatelliteCollector(SatellitesCaFactory.SAT_4),
                new SatelliteCollector(SatellitesCaFactory.SAT_5),
                new SatelliteCollector(SatellitesCaFactory.SAT_6),
                new SatelliteCollector(SatellitesCaFactory.SAT_7),
                new SatelliteCollector(SatellitesCaFactory.SAT_8),
                new SatelliteCollector(SatellitesCaFactory.SAT_9),
                new SatelliteCollector(SatellitesCaFactory.SAT_10),
                new SatelliteCollector(SatellitesCaFactory.SAT_11),
                new SatelliteCollector(SatellitesCaFactory.SAT_12),
                new SatelliteCollector(SatellitesCaFactory.SAT_13),
                new SatelliteCollector(SatellitesCaFactory.SAT_14),
                new SatelliteCollector(SatellitesCaFactory.SAT_15),
                new SatelliteCollector(SatellitesCaFactory.SAT_16),
                new SatelliteCollector(SatellitesCaFactory.SAT_17),
                new SatelliteCollector(SatellitesCaFactory.SAT_18),
                new SatelliteCollector(SatellitesCaFactory.SAT_19),
                new SatelliteCollector(SatellitesCaFactory.SAT_20),
                new SatelliteCollector(SatellitesCaFactory.SAT_21),
                new SatelliteCollector(SatellitesCaFactory.SAT_22),
                new SatelliteCollector(SatellitesCaFactory.SAT_23),
                new SatelliteCollector(SatellitesCaFactory.SAT_24),
                new SatelliteCollector(SatellitesCaFactory.SAT_25),
                new SatelliteCollector(SatellitesCaFactory.SAT_26),
                new SatelliteCollector(SatellitesCaFactory.SAT_27),
                new SatelliteCollector(SatellitesCaFactory.SAT_28),
                new SatelliteCollector(SatellitesCaFactory.SAT_29),
                new SatelliteCollector(SatellitesCaFactory.SAT_30),
                new SatelliteCollector(SatellitesCaFactory.SAT_31),
                new SatelliteCollector(SatellitesCaFactory.SAT_32)
        );
    }

}
