package objetos;

import java.util.*;

public class Actor {

	private String name;
	private List<UserCase> UC;

	public Actor() {
		UC = new ArrayList<UserCase>();
	}

	public Actor(String name) {
		this.name = name;
		UC = new ArrayList<UserCase>();
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public List<UserCase> getUserCase() {
		return UC;
	}

	public void addUserCase(UserCase c) {
		UC.add(c);
	}
	public UserCase getUserCaseAt(int i)
	{
		return UC.get(i);
	}

}
