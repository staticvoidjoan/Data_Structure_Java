import java.util.Scanner;

public class ExpressionCheck {
    private static Stack<Character> stack = new Stack<>(100);
    private static Scanner console = new Scanner(System.in);

    public static boolean check(char c1, char c2) {
        if (c1 == '{' && c2 == '}') {
            return true;
        } else if (c1 == '[' && c2 == ']') {
            return true;
        } else if (c1 == '(' && c2 == ')') {
            return true;
        } else
            return false;
    }

    public static boolean checkexpression(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' || c == ')' || c == ']') {
                char c2 = (char) stack.pop();
                if (!check(c2, c)) {
                    return false;
                }
            }

        }
        if (stack.isEmpty()) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter an expression: ");
        String expression = console.nextLine();
        System.out.println("The expression is " + checkexpression(expression));




    }


}
