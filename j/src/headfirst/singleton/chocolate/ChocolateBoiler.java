package headfirst.singleton.chocolate;

public class ChocolateBoiler{
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0; //����ƽ�Լ������ϱ� static�������.
  
  private ChocolateBoiler(){
    empty = true;
    boiled = false;
  }
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance==null){
      uniqueInstance = new ChocolateBoiler();
      //�ڱⲨ�ϱ� new�����־�� ~ �����͹��� �Ǽ�����....
      System.out.println("Creating unique instance of Chocolate Boiler");
    }
      System.out.println("Returning instance of Chocolate Bolier");
      System.out.println("jhj : numCalled "+numCalled++);
      return uniqueInstance;  
  }
  public void fill(){
    if(isEmpty()){
      empty =false;
      boiled = false;
    }
  }
  public void drain(){
    if(!isEmpty() && isBoiled()){
      empty = true;
    }
  }
  public void boil(){
    if(!isEmpty() && !isBoiled()){
      boiled=true;
    }
  }
  public boolean isEmpty(){
    return empty;
  }
  public boolean isBoiled(){
    return boiled;
  }
}
