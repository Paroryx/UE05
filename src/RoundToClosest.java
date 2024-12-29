import java.util.Arrays;

public class RoundToClosest {
    public static void main(String[] args) {
        testRoundToClosest(-11, 0, new int[] {11,0,-1,-33,-11,-5}, new int[] {0,0,0,-11,-11,0});
        testRoundToClosest(0, 11, new int[] {11,0,-1,-33,-11,7}, new int[] {11,0,0,0,0,11});
        testRoundToClosest(150,300, new int[] {123,155,333,-333,225,223}, new int[] {150,150,300,150,300,150});
    }

    static void testRoundToClosest(int min, int max, int[] values, int[] expected) {
        System.out.println("Testing roundToClosest (%d,%d,%s):".formatted(min, max, Arrays.toString(values)));
        int[] actual = roundToClosest(min, max, values);
        System.out.println("Result: %s".formatted(Arrays.toString(actual)));
        if (actual.length == expected.length) {
            System.out.println("SUCCESS: Result has correct length");
        } else {
            System.out.println("ERROR: Result does not have expected length %d".formatted(expected.length));
        }
        int minLen = Math.min(actual.length, expected.length);
        boolean allCorrect = true;
        for (int i = 0; i < minLen; i++) {
            if (actual[i] != expected[i]) {
                allCorrect = false;
                System.out.println("ERROR @ idx %d: %d does not match expected result %d".formatted(i, actual[i], expected[i]));
            }
        }
        if (allCorrect) {
            System.out.println("SUCCESS: Result matches expected result");
        }
        System.out.println();
    }

    private static int[] roundToClosest(int min, int max, int... values){
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = roundToClosest(min, max, values[i]);
        }
        return result;
    }

    private static int roundToClosest(int min, int max, int value){
        int distToMin = Math.abs(value-min);
        int distToMax = Math.abs(value-max);

        if(distToMax <= distToMin){
            return max;
        }else{
            return min;
        }
    }

}
