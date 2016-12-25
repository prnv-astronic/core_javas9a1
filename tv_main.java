package Core_javaS9;
import java.util.*;
public class tv_main {

	public static void main(String[] args) {
		ArrayList<tv> my_tv =new ArrayList<tv>();
		
		my_tv.add(new tv(32,"Sony"));
		my_tv.add(new tv(29,"Micromax"));
		my_tv.add(new tv(51,"AOC"));
		my_tv.add(new tv(21,"Viewsonic"));
		my_tv.add(new tv(21,"Viewsonic"));
		
			
		Collections.sort(my_tv);
		Iterator<tv> itr=my_tv.iterator();
		
		System.out.println("Collection 1");
		while(itr.hasNext())
		{
			tv b1= (tv)itr.next();	
			//System.out.println("=====================");
			System.out.println(b1.model_name +" ");
			System.out.println(b1.screen_size +" "+"Inch");
			System.out.println("=====================");
		}
		
	
	}

}
;