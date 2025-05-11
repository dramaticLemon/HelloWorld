package some.packadge.counter;

public class Counter {
    public static int bigLettersCount(String str) {
        var result = 0;

        for (var i = 0; i < str.length(); i++) {
            var current = str.charAt(i);
            if (Character.toUpperCase(current) == current) {
                result++;
            }
        }
        return result;
    }
}
