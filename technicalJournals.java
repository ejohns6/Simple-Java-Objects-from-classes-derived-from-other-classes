
/**
 * Write a description of class technicalJournals here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class technicalJournals extends BookClub
{
     protected int pages;
 protected int date;
 protected String author;
 protected String cover;
 
    public technicalJournals(String Title, String bookType, int Date, int Pages, String Author, String Cover)
    {
        super (Title, bookType);
        date = Date;
        pages = Pages;
        author = Author;
        cover = Cover;
    }
     
      public void printTech () {
    System.out.println("__________________________________");  
    System.out.println("Tile: " + title);
    System.out.println("Author: " + author);      
	System.out.println("Type: " +type);
	System.out.println("Date: " +date);
	System.out.println(cover +": " +pages);
	System.out.println("__________________________________");  
     }
}
