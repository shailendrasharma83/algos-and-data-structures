package arrays;

//Find a number in array
public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(searchInArray(arr, 6));
    }


    public static int searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if(valueToSearch == intArray[i])
                return i;
        }
        return -1;
    }
}
