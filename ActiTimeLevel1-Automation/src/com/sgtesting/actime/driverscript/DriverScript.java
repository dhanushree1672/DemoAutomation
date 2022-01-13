package com.sgtesting.actime.driverscript;

import com.sgtesting.actime.tests.HomePage;
import com.sgtesting.actime.tests.Initialize;
import com.sgtesting.actime.tests.LoginLogout;
import com.sgtesting.actime.tests.Users;
import com.sgtesting.actime.tests.Customers;
import com.sgtesting.actime.tests.Projects;
import com.sgtesting.actime.tests.Tasks;

public class DriverScript {

	public static void main(String[] args) {
		//Create User Scenario
		//LaunchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();

		//Create and Modify User Scenario
		//LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.modifyUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();

		//Create Customer Scenario
		//LaunchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.deleteCustomer();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();

		//Create and Modify Customer Scenario
		//LaunchBrowser-->navigate-->login-->createCustomer-->modifyCustomer-->deleteCustomer-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Customers.modifyCustomer();
		Customers.deleteCustomer();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();

		//Create Project Scenario
		//LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->DeleteProject-->deleteCustomer-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Projects.createProject();
		Projects.deleteProject();
		Customers.deleteCustomer();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();


		//Create and modify Project Scenario
		//LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->modifyProject -->DeleteProject-->deleteCustomer-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Projects.createProject();
		Projects.modifyProject();
		Projects.deleteProject();
		Customers.deleteCustomer();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();

		//Create Task Scenario
		//launchBrowser-->navigate-->login-->createCustomer-->CreateProject-->Create Tasks -->Delete Tasks -->DeleteProject-->deleteCustomer-->logout -->closeApplication
		Initialize.launchBrowser();
		Initialize.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.createCustomer();
		Projects.createProject();
		Tasks.createTask();
		Tasks.deleteTask();
		Projects.deleteProject();
		Customers.deleteCustomer();
		Users.deleteUser();
		LoginLogout.logout();
		Initialize.closeApplication();


	}


}
