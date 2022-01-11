package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private Label lbl;


    @FXML
    public void operation1(ActionEvent event) {
        if (txt1.getText().isBlank() || txt2.getText().isBlank()){
            lbl.setText("Please enter your numbers");
        }
        else {
            try {
                double Num1 = Double.parseDouble(txt1.getText());
                double Num2 = Double.parseDouble(txt2.getText());

                String operation = ((Button) event.getSource()).getText();

                if (operation.equals("+")) {
                    double a = Num1 + Num2;
                    lbl.setText("The sum is : " + a);
                } else if (operation.equals("-")) {
                    double a = Num1 - Num2;
                    lbl.setText("The substraction is : " + a);
                } else if (operation.equals("x")) {
                    double a = Num1 * Num2;
                    lbl.setText("The multiplication is : " + a);
                } else if (operation.equals("÷")) {
                    double a = Num1 / Num2;
                    lbl.setText("The division is : " + a);
                }
            }
            catch(NumberFormatException exception){
                lbl.setText("Invalid input. Please enter numbers");
            }
        }
    }


    @FXML
    void operation2(ActionEvent event) {
        if (!txt2.getText().isBlank()){
            lbl.setText("Please enter your number only in the first text box");
        }
        else if (txt1.getText().isBlank() && txt2.getText().isBlank()){
            lbl.setText("Please enter your number");
        }
        else {
            try {
            double num1 = Double.parseDouble(txt1.getText());

            String op = ((Button) event.getSource()).getText();

            if (op.equals("sin")) {
                double radians = Math.toRadians(num1);
                double x = Math.sin(radians);
                lbl.setText("sin of " + num1 + "is : " + x);
            }
            else if (op.equals("cos")) {
                double radians = Math.toRadians(num1);
                double x = Math.cos(radians);
                lbl.setText("cos of " + num1 + "is : " + x);
            }
            else if (op.equals("tan")) {
                double radians = Math.toRadians(num1);
                double x = Math.tan(radians);
                lbl.setText("tan of " + num1 + "is : " + x);
            }
            else if (op.equals("Exp")) {
                double x = Math.exp(num1);
                lbl.setText("Exponential of " + num1 + "is : " + x);
            }
            }
            catch(NumberFormatException exception){
                lbl.setText("Invalid input. Please enter a number");
            }
        }
    }


    @FXML
    void Clear(ActionEvent event) {
        txt1.clear();
        txt2.clear();
        lbl.setText("0");

    }
}