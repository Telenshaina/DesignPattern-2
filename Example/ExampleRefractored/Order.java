package ExampleRefractored;

public class Order{
    private Double orderAmount;
    private PaymentType paymentType;

    public Order(Double orderAmount, PaymentType paymentType){
        this.orderAmount = orderAmount;
        this.paymentType = paymentType;
    }

    public String calculatePayment(){
        return "Your payment amount is " + orderAmount + "\n" + 
               paymentType.calculatePayment();
    }    
}
