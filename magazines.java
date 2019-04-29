
/**
 * Write a description of class magazines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class magazines extends BookClub
{


 protected int pages;
 protected String date;
 protected String editor;
 protected String genera;
 
    public magazines (String Title, String bookType, String Date, int Pages, String Editor, String Genera)
    {
        super (Title, bookType);
        date = Date;
        pages = Pages;
        editor = Editor;
        genera = Genera;
    }

      public void printMag () {
    System.out.println("__________________________________");  
    System.out.println("Editor: " + editor);      
	System.out.println("Tile: " + title);
	System.out.println("Type: " +type);
	System.out.println("Date: " +date);
	System.out.println("Genera: " +genera);
	System.out.println("Pages: " +pages);
	System.out.println("__________________________________");  
     }
}
