package se.jensen.eazy.inteface;

public class Add implements Calculable {
    public Integer execute(Integer number, Integer number2) {
        return number + number2;
    }
}
