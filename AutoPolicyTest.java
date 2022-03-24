// Figura 5.12: AutoPolicy.java
// Demonstrando Strings em um switch

public class AutoPolicyTest 
{

	public static void main(String[] args) 
	{
	
		// cria dois objetos AutoPolicy
		AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
		AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");
		
		// exibe se cada apolice esta em um estado "sem culpa"
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}
	
	// metodo que mostra se um AutoPolicy
	// esta em um estado com seguro de automovel "sem culpa"
	public static void policyInNoFaultState(AutoPolicy policy)
	{
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is": "is not"));
	}
} // fim da classe AutoPolicyTest
