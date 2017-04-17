package headfirst.factory.pizzas;

public class PizzaMain{
  public static void main(String[] args){
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    
   // Pizza pizza = store.orderPizza("cheese");
   // System.out.println("We ordered a "+pizza.getName()+"\n");
   // Pizza pizza = store.orderPizza("veggie");
   // System.out.println("We ordered a "+pizza.getName()+"\n");
    Pizza pizza = store.orderPizza("potato");
    System.out.println("We ordered a "+pizza.getName()+"\n");    
    
    
  }


}