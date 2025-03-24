package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class SquareDigit {
//    public int squareDigits(int n) {
//        String str = Integer.toString(n);
//        char[] charArray = str.toCharArray();
//
//        List<String> cia = new ArrayList<>();
//
//        for(char c : charArray) {
//            int digit = Character.getNumericValue(c);
//            cia.add(String.valueOf(digit * digit));
//        }
//        String result = String.join("", cia);
//        return Integer.parseInt(result);
//
//    }

    public int squareDigits(int n) {
        int result = 0; // Итоговое число
        int multiplier = 1; // Для сборки нового числа

        while (n > 0) {
            int digit = n % 10; // Берём последнюю цифру
            int squared = digit * digit; // Возводим в квадрат

            // Добавляем возведённое в квадрат число в результат
            result = squared * multiplier + result;

            // Увеличиваем множитель (10 для 1-значного числа, 100 для 2-значного и т.д.)
            multiplier *= (squared >= 10) ? 100 : 10;

            // Убираем последнюю цифру
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        SquareDigit sq = new SquareDigit();
        System.out.println(sq.squareDigits(369)); // Выведет: 49162536
//        System.out.println(sq.squareDigits(9119));  // Выведет: 811181
    }



}
