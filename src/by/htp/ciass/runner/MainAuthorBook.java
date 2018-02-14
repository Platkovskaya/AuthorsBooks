package by.htp.ciass.runner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import by.htp.classes.model.Author;
import by.htp.classes.model.Book;

public class MainAuthorBook {

	public static void main(String[] args) throws ParseException {

		// Date date1 = null;

		SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyy");
		Date date1 = df.parse("13-01-2001");
		Date date2 = df.parse("06-06-1903");
		Date date3 = df.parse("13-01-2001");
		Date date4 = df.parse("06-06-1903");
		Date date5 = df.parse("13-01-2001");

		// try{
		// date1 = df.parse("22-01-2001");
		// }catch (ParseException e){
		// e.printStackTrace();
		// }

		Author auth1 = new Author("NameAuthor1", "SurnameAutor1", date1);
		Author auth2 = new Author("NameAuthor2", "SurnameAutor2", date2);
		Author auth3 = new Author("NameAuthor3", "SurnameAutor3", date3);
		Author auth4 = new Author("NameAuthor4", "SurnameAutor4", date4);
		Author auth5 = new Author("NameAuthor5", "SurnameAutor5", date5);

		Book book1 = new Book("Book1", 2006);
		Book book2 = new Book("Book2", 1950);
		Book book3 = new Book("Book3", 2017);
		
		//book1.autor = new Author[]{auth1, auth2};
		
		//Author[] authors = new Author[]{auth1, auth2};
		//book1.addAuthor(authors);
		
		book2.addAuthors(auth5);
		book2.addAuthors(auth4);
		
		for (int i = 0; i < book2.getAuthor().length; i++){
			if (book2.getAuthor()[i] != null) {
				System.out.println(book2.getAuthor()[i].name + "/" + book1.getTitle() + "/" + book1.getYear());
			}
		}

	}

}
