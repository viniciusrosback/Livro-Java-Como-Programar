// Figura 24.31: Person.java
// PreparedStatements utilizadas pelo aplicativo de catalogo de enderecos

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class PersonQueries 
{

	private static final String URL = "jdbc:derby:AddressBook";
	private static final String USERNAME = "deitel";
	private static final String PASSWORD = "deitel";
	
	private Connection connection; // gerencia a conexao
	private PreparedStatement selectAllPeople;
	private PreparedStatement selectPeopleByLastName;
	private PreparedStatement insertNewPerson;
	
	// construtor
	public PersonQueries()
	{
		try
		{
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			// cria a consulta que seleciona todas as entradas em AddressBook
			selectAllPeople = connection.prepareStatement("SELECT * FROM Addresses");
			
			// criar consulta que seleciona as entradas com um ultimo nome especifico
			selectPeopleByLastName = connection.prepareStatement("SELECT * FROM Addresses WHERE LastName = ?");
			
			// cria a insercao que adiciona uma nova entrada no banco de dados
			insertNewPerson = connection.prepareStatement("INSERT INTO Addresses " + "(FirstName, LastName, Email, PhoneNumber) " + "VALUES (?, ?, ?, ?)");
		}
		
		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
			System.exit(1);
		}
		
	}
	
	// seleciona todos os enderecos no banco de dados
	public List<Person> getAllPeople()
	{
		List<Person> results = null;
		ResultSet resultSet = null;
		
		try
		{
			// executeQuery retorna o ResultSet contendo as entradas correspondentes
			resultSet = selectAllPeople.executeQuery();
			results = new ArrayList<Person>();
			
			while(resultSet.next())
			{
				results.add(new Person(
						resultSet.getInt("addressID"),
						resultSet.getString("FirstName"),
						resultSet.getString("LastName"),
						resultSet.getString("Email"),
						resultSet.getString("PhoneNumber")));
			}
		}
		
		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
		
		finally
		{
			try
			{
				resultSet.close();
			}
			
			catch(SQLException sqlException)
			{
				sqlException.printStackTrace();
				close();
			}
		}
		
		return results;
	}
	
	// seleciona a pessoa pelo sobrenome
	public List<Person> getPeopleByLastName(String name)
	{
		List<Person> results = null;
		ResultSet resultSet = null;
		
		try
		{
			selectPeopleByLastName.setString(1, name); // especifica o sobrenome
			
			// executeQuery retorna o ResultSet contendo as entradas correspondentes
			resultSet = selectPeopleByLastName.executeQuery();
			
			results = new ArrayList<Person>();
			
			while(resultSet.next())
			{
				results.add(new Person(resultSet.getInt("addressID"),
						resultSet.getString("FirstName"),
						resultSet.getString("LastName"),
						resultSet.getString("Email"),
						resultSet.getString("PhoneNumber")));
			}
		}
		
		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
		
		finally
		{
			try
			{
				resultSet.close();
			}
			
			catch(SQLException sqlException)
			{
				sqlException.printStackTrace();
				close();
			}
		}
		
		return results;
	}
	
	// adiciona uma entrada
	public int addPerson(
			String fname, String lname, String email, String num)
	{
		int result = 0;
		
		// configura parametros, entao executa insertNewPerson
		try
		{
			insertNewPerson.setString(1, fname);
			insertNewPerson.setString(2, lname);
			insertNewPerson.setString(3, email);
			insertNewPerson.setString(4, num);
			
			// insere a nova entrada; retorna numero de linhas atualizadas
			result = insertNewPerson.executeUpdate();
		}
		
		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
			close();
		}
		
		return result;
	}
	
	// fecha a conexao do banco de dados
	public void close()
	{
		try
		{
			connection.close();
		}
		
		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
} // fim da classe PersonQueries
