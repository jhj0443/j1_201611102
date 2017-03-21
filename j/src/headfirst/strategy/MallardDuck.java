package headfirst.strategy;

public class MallardDuck extends Duck{
  public MallardDuck(){
    //이건 생성자!
    //fb=new FlyWithWings();
    setFlyBehavior(new FlyWithWings());
    //둘중 하나만 해주면됩니다~~~
    
    //quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }
  public void display(){
    System.out.println("I am a real Mallard duck");
  }
  
}