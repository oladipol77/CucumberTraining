package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void InitializeTest()
    {

        System.out.println("Browser Opening");
    }


    @After
    public void TearDownTest(Scenario scenario)
    {
        if (scenario.isFailed())
        {
        //Take Screenshot code
        System.out.println(scenario.getName());
    }

            System.out.println("Browser Closing");
    }


}
