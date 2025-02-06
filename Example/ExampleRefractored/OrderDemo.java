package ExampleRefractored;

public class OrderDemo{
    public static void main(String[] args){
        
        Order order = new Order (1200.00, new Cash());
        System.out.println(order.calculatePayment());

        
    }
}
