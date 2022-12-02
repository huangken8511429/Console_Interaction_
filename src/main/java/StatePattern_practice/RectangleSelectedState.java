package StatePattern_practice;

public class RectangleSelectedState implements State{
    private final Module module;

    public RectangleSelectedState(Module module) {
        this.module = module;
    }
    public String print() {
        return "Rectangle side A length?";
    }

    public void input (String answer) {
        try {
            module.setA(Integer.parseInt(answer));
            module.setState(new Rectangle_A_SelectedState(this.module));
        } catch (NumberFormatException e) {
            //do nothing
        }
    }
}