import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermNum {

    private String number;
    private String sortedNum;

    public PermNum(int number) {
        this.number = Integer.toString(number);
        sortNumber(Integer.toString(number));
    }

    public PermNum(long number) {
        this.number = Long.toString(number);
        sortNumber(Long.toString(number));
    }

    public PermNum(String number) {
        this.number = number;
        sortNumber(number);
    }

    private void sortNumber(String number) {
        this.sortedNum = mergeSort(number);
    }

    public boolean checkPerm(String otherNumber) {
        return this.sortedNum.equals(mergeSort(otherNumber));
    }

    public boolean checkPerm(int otherNumber) {
        return this.sortedNum.equals(mergeSort(Integer.toString(otherNumber)));
    }

    static boolean checkPerm(String number1, String number2) {
        return mergeSort(number1).equals(mergeSort(number2));
    }

    static String mergeSort(String number) {
        // Create the main array
        List<String> arrayNum = Arrays.asList(number.split(""));

        // Base case
        if (arrayNum.size() == 1) return arrayNum.get(0);

        // Initialize the 2 half of array recursively
        int half = arrayNum.size() / 2;
        List<String> arrayHalfLeft = Arrays.asList(mergeSort(String.join("", arrayNum.subList(0, half))).split(""));
        List<String> arrayHalfRight = Arrays.asList(mergeSort(String.join("", arrayNum.subList(half, arrayNum.size()))).split(""));

        return merge(new ArrayList<>(arrayHalfLeft), new ArrayList<>(arrayHalfRight));

    }

    private static String merge(List<String> array1, List<String> array2) {
        List<String> array3 = new ArrayList<>();

        // Check whether array 1 or 2 is empty, if not append the smaller element into array 3 and remove it from source
        while (!array1.isEmpty() && !array2.isEmpty()) {
            if (array1.get(0).charAt(0) > array2.get(0).charAt(0)) {
                array3.add(array2.remove(0));   
            } else array3.add(array1.remove(0));  
        }

        // At this point either array 1 or 2 is empty
        while (!array1.isEmpty()) array3.add(array1.remove(0));
        while (!array2.isEmpty()) array3.add(array2.remove(0));

        return String.join("", array3);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSortedNum() {
        return sortedNum;
    }
    
}
