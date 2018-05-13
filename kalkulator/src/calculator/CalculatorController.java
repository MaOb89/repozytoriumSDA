package calculator;import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.*;public class CalculatorController {    @FXML

private TextField display;    @FXML

private void handlerZeroButton(ActionEvent event){

    System.out.println("Naciśnięto 0");

    display.setText("0");

}    @FXML

private void handlerNumericButton(ActionEvent event){

    String numberPressed =

            ((Button)event.getSource()).getText();

    System.out.println("Naciśnięto "

            + numberPressed);

    display.setText(display.getText()

            + numberPressed);

}    private double number;

    @FXML

    private void handlerPlus(ActionEvent event){

        number = Double.parseDouble(display.getText());

        display.setText("");    }    @FXML

    private void handlerEqualOperation(ActionEvent event){

        double currentNumber = Double.parseDouble(display.getText());

        double result = 0;        switch (operation){

            case ADD:

                result = number + currentNumber;

                break;

            case MINUS:

                result = number - currentNumber;

                break;

            case DIV:

                result = number / currentNumber;

                break;

            case MULT:

                result = number * currentNumber;

                break;

        }        display.setText(String.valueOf(result));

    }    private Operations operation;

    @FXML

    private void handlerOperationButton(ActionEvent event){

        number = Double.parseDouble(display.getText());

        String buttonText = ((Button)event.getSource()).getText();

        operation = Operations.getOperation(buttonText);

        display.setText("");

        System.out.println("Naciśnięto przycisk:" + buttonText);

    }    private boolean wasDotPressed = false;

    @FXML

    private void handlerDotButton(ActionEvent event){

        if(!wasDotPressed){

            display.setText(display.getText() + ".");

            wasDotPressed = true;

        }

    }

}
