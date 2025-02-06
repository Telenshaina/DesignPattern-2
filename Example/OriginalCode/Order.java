package OriginalCode;
public class Order{
    private Double orderAmount;
    private String paymentType;
    
    public Order (Double orderAmount, String paymentType){
        this.orderAmount = orderAmount;
        this.paymentType = paymentType;
    }

    public String calculatePayment(){
        String output = new String();

        if(paymentType.equals("GCash")){
            output += "Gcash is your payment type!\n" +
                      "You earned 10 energy points!";
                     
        } else if (paymentType.equals("Maya")){
            output += "Maya is your payment type!\n" +
                      "You have 1% additional interest in Savings!";
        } else{
            output += "You paid in cash!\n" +
                      "No incentives!";
        }

        return "Your payment amount is " + orderAmount + "\n" + output;

    }
}
