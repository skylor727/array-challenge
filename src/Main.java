import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//For each element of an array a counter is set to 0. The element is compared to each element to its left. if the element to the left is greater
// the diff should be subtracted from the counter
// if the element to the left is less, the absolute difference is added to the counter
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> inputList = new ArrayList<>();
        System.out.println("Enter arr length");
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.println("Enter num to add to array");
            Long numToAdd = sc.nextLong();
            inputList.add(numToAdd);
        }
        List<Long> test = arrayChallenge(inputList);
        System.out.println(test);

    }

    public static List<Long> arrayChallenge(List<Long> arr) {
        ArrayList<Long> arrList = new ArrayList<>();
        arrList.add(0L);
        for (int i = 1; i < arr.size(); i++) {
            long ctr = 0L;
            for (int x = i - 1; x >= 0; x--) {
                long baseNum = arr.get(i);
                long leftNum = arr.get(x);
                if (baseNum > leftNum) {
                    ctr -= leftNum - baseNum;
                } else if (baseNum < leftNum) {
                    ctr += baseNum - leftNum;
                }
            }
            arrList.add(ctr);
        }
        return arrList;
    }
}
