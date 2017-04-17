package headfirst.factory.pizzas;

public class PizzaStore{
  SimplePizzaFactory factory=null;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory = factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza = factory.createPizza(type); //���丮�� Ư¡�� �����ְ� �ִ� �����Դϴ�..
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

}