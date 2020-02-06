package Default;

public class Main
{
	public static void main(String[] args)
	{
		
	}
	
	Slide[] createSlideShow(int numberOfSlide, Photo[] photos)
	{
		Slide[] temp = new Slide[numberOfSlide];
		
		
		
		
		
		
		return temp;
	}
	
	
	
	Boolean maximumScore(Photo a, Photo b)
	{
		return (commonTags(a,b)==a.numTags()||commonTags(a,b)==b.numTags());
	}
	
	int commonTags(Photo a, Photo b)
	{
		String[] tA= a.getTags();
		String[] tB = a.getTags();
		
		int c = 0;
		for(int i=0;i<tA.length;i++)
		{
			for(int j=0;j<tB.length;j++)
			{
				if (tA[i].equals(tB[j]))
					c++;
			}
		}
		return c;
	}
}


