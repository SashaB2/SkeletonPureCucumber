package smoke;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import transformation.EmailTransform;
import utils.BaseUtils;

import java.util.List;

public class MainSteps extends BaseUtils{

    private BaseUtils baseUtils;

    public MainSteps(BaseUtils baseUtils) {
        this.baseUtils = baseUtils;
    }

    @Given("^I am on main page$")
    public void iAmOnMainPage() throws Throwable {
        System.out.println(baseUtils.driver);
        System.out.println("I am on main page");
    }


    @When("^I open login menu$")
    public void iOpenLoginMenu() {
        System.out.println("I open login menu");
    }

    @When("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("I click login button");
    }


    @And("^I type \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iTypeAnd(String userName, String password) {
        System.out.println("I type a user name and password");

        System.out.println(userName);
        System.out.println(password);
    }

    @And("^I type the following for login$")
    public void iTypeTheFollowingForLogin(DataTable dataTable) {
        System.out.println("I type a user name and password");

        List<List<String>> data = dataTable.raw();
        System.out.println((data.get(1).get(0).toString()));
        System.out.println((data.get(1).get(2)).toString());
    }

    @And("^I enter ([^\"]*) and ([^\"]*) on login page$")
    public void iEnterUserNameAndPasswordOnLoginPage(String userName, String password) throws Throwable {
        System.out.println("I type a user name and password");


        System.out.println(userName);
        System.out.println(password);
    }

    @When("^I input Email:([^\"]*)$")
    public void iSearchItemNote(@Transform(EmailTransform.class) String email) throws Throwable {
        System.out.println("I type email");

        System.out.println("Search item:" + email);
    }



    @When("^I type the following$")
    public void i_Type_The_Following(DataTable dataTable) throws Throwable {

        List<User> users = dataTable.asList(User.class);

        for (User user : users) {
            System.out.println(user);
        }
    }



    public class User {
        private String name = null;
        private String password = null;

        public User(String name, String password) {
            this.name = name;
            this.password = password;

        }
    }
}


