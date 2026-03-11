class NotEligibleForEngineering extends RuntimeException 
{
	public NotEligibleForEngineering(String s)
	{
		super(s);
	}
}
class NotEligibleForVJIT extends RuntimeException 
{
	public NotEligibleForVJIT(String s)
	{
		super(s);
	}
}
class TSEngineeringAdmission
{
	public static void main(String args[])
	{
		try
		{
			int TSEAMCETscore=Integer.parseInt(args[0]);
			if(TSEAMCETscore<50)
			{
				throw new  NotEligibleForEngineering("Sorry not eligible for engineering");
			}
			else if(TSEAMCETscore<70)
			{
				throw new  NotEligibleForVJIT("Sorry not eligible for VJIT");
			}
			else
			{
				System.out.println("Welcome to vjit-Thanks for Registration");
			}
		}
		catch (NotEligibleForEngineering | NotEligibleForVJIT e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		System.out.println("Rest of the code");
	}
		
}