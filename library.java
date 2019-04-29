
/**
 * Write a description of class libary here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class library
{
    public static void main (String [] args) {
novels Atlas = new novels ("Atlas Shrugged", "Novel", 1957, 1168,"Rand, Ayn", "Hard Cover", "Fiction");//String Title, String bookType, int Date, int Pages, String Author, String Cover, String Genera
textBooks DataMining = new textBooks ("The Elements of Statistical Learning: Data Mining, Inference, and Prediction, Second Edition (Springer Series in Statistics) ", "Text Books", 2009, 768, "Hastie, Trevor", "Hard Cover", "Bioinformatics"); //String Title, String bookType, int Date, int Pages, String Author, String Cover, String Subject
books OFTF = new books ("One Fish, Two Fish, Red Fish, Blue Fish Book ", "books", 1960, 62, "Seuss, Dr.", "Hard Cover");//String Title, String bookType, int Date, int Pages, String Author, String Cover
newspaper Sun = new newspaper ("The Baltomre Sun", "News Paper", "7/12/12", 120, "Stewert, Bob"); //String Title, String bookType, String Date, int Pages, String Editor
technicalJournals Python = new technicalJournals ("Python Scripting for ArcGIS", "Technical Journal:", 2013, 368, "Zandbergen, Paul", "Paperback" ); //String Title, String bookType, int Date, int Pages, String Author, String Cover
magazines GameInformer = new magazines ("Gameinformer", "Magazine", "March 2013", 100, "McNamara, Andy", "Gaming"); //String Title, String bookType, String Date, int Pages, String Editor, String Genera



	   Atlas.printNovel();
       DataMining.printText();
	   OFTF.printBook();
	   Sun.printNews();
	   Python.printTech();
	   GameInformer.printMag();
}
}
