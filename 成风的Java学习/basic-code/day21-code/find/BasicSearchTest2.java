import java.util.ArrayList;

public class BasicSearchTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 9, 10};
        int target = 5;
        ArrayList<Integer> indexList = basicSearch(arr, target);
        for (int i = 0; i < indexList.size(); i++) {
            System.out.println(indexList.get(i));
        }
    }

    public static ArrayList<Integer> basicSearch(int[] arr, int target) {
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indexList.add(i);
            }
        }
        return indexList;
    }
    
}
