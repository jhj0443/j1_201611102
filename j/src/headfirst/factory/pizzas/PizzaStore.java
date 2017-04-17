package headfirst.factory.pizzas;

public class PizzaStore{
  SimplePizzaFactory factory=null;
  public PizzaStore(SimplePizzaFactory factory){
    this.factory = factory;
  }
  public Pizza orderPizza(String type){
    Pizza pizza;
    pizza = factory.createPizza(type); //팩토리의 특징을 보여주고 있는 라인입니다..
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

}