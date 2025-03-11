package HomeWorks.Hw9;

public class NumberToText {
    public static void main(String[] args) {
        System.out.println(numberToText(6788888));
    }

    public static String numberToText(int number) {
        String[] words = {"ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        char [] digitChars =String.valueOf(number).toCharArray();

        String result = "";
        String separator = "";
        for (char digitChar: digitChars) { // перебор массива digitChars и присваивание в переменную digitChar (for each)
            int digitInt = Integer.parseInt(String.valueOf(digitChar)); //символ в строку - строку в число int
            String word = words[digitInt]; //извлекает элемент из массива строк (words) по индексу, который указан в переменной digitInt, и присваивает этот элемент переменной word.
            result += separator +word;
            separator = " ";

        }
        return result;
    }
}
//    // Массив для словесного представления цифр от 0 до 9
//    private static final String[] digitNames = {
//            "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"
//    };
//
//    // Метод для преобразования числа в слова по каждой цифре
//    public static String convertDigitsToWords(int number) {
//        String numberAsString = String.valueOf(number);
//        StringBuilder words = new StringBuilder();
//
//        // Преобразуем каждую цифру в соответствующее слово
//        for (int i = 0; i < numberAsString.length(); i++) {
//            int digit = Character.getNumericValue(numberAsString.charAt(i));
//            words.append(digitNames[digit]).append(" ");
//        }
//
//        return words.toString().trim();
//    }
//
//    public static void main(String[] args) {
//        int number = 987564325;
//        System.out.println(number + " = " + convertDigitsToWords(number));
//    }


