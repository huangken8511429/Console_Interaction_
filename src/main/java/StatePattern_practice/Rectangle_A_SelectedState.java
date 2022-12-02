package ConsoleInteraction;

public class Rectangle_A_SelectedState implements State {
    private final Module module;

    public Rectangle_A_SelectedState(Module module) {
        this.module = module;
    }

    public String print() {
        return "Rectangle side B length?";
    }

    public void input(String answer) {

        try {
            module.setB(Integer.parseInt(answer));
            module.setState(new Rectangle_B_SelectedState(this.module));
        } catch (NumberFormatException e) {
           //do nothing
        }
    }
}