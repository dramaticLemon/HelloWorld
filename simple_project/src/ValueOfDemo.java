

/*
if (str.matches("-?\\d+") {
    int val = Integer.parseInt(str);
    //..
} else {
    // format error

 */

public class ValueOfDemo {
    public static void main(String[] args) {

        if (args.length == 2) {
            float a = (Float.valueOf(args[0])).floatValue();
            float b = (Float.valueOf(args[1])).floatValue();
            /*
            float a = Float.parseFloat(args[0])
             */
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("This program " +
                    "requires two command-lone arguments");
        }
    }
}

