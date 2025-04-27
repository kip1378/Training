package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {

    private static final String[] map = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.isEmpty() || digits.length() > 4) {
            return result;
        }
        backTrack(digits,"", 0, result );
        return result;
    }

    private void backTrack (String digits, String path, int index, List<String> result) {
        if (index == digits.length()){
            result.add(path);
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        for(char letter : letters.toCharArray()) {

            backTrack(digits, path + letter, index + 1, result);
        }
    }
}
