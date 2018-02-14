package by.htp.classes.model;

import java.util.Date;

public class Author {
	public String name;
	public String surname;
	public Date birthDay;

	public Author() {

	}

	public Author(String name, String surname, Date birthDay) {
		this.name = name;
		this.surname = surname;
		this.birthDay = birthDay;
	}
}
