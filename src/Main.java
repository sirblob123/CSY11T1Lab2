/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Ian Yu
*****************************************************************************************************
*/
public class Main {

    public static void main(String[] args) {
    }

    // 1. add

    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    // 2. add
    public static int add(int num1, int num2, int num3, int num4) {
        int sum = add(add(num1, num2), add(num3, num4));
        return sum;
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        String mornGreet = "早上好, " + name + "!";
        return mornGreet;
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        String aftGreet = "下午好, " + name + "!";
        return aftGreet;
    }
    // 5. triple
    public static String triple(String toTriple) {
        String tripledString = toTriple + toTriple + toTriple;
        return tripledString;
    }
    // 6. half
    public static double half(double toHalve) {
        double halvedValue = toHalve / 2;
        return halvedValue;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double posRound) {
        int posRounded = (int) Math.round(posRound);
        return posRounded;
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double negRound) {
        int negRounded = 0;
        if (negRound % 1 == -0.5) {
            negRounded = (int) Math.floor(negRound);
        } else {
            negRounded = (int) Math.round(negRound);
        }
        return negRounded;
    }
}
