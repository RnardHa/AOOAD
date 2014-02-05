public class Property
{
	private PState onMarketState;
	private PState underOfferState;
	private PState contractedState;
	private PState completedState;

	private PState state;
	private boolean success;
	private Buyer buyer;

	public Property()
	{
		onMarketState = new OnMarketState(this);
		underOfferState = new UnderOfferState(this);
		contractedState = new ContractedState(this);
		completedState = new CompletedState(this);

		state = onMarketState;
		success = false;
		buyer = null;
	}

	public void offer(Buyer buyer)
	{
		state.offer(buyer);
	}

	public void buyerPullout()
	{
		state.buyerPullout();
	}

	public void vendorPullout()
	{
		state.vendorPullout();
	}

	public void signContract(Buyer buyer)
	{
		state.signContract(buyer);
	}

	public void payPrice()
	{
		state.payPrice();
	}

	public void setState(PState state)
	{
		this.state = state;
	}

	public PState getState()
	{
		return state;
	}

	public void setSuccess(boolean success)
	{
		this.success = success;
	}

	public boolean getSuccess()
	{
		return success;
	}

	public void setBuyer(Buyer buyer)
	{
		this.buyer = buyer;
	}

	public Buyer getBuyer()
	{
		return buyer;
	}

	public PState getOnMarketState()
	{
		return onMarketState;
	}

	public PState getUnderOfferState()
	{
		return underOfferState;
	}

	public PState getContractedState()
	{
		return contractedState;
	}

	public PState getCompletedState()
	{
		return completedState;
	}
}