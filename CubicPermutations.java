import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CubicPermutations {
    public static void main(String[] args) {
        System.out.println(findNumber(5));
    }

    static Set<String> findNumber(int amount) {
        List<String> numList = new ArrayList<>();

        int digitsLimit = 3;
        int base = 2;
        
        while(true) {

            // Find all the number that has the cube in same digits (defined by digits limit)
            while (true) {
                String cube = Long.toString((long) Math.pow(base, 3));
                // System.out.println(cube);
                if (cube.length() <= digitsLimit) {
                    numList.add(cube);
                    // System.out.println(base);
                    base++;
                    continue;
                }
                digitsLimit++;
                break;
            }

            // Create a buffer to store all permutated cube
            // Loop through all the values inside the numList
            Set<String> buffer = new HashSet<>();
            while (!numList.isEmpty()) {
                PermNum permNum = new PermNum(numList.remove(0));
                buffer.add(permNum.getNumber());
                for (String n : numList) {
                    if (permNum.checkPerm(n)) {
                        buffer.add(n);
                    }
                }
                numList.removeAll(buffer);
                if (buffer.size() == amount) return buffer;
                buffer.clear();
            }
        }
    }
}
