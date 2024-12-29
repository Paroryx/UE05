import java.util.Arrays;

public class ArrayMethods {


  public static void main(String[] args) {
    testMax(new int[] {-4,2,0,0,-23},-3);
    testMax(new int[] {-4,2,0,0,-23},2);
    testMax(new int[] {-1,-1,-1,-2,-334,-123,-3}, -1);

    testAdd(new int[] {1,2,3,4,5}, 3, new int[] {4,5,6,7,8});
    testAdd(new int[] {1,2,3,4,5}, 3, new int[] {4,5,6,-7,8});
    testAdd(new int[] {-1,-2,3,-4,-5}, -3, new int[] {-4,-5,0,-7,-8});
    testAdd(new int[] {-1,-2,3,-4,-5}, -3, new int[] {-4,-5,0,-7});
  }

  public static int max(int[] arr) {
    int max = Integer.MIN_VALUE; // previous error: was earlier set to 0
    for(int val : arr) {
      max = Math.max(max, val);
    }
    return max;
  }

  public static int[] add(int[] arr, int delta) {
    int[] addArr = new int[arr.length]; // previous error: length was set arr.length+ 1

    for(int i = 0; i < arr.length; i++) {
      addArr[i] = arr[i] + delta; // previous error: delta was subtracted not added
    }
    return addArr;
  }

  public static void testMax(int[] arr, int expected) {
      StringBuilder sb = new StringBuilder();
      sb.append("Testing max(%s)\n".formatted(Arrays.toString(arr)));
      int result = max(arr);
      sb.append(" Expected: %d.\n Result: %d.\n".formatted(expected,result));
      if(result == expected){
        sb.append(" SUCCESS: Result matches expected result.\n");
      }else{
        sb.append(" ERROR: Result does not match expected result.\n");
      }
      Out.println(sb.toString());
  }
  
  public static void testAdd(int[] arr, int delta, int[] expected) {
    StringBuilder sb = new StringBuilder();
    sb.append("Testing add(%s, %d)\n".formatted(Arrays.toString(arr), delta));
    int[] result = add(arr, delta);
    sb.append(" Expected: %s.\n Result: %s.\n".formatted(Arrays.toString(expected),Arrays.toString(result)));
    if(result.length == expected.length ){
        sb.append(" SUCCESS Result has correct length.\n");
        sb.append(checkArray(result, expected));
    }else{
      sb.append(" ERROR Result has no correct length.\n");
    }
    Out.println(sb.toString());
}

  private static String checkArray(int[] result, int[] expected) {
    String feedbackString = "";
    boolean allEqual = true;
    for (int i = 0; i < expected.length; i++) {
      if(result[i] != expected[i]){
        allEqual = false;
        feedbackString+=" ERROR @ idx %d: %d does not match expected result %d.\n".formatted(i, result[i], expected[i] );
      }
    }
    if(allEqual){
      return " SUCCESS: Result matches expected result.\n";
    }
    return feedbackString;
  }
}
