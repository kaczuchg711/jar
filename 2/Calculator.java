import CCC.ICalculator;

public class Calculator implements ICalculator
{
    @Override
    public double add(double a, double b)
    {
        return a+b;
    }

    @Override
    public double subtraction(double a, double b)
    {
        return a-b;
    }

    @Override
    public double multiplication(double a, double b)
    {
        return a*b;
    }

    @Override
    public double division(double a, double b)
    {
        return a/b;
    }
}