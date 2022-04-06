//This is a test case for the first video lecture
//https://www.youtube.com/watch?v=MsIQmCJD0Hc&list=PLUDwpEzHYYLsWENabqeETzgPLbmwqhM45&index=1


import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void teardown(){
        System.out.println("Closing browser");
    }

}
