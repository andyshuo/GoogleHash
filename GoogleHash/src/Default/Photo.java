package Default;

public class Photo
{
	String[] tags;
	public Photo(String[] tags)
	{
		this.tags = tags;
	}
	
	public String[] getTags()
	{
		return tags;
	}
	
	public int numTags()
	{
		return tags.length;
	}
}
