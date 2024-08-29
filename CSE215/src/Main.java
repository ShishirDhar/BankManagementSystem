import java.util.*;
import com.bank.ui.UserInterface;
import com.bank.database.CustomerData;

public class Main {
	
	public static void main(String[] args) {
		new UserInterface();
		CustomerData[] custom = new CustomerData[2];
		custom[0] = new CustomerData("Shishir", 1262, "48 Monipuripara", 1920034301, "dharshishir08@gmail.com", "abcd");
		custom[1] = new CustomerData("Kishore", 712, "48 Monipuripara", 1641884467 , "kdhar578@gmail.com", "nigga");
		
	}

}
