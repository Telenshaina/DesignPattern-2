package ExampleRefractored;

public class Cash implements PaymentType {
    public String calculatePayment(){
        String output = new String();
        output += "You paid in cash!\n" +
                      "No incentives!";
        return output;
    }
}