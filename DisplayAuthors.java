// Figura 24.23: DisplayAuthors.java
// Exibindo o conteudo da tabela Authors

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayAuthors 
{

	public static void main(String[] args) 
	{
	
		final String DATABASE_URL = "jdbc:derby:books";
		final String SELECT_QUERY = "SELECT authorID, firsName, lastName FROM authors";
		
		// usa try com recursos para conectar-se e consultar o vanco de dados
		try(
				Connection connection = DriverManager.getConnection(
						DATABASE_URL, "deitel", "deitel");
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(SELECT_QUERY))
		{
			// obtem os metadados de ResultSet
			ResultSetMetaData metaData = resultSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();
			
			System.out.printf("Authors Table of Books Database:%n%n");
			
			// exibe os nomes de coluna no ResultSet
			for(int i = 1; i <= numberOfColumns; i ++)
				System.out.printf("%-8s\t", metaData.getColumnName(i));
			System.out.println();
			
			// exibe os resultados da consulta
			while(resultSet.next())
			{
				for(int i = 1; i <= numberOfColumns; i ++)
					System.out.printf("%-8s\t", resultSet.getObject(i));
				System.out.println();
			}
			 
			
		} // Os metodos close dos objetos AutoCloseable sao chamados agora
		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
} // fim da classe DisplayAuthors
