public class Array {
    public static void main(String[] args) {
      int[] number = {1, 2, 3, 4,5,6,7,8,9,10};
      for (int i = 1; i < number.length ; i++) {
        System.out.println(number[i]);
        if (i % 2 == 0) {
            System.out.println(i +" is even");
        }
        else{
            System.out.print(i +" is odd ");
        }
      }
    }
  }
  