
/**
 * Write a description of class textBooks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class textBooks extends books
{
    protected String subject;
    public textBooks(String Title, String bookType, int Date, int Pages, String Author, String Cover, String Subject)
    {
       super (Title, bookType, Date, Pages, Author, Cover);
        subject = Subject;
    }
     
      public void printText () {
    System.out.println("__________________________________");        
    System.out.println("Author: " + author);      
    System.out.println("Tile: " + title);
    System.out.println("Type: " +type);
    System.out.println("Edition: " +date);
    System.out.println(cover +": " +pages);
    System.out.println("Subject: " +subject);
    System.out.println("__________________________________"); 
    
     }
}
