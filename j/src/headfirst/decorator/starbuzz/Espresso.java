package headfirst.decorator.starbuzz;
public class Espresso extends CondimentDecorator{
  Beverage beverage;
  
  public Espresso(Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription()+" decorationg Espresso,";
  }
  public double cost(){
    return beverage.cost()+0.2;
  
  }

}