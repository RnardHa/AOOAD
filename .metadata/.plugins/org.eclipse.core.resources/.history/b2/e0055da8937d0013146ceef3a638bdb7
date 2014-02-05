public class UnderOfferState implements PState
{
	private Property property;

	public UnderOfferState(Property property)
	{
		this.property = property;
	}

	public void offer(Buyer buyer)
	{
		System.out.println("Buyer has already made an offer");
	}

	public void buyerPullout()
	{
		System.out.println("Buyer has pulled out");
		property.setBuyer(null);
		property.setState(property.getOnMarketState());
	}

	public void vendorPullout()
	{
		System.out.println("Vendor has pulled out");
		property.setSuccess(false);
		property.setState(property.getCompletedState());
	}

	public void signContract(Buyer buyer)
	{
		System.out.println("Contract signed");
		property.setState(property.getContractedState());
	}

	public void payPrice()
	{
		System.out.println("Contract has not been signed yet");
	}
}