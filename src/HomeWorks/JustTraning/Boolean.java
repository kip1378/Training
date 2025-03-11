package HomeWorks.JustTraning;

public class Boolean {
    public class StringValidator {
        public static boolean isValidString(String input) {
            // Проверка минимальной длины
            if (input.length() < 8) {
                return false;
            }

            // Флаги для проверки условий
            boolean hasUppercase = false;
            boolean hasLowercase = false;
            boolean hasDigit = false;

            // Проверка каждого символа строки
            for (char c : input.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowercase = true;
                } else if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (!Character.isLetterOrDigit(c)) {
                    return false; // Если найден пробел или специальный символ
                }
            }

            // Возврат результата
            return hasUppercase && hasLowercase && hasDigit;
        }

        public static void main(String[] args) {
            // Примеры строк для тестирования
            System.out.println(isValidString("Hello123")); // false (меньше 8 символов)
            System.out.println(isValidString("HelloWorld1")); // true
            System.out.println(isValidString("hello world1")); // false (содержит пробел)
            System.out.println(isValidString("HELLO123")); // false (нет строчной буквы)
        }
    }

}
