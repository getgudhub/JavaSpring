package entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	private int id;
	
	@NotNull
	@Size(min=4, max=20, message="Vardas turetu tilpti tarp 4 ir 20 raidziu!")
	@Pattern(regexp="[A-Za-z]+", message="Klaidingai ivestas vardas!")
	private String name;
	
	@NotNull
	@Pattern(regexp=".+@.+\\..+", message="Klaidingai ivestas el. pastas!")
	private String email;
	
	@NotNull
	@Min(value = 18, message = "Amzius turi buti ne mazesnis kaip 18m.")
	private int age;

	public User() {
		
	}
	
	public User(int id, String name, String email, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		this.email=email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
