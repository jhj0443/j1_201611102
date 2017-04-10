package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  
  //새성자는 보통 default값으로....
  //BEverage baverage 가 블랙 다이아몬드...
  public Mocha(Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription()+" decorationg Mocha,";
  }
  public double cost(){
  return beverage.cost()+0.2;
  
  }

}