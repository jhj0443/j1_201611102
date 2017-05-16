package headfirst.singleton.stat;

public class Singleton{
  //private static Singleton uniqueInstance;
  private static Singleton uniqueInstance = new Singleton();
  private static int numCalled=0;
  
  private Singleton(){
    
    
  }
  public static Singleton getInstance(){
    if(uniqueInstance==null){
      uniqueInstance = new Singleton();
      System.out.println("Creating unique instance of Chocolate Boiler");
    }
      System.out.println("Returning instance of Chocolate Bolier");
      System.out.println("jhj : numCalled "+numCalled++);
      return uniqueInstance;  
  }
}
