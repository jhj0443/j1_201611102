package headfirst.iterator.dinermerger.before;

public class MenuItem{
  String name;
  String description;
  boolean vegetarian;
  double price;
  //���� �ҹ����ڳ� ������Ƽ�� ��. Double�� wrapper
  
    public MenuItem(String n, String d, boolean v, double p) {
        this.name = n;
        this.description = d;
        this.vegetarian = v;
        this.price = p;
    }
    //setter�� �̰ɷ� ��ü�Ѱǵ� getter�� ���� �о���� �Լ� �����ؾ���.
  
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