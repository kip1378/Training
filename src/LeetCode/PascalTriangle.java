package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            if (i >= 2) {
                List<Integer> prevRow = result.get(i - 1);
                for (int j = 1; j < i; j++) {
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            if (i >= 1) {
                    row.add(1);
                }
                result.add(row);

        }
        return result;
    }
}
