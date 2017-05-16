package nl.sig.examples;

public class FactoryExample {
	
	public class ComponentA
	{
		public void main(ICardFactory cardfactory) throws Exception{
			IPaymentcard mastercard = cardfactory.createCard("debit");
			boolean checkValidity = mastercard.CheckValidity();
		}
	}
	
	public interface ICardFactory {
		IPaymentcard createCard(String cardType) throws Exception;
	}
	
	public class GeneralFactory implements ICardFactory{
		public IPaymentcard createCard(String cardtype) throws Exception{
			switch(cardtype){
			case "debit":
				return new DebitCard();
			case "credit":
				return new CreditCard();
			default:
				throw new Exception("Card type not found");
			}
		}
	}
	
	public interface IPaymentcard
	{
		boolean CheckValidity();
		IPaymentcard requestNewCard();
	}
	
	

	public class DebitCard implements IPaymentcard
	{

		@Override
		public boolean CheckValidity() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public IPaymentcard requestNewCard() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

	public class CreditCard implements IPaymentcard
	{

		@Override
		public boolean CheckValidity() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public IPaymentcard requestNewCard() {
			// TODO Auto-generated method stub
			return null;
		}

	}
}



