public class NumCompare {
    public static void main(String[] args) {
        System.out.println("Enter two numbers.");
        int num1 = 4;
        int num2 = 2;
        if (num1 > num2) {
            System.out.println(num2 + " is less than " + num1);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else if (num1 == num2) {
            System.out.println(num1 + " is equal to " + num2);
        }else{
            System.out.println("Not valid input. Terminate and Try Again.");
        }
    }
}