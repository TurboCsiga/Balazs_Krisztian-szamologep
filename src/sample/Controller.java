package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

import java.awt.*;

public class Controller {

    @FXML
    public Label lblNum;
    @FXML
    public Spinner<Double> txtFirst;
    @FXML
    public Spinner<Double> txtSecond;

    @FXML
    public void plusClick() {
        if (txtFirst.getValue() == 0 || txtSecond.getValue() == 0) {
            lblNum.setText("Nem lehet nulla");
        }
        else {
            double num1 = txtFirst.getValue();
            double num2 = txtSecond.getValue();
            lblNum.setText(String.valueOf(num1 + num2));
        }
    }

    @FXML
    public void minusClick() {
        if (txtFirst.getValue() == 0 || txtSecond.getValue() == 0) {
            lblNum.setText("Nem lehet nulla");
        }
        else {
            double num1 = txtFirst.getValue();
            double num2 = txtSecond.getValue();
            lblNum.setText(String.valueOf(num1 - num2));
        }
    }


    @FXML
    public void multiClick(ActionEvent actionEvent) {
        if (txtFirst.getValue() == 0 || txtSecond.getValue() == 0) {
            lblNum.setText("Nem lehet nulla");
        }
        else {
            double num1 = txtFirst.getValue();
            double num2 = txtSecond.getValue();
            lblNum.setText(String.valueOf(num1 * num2));
        }
    }

    @FXML
    public void divClick(ActionEvent actionEvent) {
        if (txtFirst.getValue() == 0 || txtSecond.getValue() == 0) {
            lblNum.setText("Nem lehet nulla");
        }
        else {
            double num1 = txtFirst.getValue();
            double num2 = txtSecond.getValue();
            lblNum.setText(String.valueOf(num1 / num2));
        }
    }

    @FXML
    public void percClick(ActionEvent actionEvent) {
        if (txtFirst.getValue() == 0 || txtSecond.getValue() == 0) {
            lblNum.setText("Nem lehet nulla");
        }
        else {
            double num1 = txtFirst.getValue();
            double num2 = txtSecond.getValue();
            lblNum.setText(String.valueOf(num1 % num2));
        }
    }
}
