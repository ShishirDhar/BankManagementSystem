import java.util.*;
import com.bank.ui.UserInterface;
import com.bank.database.CustomerData;

public class Main {
	
	public static void main(String[] args) {
		new UserInterface();
		//CustomerData custom = new CustomerData();
		CustomerData.addCustomer("Shishir", 1262, "48 Monipuripara", 1920034301, "dharshishir08@gmail.com", "abcd");
		CustomerData.addCustomer("Kishore", 1262, "48 Monipuripara", 1920034301, "dharshishir08@gmail.com", "abcd");
	}
	}

