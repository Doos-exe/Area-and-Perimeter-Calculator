import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TestMain {
    public static void main(String[] args) throws Exception {
        String name = " ";
        boolean Again = true;

        while(Again){
            Object[] options = {"Circle", "Rectangle", "Triangle"};
            int option = JOptionPane.showOptionDialog(null, "Choose what shape you want", "SHAPE CALCULATOR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options, options[0]);
            switch (option){
                case 0: // if user picked Circle
                    Circle circ = new Circle();

                    name = "Circle";
                    circ.setname(name);
                    float Radius = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the radius: "));               
                    circ.setRadius(Radius);

                    JOptionPane.showMessageDialog(null, "The Perimeter of the " + circ.getname() + " is: " + circ.CalculatePerimeter() + "\n" + "The Area of the " + circ.getname() + " is: " + circ.CalculateArea(), name, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 1: // if user picked Rectangle
                    Rectangle rect = new Rectangle();
                
                    name = "Rectangle";
                    rect.setname(name);
                    JTextField length = new JTextField();
                    JTextField width = new JTextField();
        
                    Object [] field1 = {
                        "Enter Length: ", length,
                        "Enter Width: ", width
                    };
        
                    int input1 = JOptionPane.showOptionDialog(null, field1, "input", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Enter"}, "Enter");

                    if (input1 == 0){
                        float L = Float.parseFloat(length.getText());
                        float W = Float.parseFloat(width.getText());
                        rect.setLength(L);
                        rect.setWidth(W);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please Try Again", "Error!", JOptionPane.ERROR_MESSAGE);
                    }

                    JOptionPane.showMessageDialog(null, "The Perimeter of the " + rect.getname() + " is: " + rect.CalculatePerimeter() + "\n" + "The Area of the " + rect.getname() + " is: " + rect.CalculateArea(), name, JOptionPane.INFORMATION_MESSAGE);
                
                    break;
                case 2: // if user picked Triangle
                    Triangle tria = new Triangle();

                    name = "Triangle";
                    tria.setname(name);
                    JTextField side1 = new JTextField();
                    JTextField side2 = new JTextField();
                    JTextField side3 = new JTextField();
        
                    Object [] field2 = {
                        "Enter Side 1 (Base): ", side1,
                        "Enter Side 2 (Height): ", side2,
                        "Enter Side 3: ", side3
                    };
        
                    int input2 = JOptionPane.showOptionDialog(null, field2, "input", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Enter"}, "Enter");

                    if (input2 == 0){
                        float s1 = Float.parseFloat(side1.getText());
                        float s2 = Float.parseFloat(side2.getText());
                        float s3 = Float.parseFloat(side3.getText());
                        tria.setSide1(s1);
                        tria.setSide2(s2);
                        tria.setSide3(s3);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please Try Again", "Error!", JOptionPane.ERROR_MESSAGE);
                    }

                    JOptionPane.showMessageDialog(null, "The Perimeter of the " + tria.getname() + " is: " + tria.CalculatePerimeter() + "\n" + "The Area of the " + tria.getname() + " is: " + tria.CalculateArea(), name, JOptionPane.INFORMATION_MESSAGE);
                
                    break;
                default:
                JOptionPane.showMessageDialog(null, "You just pressed x!", "Why?", JOptionPane.ERROR_MESSAGE);
            }

            int retry = JOptionPane.showConfirmDialog(null, "Do you want to try again?", "SHAPE CALCULATOR", JOptionPane.OK_CANCEL_OPTION);
            if (retry == JOptionPane.OK_OPTION){
                continue;
            }
            else{
                Again = false;
                JOptionPane.showMessageDialog(null, "Thank you for using my program", "THANK YOU!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        
    }
}
