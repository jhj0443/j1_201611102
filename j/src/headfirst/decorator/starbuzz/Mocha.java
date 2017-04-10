package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
  Beverage beverage;
  
  //�����ڴ� ���� default������....
  //BEverage baverage �� �� ���̾Ƹ��...
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