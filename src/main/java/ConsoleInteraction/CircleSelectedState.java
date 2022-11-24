package ConsoleInteraction;

public class CircleSelectedState implements State {
    private final Module module;

    public CircleSelectedState(Module module) {
        this.module = module;
    }
    @Override
    public String print() {
        return "Circle radius?";
    }

    @Override
    public void input(String answer) {
        module.setA(Integer.parseInt(answer));
        module.setState(new CalculateCircusState(this.module));
    }
}
