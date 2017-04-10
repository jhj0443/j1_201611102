package headfirst.decorator.starbuzz;
//��ī�߰��ϴ°Ŷ� �� �ٸ��� �ʴ�...
public class Whip extends CondimentDecorator{
  Beverage beverage;
  
  //�����ڴ� ���� default������....
  //BEverage baverage �� �� ���̾Ƹ��...
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