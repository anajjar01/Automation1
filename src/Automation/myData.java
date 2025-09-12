package Automation;

import java.util.Random;

public class myData {

	Random rand = new Random();
	
	String [] firstNames = {"shatha","zainab","ayham","abdulrahman","ammar","sana"};
	
	String [] lastNames = {"mohammad","mahmoud","ali","omar","anas","rami"};
	
	int randomNumberForTheEmail = rand.nextInt(9845);
	
	String domain = "@gmail.com";
	
	int randomFirstNameIndex = rand.nextInt(firstNames.length);
	int randomLastNameIndex = rand.nextInt(lastNames.length);
	
	String TheFirstName = firstNames[randomFirstNameIndex];
	String TheLastName = lastNames[randomLastNameIndex];
	String TheEmail = TheFirstName + TheLastName + randomNumberForTheEmail + domain;
	
	String TelePhone = "96567752899";
	String TheFaxNumber = "96567752899";
	String TheAddressOne = "Kuwait - Alfintas";
	
	int theSelectStateIndex = rand.nextInt(1,10);
	String postalCode = "1985";
	
	String LoginName = TheFirstName + TheLastName + randomNumberForTheEmail;
	String password = "P@ssw0rd";
	
	String ExpectedTextForTheSignUp = "YOUR ACCOUNT HAS BEEN CREATED!";
	String expectedLogoutMessage = "ACCOUNT LOGOUT";
	String welcomemessage = "Welcome back "+TheFirstName;
}
