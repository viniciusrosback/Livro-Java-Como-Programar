// TipCalculatorController.java
// Controlador que trata os eventos calculateButton e tipPercentageSlider

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class TipCalculatorController 
{

	// formatadores para moeda e porcentagens
	private static final NumberFormat currency = NumberFormat.getCurrencyInstance();
	private static final NumberFormat percent = NumberFormat.getPercentInstance();
	
	private BigDecimal tipPercentage = new BigDecimal(0.15); // 15% padrao
	
	// Controles da Gui definidos na FXML e usados pelo Codigo do controlador
	@FXML
	private java.awt.TextField amountTextField;
	
	@FXML
	private java.awt.Label tipPercentageLabel;
	
	@FXML
	private Slider tipPercentageSlider;
	
	@FXML
	private TextField tipTextField;
	
	@FXML
	private java.awt.TextField totalTextField;
	
	// calcula e exibe o valor de gorjeta e o valor total
	@FXML
	private void calculateButtonPressed(ActionEvent event)
	{
		try
		{
			BigDecimal amount = new BigDecimal(amountTextField.getText());
			BigDecimal tip = amount.multiply(tipPercentage);
			BigDecimal total = amount.add(tip);
			
			tipTextField.setText(currency.format(tip));
			totalTextField.setText(currency.format(total));
		}
		catch(NumberFormatException ex)
		{
			amountTextField.setText("Enter amount");
			amountTextField.selectAll();
			amountTextField.requestFocus();
		}
		
	}
	
	// chamado pelo FXMLLoader para inicializar o controlador
	public void initialze()
	{
		// 0 a 4 arredonda para baixo, 5 a 9 arredonda para cima
		currency.setRoundingMode(RoudingMode.HALF_UP);
		
		// ouvinte para alteracoes no valor do tipPercentageSlider
		tipPercentageSlider.valueProperty().addListener(
				new ChangeListener<Number>()
				{
					@Override
					public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue)
					{
						tipPercentage = BigDecimal.valueOf(newValue.intValue() / 100.0);
						tipPercentageLabel.setText(percent.format(tipPercentage));
					}
				}
			);
	}
}
