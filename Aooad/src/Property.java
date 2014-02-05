
public class Property{

	private PState onMarketState;
	private PState underOfferState;
	private PState contractedState;
	private PState completedState;
	
	private PState state;
	private boolean success;
	private Buyer buyer = null;
	public Property()
	{
		onMarketState = new OnMarketState(this);
		underOfferState = new UnderOfferState(this);
		
		state = onMarketState;
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
	public void setBuyer(Buyer b)
	{
		buyer = b;
	}
	public void setState(PState state)
	{
		this.state = state;
	}
	public void offer(Buyer buyer)
	{
		state.offer(buyer);
	}
	public void buyerPullout()
	{
		state.buyerPullOut();
	}
	// add all methods. should be quite obvious.
	
	
}
