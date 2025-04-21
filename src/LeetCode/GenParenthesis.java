package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenParenthesis {
    public List<String> generateParenthesis(int n) {
        if (1 <= n && n <= 8) {
            List<String> result = new ArrayList<>();
            backtrack("",n,n,result);
            return result;
        } else {
            return null;
        }
    }
    private void backtrack (String current, int open, int close, List<String> result){
        if (open == 0 && close == 0) {
            result.add(current);
        }
            if (open > 0) {
                backtrack(current + "(", open - 1, close,result);
            }
            if (close > open) {
                backtrack(current + ")", open, close -1, result);
            }
        }

    public static void main(String[] args) {
        GenParenthesis genParenthesis = new GenParenthesis();
        System.out.println(genParenthesis.generateParenthesis(3));
    }
}
