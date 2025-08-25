import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        JFrame banana = new JFrame(); //Initializes GUI

        banana.setTitle("AHHHHHHHH");
        banana.setSize(420,69); //sets the x and y dimension
        banana.setVisible(true); //makes the banana visible

        banana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits out of the application
        banana.setResizable(false); //Prevents external banana size manipulation
    }
}
