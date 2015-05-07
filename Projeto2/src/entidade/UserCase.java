package entidade;

import java.util.*;

public class UserCase {
	private String Descricao;
	private List<UserCase> UC;
	public UserCase()
	{
		UC = new ArrayList<UserCase>();
	}
	public UserCase (String Descricao)
	{
		this.Descricao=Descricao;
		UC = new ArrayList<UserCase>();
	}
	
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public List<UserCase> getUserCase() {
		return UC;
	}
	public void addUserCase(UserCase c)
	{
		UC.add(c);
	}
	public UserCase getUserCaseAt(int i)
	{
		return UC.get(i);
	}
}
