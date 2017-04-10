package headfirst.decorator.starbuzz;
//모카추가하는거랑 얼마 다르지 않다...
public class Whip extends CondimentDecorator{
  Beverage beverage;
  
  //새성자는 보통 default값으로....
  //BEverage baverage 가 블랙 다이아몬드...
  public Whip(Beverage beverage){
    this.beverage = beverage;
  }
  
  public String getDescription(){
    return beverage.getDescription()+" decorationg Whip,";
  }
  public double cost(){
    return beverage.cost()+0.1;
  
  }

}