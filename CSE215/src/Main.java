import java.util.*;
import com.bank.ui.UserInterface;
import com.bank.database.CustomerData;

public class Main {
	public static void main(String[] args) {
		new UserInterface();

		CustomerData.addCustomer("Shishir", 1262, "48 Monipuripara", 1920034301, "dharshishir08@gmail.com", "abcd");
		CustomerData.addCustomer("Kishore", 712, "48 Monipuripara", 1920034301, "dharshishir08@gmail.com", "abcd");
		CustomerData.addCustomer("Anjelica", 1282, "5615 Mohakhali", 1405997965, "anjelicarebeiro@gmail.com", "phy108");;
		
		 
	}
	
	
}

