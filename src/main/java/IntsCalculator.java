public class IntsCalculator implements Ints {


    private Calculator calculator;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public Double sum(int arg0, int arg1) {
        return calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public Double mult(int arg0, int arg1) {
        return calculator.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public Double pow(int a, int b) {
        return calculator.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}



