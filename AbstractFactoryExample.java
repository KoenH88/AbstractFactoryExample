package nl.sig.examples;

public class FactoryExample {
	
	public class PizzaStore
	{
		public void main(IPizzaFactory pizzafatory) throws Exception{
			IPizza pizza = pizzafactory.createPizza("salami");
			pizza.bakePizza();
		}
	}
	
	public interface IPizzaFactory {
		IPaymentcard createPizza(String pizzaType) throws Exception;
	}
	
	public class ItalianFactory implements IPizzaFactory{
		public IPizza createPizza(String pizzatype) throws Exception{
			switch(pizzatype){
			case "salami":
				return new PizzaSalami(new ThinCrust());
			case "tonno":
				return new PizzaTonno(new ThinCrust());
			case "quatroformagio":
				return new PizzaQuatroFormagio(new ThinCrust());
			default:
				throw new Exception("We don't have this pizza, sorry");
			}
		}
	}
	
	public class AmericanFactory implements IPizzaFactory{
		public IPizza createPizza(String pizzatype) throws Exception{
			switch(pizzatype){
			case "salami":
				return new PizzaSalami(new ThickCrust());
			case "tonno":
				return new PizzaTonno(new ThickCrust());
			case "quatroformagio":
				return new PizzaQuatroFormagio(new ThickCrust());
			default:
				throw new Exception("We don't have this pizza, sorry");
			}
		}
	}
	
	public interface IPizza
	{
		makeDough();
		bakePizza();
	}
	
	public class PizzaSalami implements IPizza
	{
		ICrust crustType;
		List<Topping> toppings;
		
		public PizzaSalami(ICrust crustType)
		{
			this.crustType = crustType;
			base.AddToppings(new List<Topping> { Salami(), new TomatoSaus(), new Cheddar() });
		}
		
		@Override
		public makeDough() {
			crustType.GetDough();
			crustType.RollDough();
		}
		
		@Override
		public bakePizza() {
			// Put pizza in oven
		}	
	}

	public class PizzaTonno implements IPizza
	{

		@Override
		public makeDough() {
			// Make pizza dough
		}

		@Override
		public addToppings() {
			// Add tomato sauce, cheese and tuna fish 
		}
		
		@Override
		public bakePizza() {
			// Put pizza in oven
		}	
	}
	
	public class PizzaQuatroFormagio implements IPizza
	{

		@Override
		public makeDough() {
			// Make pizza dough
		}

		@Override
		public addToppings() {
			// Add tomato sauce and 4 cheeses 
		}
		
		@Override
		public bakePizza() {
			// Put pizza in oven
		}	
	}
}



