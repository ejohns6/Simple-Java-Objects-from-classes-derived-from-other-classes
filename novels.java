
/**
 * Write a description of class novels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class novels extends books
{
//     protected String title;
//     protected String type;
//     protected int date;
//     protected int pages;
//     protected String editor;
//     protected String cover;
     protected String genera;
 
    public novels (String Title, String bookType, int Date, int Pages, String Author, String Cover, String Genera)
    {
       super (Title, bookType, Date, Pages, Author, Cover);
/**        date = Date;
        pages = Pages;
        editor = Editor;
        cover = Cover;
*/        genera = Genera;
    }
     
      public void printNovel () {
    System.out.println("__________________________________");  
    System.out.println("Tile: " + title);
    System.out.println("Author: " + author);      
	System.out.println("Type: " +type);
	System.out.println("Date: " +date);
	System.out.println(cover +": " +pages);
	System.out.println("Genera: " +genera);
	System.out.println("__________________________________"); 
	
     }
    
}
