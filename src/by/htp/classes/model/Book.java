package by.htp.classes.model;

public class Book {

	private String title;
	private int year;
	private Author[] authors;
	int authorCount;

	public Book() {

	}

	public Book(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public void setAutors(Author[] authors) {
		if (authors != null) {
			this.authors = authors;
		}
	}

	public Author[] getAuthor() {
		return authors;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return this.year;
	}

	public void addAuthors(Author author) {
		if (this.authors != null) {
			if(authorCount < authors.length) {
				authors[authorCount]=author;
				authorCount++;
			}else{
				Author [] authors = new Author[this.authors.length + 10];
				for(int i = 0; i < authors.length; i++){
					authors[i] = this.authors[i];
				}
				this.authors = authors;
				this.authors[authorCount] = author;
				authorCount++;
			}

		} else {
			this.authors = new Author[10];
			this.authors[0] = author;
			authorCount++;
		}
	}
}