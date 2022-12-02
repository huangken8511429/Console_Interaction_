package StatePattern_practice;

public class CalculateCircusState implements State {

    private final Module module;
    public CalculateCircusState(Module module) {
        this.module = module;
    }

    @Override
    public String print() {
        return "Area=" + (int) (module.getA() * module.getA() * 3.14) + ", Circumference=" + (int)(2 * module.getA() * 3.14);
    }

    @Override
    public void input(String answer) {

    }
}
