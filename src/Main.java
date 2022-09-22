public class Main {
  public static void main(String[] args) {
    double shippingFee = 0.02;
    System.out.println("Enter the price of your item: " );
    double itemPrice = 9.50;

    if (itemPrice <= 100) {
      double shippingCost = shippingFee * itemPrice;
      System.out.println("The cost of shipping is " + shippingCost);
      double totalCost = shippingCost + itemPrice;
      System.out.println("The total cost is " + totalCost);
    } else {
      System.out.println("Shipping is Free!");
      System.out.println("The total cost is " + itemPrice);
    }
  }
}