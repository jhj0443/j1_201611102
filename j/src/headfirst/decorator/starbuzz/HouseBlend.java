package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage{
  //description = "house blend coffee";
  //������...
  public HouseBlend(){
    description = "house blend coffee";
  }
  
  //public String getDescription(){
  //return description;
  //}
  
  public double cost(){
    return 0.89;
  }

}