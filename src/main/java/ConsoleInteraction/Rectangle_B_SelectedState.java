package ConsoleInteraction;

public class Rectangle_B_SelectedState implements State{
    private final Module module;

    public Rectangle_B_SelectedState(Module module) {
        this.module = module;
    }

     public String print() {
        return "Area=" + module.getA() * module.getB() + ", Circumference=" + 2 * (module.getA() + module.getB());
    }
    @Override
    public void input(String answer) {
      //
    }
}