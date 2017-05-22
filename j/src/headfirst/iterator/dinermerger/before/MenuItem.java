package headfirst.iterator.dinermerger.before;

public class MenuItem{
  String name;
  String description;
  boolean vegetarian;
  double price;
  //더블 소문자자나 프리미티브 야. Double은 wrapper
  
    public MenuItem(String n, String d, boolean v, double p) {
        this.name = n;
        this.description = d;
        this.vegetarian = v;
        this.price = p;
    }
    //setter는 이걸로 대체한건데 getter는 각각 읽어오는 함수 구현해야함.
  
  public String getName(){
    return name;
  }
  public String getDescription(){
    return description;
  }
  public boolean isVegetarian(){
    return vegetarian;
  }
  public double getPrice(){
    return price;
  }
  
  
}