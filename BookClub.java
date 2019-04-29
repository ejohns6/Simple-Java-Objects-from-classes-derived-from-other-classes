

public class BookClub
{
protected String type;
protected String title;

    public BookClub(String Title, String bookType)
    {
        type = bookType;
        title = Title;
    }

    public void setType (String bookType) {
	type = bookType;
     }



     public void setTitle (String Title) {
	title = Title;
     }



     public String getType() {
	return type;
     }
     
      public String toString() {
	return "\nTile: " + title +"\nType: " +type +"\n";
     }

     public void inStock() {
	System.out.println(title + " is available in the Library.");
      }
}
