
/**
 * Write a description of class newspaper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class newspaper extends BookClub
{
 protected int pages;
 protected String date;
 protected String editor;
 
    public newspaper(String Title, String bookType, String Date, int Pages, String Editor)
    {
        super (Title, bookType);
        date = Date;
        pages = Pages;
        editor = Editor;
    }
     public void setDate (String Date) {
	date = Date;
     }


     public String getDate () {
	return date;
     }

     public void setPages (int Pages) {
	pages = Pages;
     }


     public int getPages () {
	return pages;
     }

     public void setEditor (String Editor) {
	editor = Editor;
     }


     public String getEditor () {
	return editor;
     }
     
      public void printNews () {
    System.out.println("__________________________________");  
    System.out.println("Editor: " + editor);      
	System.out.println("Tile: " + title);
	System.out.println("Type: " +type);
	System.out.println("Date: " +date);
	System.out.println("Pages: " +pages);
	System.out.println("__________________________________");  
     }

}
