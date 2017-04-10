package headfirst.decorator.starbuzz;
public class Caramel extends CondimentDecorator{
  Beverage beverage;
  public Caramel(Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription()+" decorationg Caramel,";
  }
  public double cost(){
  return beverage.cost()+0.3;
  
  }

}