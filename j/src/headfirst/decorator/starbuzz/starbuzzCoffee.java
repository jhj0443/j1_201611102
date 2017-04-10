package headfirst.decorator.starbuzz;

public class starbuzzCoffee{
  public static void main(String[] args){
    Beverage beverage = new HouseBlend();
    beverage = new Espresso (beverage);
    beverage = new Caramel (beverage);
    beverage = new Milk (beverage);
    beverage = new Vanilla (beverage);
    beverage = new Vanilla (beverage);
    System.out.println(beverage.getDescription()+"$"+beverage.cost());
    
  }

}