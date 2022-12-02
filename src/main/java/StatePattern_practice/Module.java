package ConsoleInteraction;

import org.springframework.boot.autoconfigure.condition.AllNestedConditions;

import java.util.Scanner;

public class Module {
    private State state = new InitialState(this);
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String print() {
        return this.state.print();
    }

    public void input(String answer) {
        this.state.input(answer);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void calculateShape(Module module) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(module.print());

        String shape = scanner.next();

        module.input(shape);

        System.out.println(module.print());

        String Alength = scanner.next();

        module.input(Alength);

        System.out.println(module.print());
        String Blength = scanner.next();
        module.input(Blength);

        System.out.println(module.print());
    }


    public static void main(String[] args) {
        Module module = new Module();
        module.calculateShape(module);
    }
}