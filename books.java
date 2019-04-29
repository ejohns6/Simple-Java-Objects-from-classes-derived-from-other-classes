
/**
 * Write a description of class books here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class books extends BookClub
{
     protected int pages;
 protected int date;
 protected String author;
 protected String cover;
 
    public books(String Title, String bookType, int Date, int Pages, String Author, String Cover)
    {
        super (Title, bookType);
        date = Date;
        pages = Pages;
        author = Author;
        cover = Cover;
    }
     public void setDate (int Date) {
	date = Date;
     }


     public int getDate () {
	return date;
     }

     public void setPages (int Pages) {
	pages = Pages;
     }


     public int getPages () {
	return pages;
     }

     public void setAuthor (String Author) {
	author = Author;
     }


     public String getAuthor () {
	return author;
     }
     
//     public void setCover (String Cover) {
//	cover = Cover;
//     }


 //    public String getCover () {
//	return cover;
 //    }
     
      public void printBook () {
    System.out.println("__________________________________");  
    System.out.println("Tile: " + title);
    System.out.println("Author: " + author);      
	System.out.println("Type: " +type);
	System.out.println("Date: " +date);
	System.out.println(cover +": " +pages);
	System.out.println("__________________________________");  
     }
}
