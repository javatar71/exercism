class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        String result = String.format("%s %s %s = ", operand1, operation, operand2);
        Integer res = null;
        if(operation == null)                 throw new IllegalArgumentException("Operation cannot be null");
        if(operation == "")
        throw new IllegalArgumentException("Operation cannot be empty");

        switch(operation){
            case "+":
                res = operand1+operand2;
                break;
            case "*":
                res = operand1*operand2;
                break;
            case "/":
                try{
                    res = operand1/operand2;
                }catch(ArithmeticException e){
                    throw new IllegalOperationException("Division by zero is not allowed",e);
                }
                    break;
            default:
                throw new IllegalOperationException("Operation '" +operation + "' does not exist");
        }
        return result + res;
    }
}
