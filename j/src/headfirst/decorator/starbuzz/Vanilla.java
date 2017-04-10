package headfirst.decorator.starbuzz;

public class Vanilla extends CondimentDecorator{
  Beverage beverage;
  public Vanilla(Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription()+" decorationg Vanilla,";
  }
  public double cost(){
  return beverage.cost()+0.2;
  
  }

}