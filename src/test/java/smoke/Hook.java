package smoke;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.BaseUtils;

public class Hook extends BaseUtils{

    private BaseUtils baseUtils;

    public Hook(BaseUtils baseUtils) {
        this.baseUtils = baseUtils;
    }

    @Before
    public void beforeStartTest(){
        System.out.println("Before");
        baseUtils.driver = "Initialize dirver";
    }

    @After
    public void afterTest(){
        System.out.println("After");
    }
}
