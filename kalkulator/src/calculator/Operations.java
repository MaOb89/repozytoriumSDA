package calculator;

public enum Operations {
    ADD("+"),

    MINUS("-"),

    DIV("/"),

    MULT("*");

    private String OperationChar;

    Operations(String operationChar) {
        this.OperationChar = operationChar;
    }
    private String getOperationChar(){
        return this.OperationChar;
    }
    public static Operations getOperation(String operationChar){
        for (Operations operation :Operations.values()) {
            if(operation.getOperationChar().equals(operationChar))
                return operation;
        }
        return Operations.ADD;

    }

}

