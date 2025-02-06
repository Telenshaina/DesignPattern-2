package ExampleRefractored;

public class Maya implements PaymentType{
    public String calculatePayment(){
        String output = new String();
        output += "Maya is your payment type!\n" +
                  "You have 1% additional interest in Savings!";
        return output;
    }
}