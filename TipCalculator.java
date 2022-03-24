// Figura 25.17: TipCalculator.java
// Classe principal do aplicativo que carrega e exibe a GUI do Tip Calculator

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TipCalculator extends Application
{

	@Override
	public void start(Stage stage) throws Exception
	{
		Parent root = FXMLoader.load(getClass().getResource("TipCalculator.fxml"));
		
		Scene scene = new Scene(root); // anexa o grafo de cena a cena
		stage.setTitle("Tip Calculator"); // exibido na barra de titulo da janela
		stage.setScene(scene); // anexa a cena ao estagio
		stage.show(); // exibe o estagio
	}
	
	public static void main(String[] args)
	{
		// cria um objeto TipCalculator e chama o metodo start
		launch(args);
	}
}
