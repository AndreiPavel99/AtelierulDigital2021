package lab5.ch1;

public class Main {
    public static void main(String[] args) throws Exception{
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        RON fromRon = new RON(10);
        USD toUsd = exchangeDesk.convert(fromRon, USD.class,  5);
        System.out.println(toUsd);
    }
}
