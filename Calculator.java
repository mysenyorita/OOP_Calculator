import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);
    protected double n1,n2;
    protected String op= "";
    protected boolean ifExit = false;
    protected double ans;

    Calculator() {
        System.out.println("Calculator Created");
        while(!ifExit){
            showInstructions();
            userInputOp();
            ifExit();
            if(this.ifExit) {
                break;
            }
            userInputNum();
            compute(this.n1,this.n2);
            printResults();
            this.op = null;
        }
        System.out.println("Exiting Calculator....");

    }
    private void printResults() {
        System.out.println(this.n1+" "+this.op+" "+this.n2+" = "+this.ans);
    }
    private void userInputOp() {
        System.out.print("Enter operator symbol: ");
        this.op = sc.nextLine();
        private void ifExit() {
        this.ifExit = this.op.equals("0");
    }
    private void userInputNum() {
        System.out.print("Enter first number: ");
        this.n1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter second number: ");
        this.n2 = sc.nextDouble();
        sc.nextLine();
    }
    private void compute(double n1, double n2) {
        switch (this.op) {
            case "+" -> this.ans = n1 + n2;
            case "-" -> this.ans = n1 - n2;
            case "x" -> this.ans = n1 * n2;
            case "/" -> this.ans = n1 / n2;
            case "%" -> this.ans = n1 % n2;
            case default -> System.out.println("Invalid Operation");
        }
    }
    private void showInstructions() {
        for (int i = 0; i <= 17 ; i++)
            System.out.print("==");
        System.out.println("\n      | BASIC CALCULATOR |      ");
        System.out.println("      ADDITION -       ( + )");
        System.out.println("      SUBTRACTION -    ( - )");
        System.out.println("      MULTIPLICATION - ( x )");
        System.out.println("      DIVISION -       ( / )");
        System.out.println("      MODULO -         ( % )");
        System.out.println("      EXIT -           ( 0 )");
        for (int i = 0; i <= 17 ; i++)
            System.out.print("==");
        System.out.println();
    }
        private void testgithub() {
        }
}
