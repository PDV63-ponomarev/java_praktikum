package algorithm1;

public class FindMin3 {
    public static void main(String[] args) {
        int[] array = {12, 24, 2, 43, 23, 10, 4, 1};
        int[] array2 = new int[]{12, 24, 2, 43, 23, 10, 4, 1};

        System.out.println(getMin(array));

    }

    public static int getMin(int[] array){
        int min = array[0];
        for (int element : array){
            if (element < min){
                min = element;
            }
        }
        return min;
    }
}
