package headfirst.strategy;

public class MallardDuck extends Duck{
  public MallardDuck(){
    //�̰� ������!
    //fb=new FlyWithWings();
    setFlyBehavior(new FlyWithWings());
    //���� �ϳ��� ���ָ�˴ϴ�~~~
    
    //quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }
  public void display(){
    System.out.println("I am a real Mallard duck");
  }
  
}