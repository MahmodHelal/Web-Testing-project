package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_AddCourse;
import org.testng.asserts.SoftAssert;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SD01_AddCourse {

    SoftAssert softAssert = new SoftAssert();
    P01_AddCourse p01AddCourse = new P01_AddCourse();
    @Given("User is on Winjigo login page")
    public void UserIsOnWinjigoLoginPage(){
        //Hooks
    }

    @When("User logs in with username {string} and password {string}")
    public void userLogsInWithUsernameAndPassword(String email, String pass) {
        p01AddCourse.email_textbox().sendKeys(email);
        p01AddCourse.password_textbox().sendKeys(pass);
        p01AddCourse.LogIn_button().click();
    }

    @And("User navigates to courses page")
    public void userNavigatesToCoursesPage() {
        p01AddCourse.Burger_button().click();
        p01AddCourse.Courses_buttoon().click();
    }

    @And("User clicks on Add course button")
    public void userClicksOnAddCourseButton() {
        p01AddCourse.AddCourse_button().click();
    }

    @And("User enters course details {string} {int}")
    public void userEntersCourseDetails(String CourseName, int numOfGrade) {
        p01AddCourse.CourseName_textbox().sendKeys(CourseName);
        Select select = new Select(p01AddCourse.grade_dropdown());
        select.selectByIndex(numOfGrade);
        p01AddCourse.Teacher_dropdown();
    }

    @And("User clicks create")
    public void userClicksCreate() {
        p01AddCourse.Create_button().click();
    }

    @Then("User verifies the course {string} is displayed in the course list")
    public void userVerifiesTheCourseIsDisplayedInTheCourseList(String CourseName) {
        Assert.assertTrue( p01AddCourse.CourseName().getText().contains(CourseName));
        p01AddCourse.Courses_buttoon().click();
        p01AddCourse.Search_textbox().sendKeys(CourseName);
        p01AddCourse.Search_button().click();
        String actual = p01AddCourse.NameForAss().getText();
      //  Assert.assertTrue(actual.contains(CourseName), "Not Found in First Element -- bug in Search Results");
        softAssert.assertEquals(actual,CourseName,"Not Found in First Element -- bug in Search Results");
        softAssert.assertAll();
    }


}
