package Core_javaS9;

public class tv implements Comparable<tv> {
	
	int screen_size;
	String model_name;
	
	tv(int screen,String make)
	{
		
		this.screen_size=screen;
		this.model_name=make;
	}

	@Override
	public int compareTo(tv o) 
	{
		// TODO Auto-generated method stub
		if(screen_size==o.screen_size)
			return 0;
		
		else if(screen_size>o.screen_size)
		
			return 1;

		else
		
			return -1;
		
	}

}
