import some.packadge.counter.Counter;

public class App {

    public static void main(String[] args) {
        String str = "Tumut";
        System.out.println(isPalindrome(str));
    }

    public static boolean greaterThan(String str1, String str2) {
        return Counter.bigLettersCount(str1) > Counter.bigLettersCount(str2);
    }

    static String whoIsThisHouseToStarks(String secondName) {
        if (secondName.equals("Karstark") || secondName.equals("Tally")) {
            return "friend";
        } else if (secondName.equals("Lannister") || secondName.equals("Frey")) {
            return "enemy";
        } else {
            return "neutral";
        }
    }

    static String convertString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.charAt(0) >= 101 && str.charAt(0) <= 132) {
            return str;
        } else {
            return new StringBuilder(str).reverse().toString();
        }
    }

    static String getNumberExplanation(int integer) {
        switch (integer) {
            case 666 -> {
                return "devil number";
            }
            case 42 -> {
                return "answer for everything";
            }
            case 7 -> {
                return "prime number";
            }
            default -> {
                return "just a number";
            }
        }
    }

    public static int multiplyNumbersFromRange(int start, int finish) {
        int sum = 1;
        for (int i = start; i <= finish; i++) {
            sum *= i;
        }
        return sum;
    }

    public static String joinNumbersFromRange(int start, int finish) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= finish; i++) {
            result.append(i);
        }
        return result.toString();
    }

    public static void printReversedNameBySymbol(String name) {
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
    }

    public static int countChars(String str, char ch) {
        int count = 0;
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++) {
                if (lowerCase.charAt(i) == Character.toLowerCase(ch)) {
                    count++;
                }
            }
        return count;
    }

    public static String filterString(String str, char ch) {
        return str.replaceAll(Character.toString(ch), "");
    }
    
    public static String makeItFunny(String str, int n) {
        int count = 1;
        String result = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (count == n) {
                result += Character.toString(str.charAt(i)).toUpperCase();
                count = 0;
            } else {
                result += Character.toString(str.charAt(i));
            }
            count++;
        }
      return result;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        var divider = 2;
        while (divider <= number / 2) {
            if(number % divider == 0) {
                return false;
            }

            divider += 1;
        }
        return true;
    }

    public static boolean hasChar(String str, char ch) {
        return str.contains(Character.toString(ch));
    }

    public static String encrypt(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (; i + 1 < str.length(); i += 2) {
            sb.append(str.charAt(i + 1)).append(str.charAt(i));
        }
        if (i < str.length()) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String str) {
        String normalizeStr = str.toLowerCase();
       int left = 0;
       int right = normalizeStr.length() -  1;
       while (left < right) {
           if (normalizeStr.charAt(left++) != normalizeStr.charAt(right--)) {
               return false;
           }
       }
        return true;
    }


}





