public class Find_odd {

  public static int find(int[] arr) {
    int mask = 1, count, result = 0;
    for (int j = 0; j < 32; j++) {
      count = 0;
      mask = 1 << j;
      for (int i = 0; i < arr.length; i++) {
        if ((arr[i] & mask) != 0) count++;
      }
      if (count % 3 != 0) result |= mask;
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr = { 2, 2, 125, 2, 7, 7, 8, 7, 8, 8 };
    int num = find(arr);
    System.out.println("Your single present number is: "+num);
  }
}
