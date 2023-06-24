package oop.lesson6.srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно
     * соответствовать
     * принципу SRP.
     * 
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        Input input = new Input();
        SaveAs saveAs = new SaveAs();
        input.inputFromConsole(order);
        saveAs.saveToJson(order);
        saveAs.saveToTxt(order);
        saveAs.saveToXML(order);

    }

}
