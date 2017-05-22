package headfirst.iterator.dinermerger.before;

public class DinerMenu{
  MenuItem[] menuItems;
  static final int MAX_ITEMS=0;
 int numberOfItems =0;
 
 public DinerMenu(){
   menuItems = new MenuItem[MAX_ITEMS];
   addItem("BLT","Bacon,Lettuce,Tomato",true,2.99);
   addItem("Vegetarian BLT","(Fakin')Bacon,Lettuce,Tomato",true,2.99);
   addItem("Soup of the day","Soup of the day, with a side of potato salad",true,3.29);
 }
 public void addItem(String n, String d, boolean v, double p){
   MenuItem menuItem = new MenuItem(n,d,v,p);
   menuItems[numberOfItems]=menuItem;
   numberOfItems++;
 }
 public MenuItem[] getMenuItems(){
   return menuItems;
 }
 
}
