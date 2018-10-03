
public class Die
{
	private int lastRoll;
	private boolean ispredictable;
	private int nextValue;
	private int[] arrayValues;

	public Die()
	{
		this.roll();
	}
	
	public Die(int[] array){
		this.ispredictable = true;
		this.nextValue = 0;
		this.arrayValues = array;
		this.roll();
	}


	public int getLastRoll() // getter or accessor method
	{

		return this.lastRoll;
	}

	public void roll() // note how this changes Die's state, but doesn't return anything
	{
		if (ispredictable) {
			this.lastRoll = arrayValues[nextValue%arrayValues.length];
			nextValue++;
		}
		else {
			this.lastRoll = (int) (Math.random() * 6 + 1);			
		}

	}
	
	@Override
	public String toString() // this OVERRIDES the default Object.toString()
	{
		return "Die: " + this.getLastRoll();
	}

}
