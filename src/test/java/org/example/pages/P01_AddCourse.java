package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_AddCourse {
    public WebElement email_textbox() {
        //return Hooks.driver.findElement(By.xpath("//input[@class='form-control lms-xs-placeholder text-box single-line']"));

        return Hooks.driver.findElement(By.id("Email"));

    }

    public WebElement password_textbox() {
        return Hooks.driver.findElement(By.id("inputPassword"));
    }

    public WebElement LogIn_button() {
        return Hooks.driver.findElement(By.id("btnLogin"));
    }

    public WebElement Burger_button() {
        return Hooks.driver.findElement(By.id("btnMinifyMe"));
    }
    public WebElement Courses_buttoon(){
        return Hooks.driver.findElement(By.id("btnMyCoursesList"));
    }
    public WebElement AddCourse_button(){
        return Hooks.driver.findElement(By.id("btnListAddCourse"));
    }
    public WebElement CourseName_textbox(){
        return Hooks.driver.findElement(By.id("txtCourseName"));
    }

    public  WebElement grade_dropdown() {
        return Hooks.driver.findElement(By.id("courseGrade"));
    }
    public  void Teacher_dropdown() {
        Hooks.driver.findElement(By.id("teacherOnBehalf")).click();
        Hooks.driver.findElement(By.id("lnkteacherFullName")).click();

    }
    public WebElement CourseCompletion_radio(){
        return Hooks.driver.findElement(By.id("rdOverallAssessments"));
    }

    public WebElement Create_button(){
        return Hooks.driver.findElement(By.id("btnSaveAsDraftCourse"));
    }

    public WebElement CourseName(){
        return Hooks.driver.findElement(By.id("courseNameView"));
    }
    public WebElement Search_textbox(){
        return Hooks.driver.findElement(By.id("txtCourseSearch"));
    }
    public WebElement Search_button(){
        return Hooks.driver.findElement(By.id("btnCourseSearch"));
    }
    public WebElement NameForAss(){
        return Hooks.driver.findElement(By.xpath("//ul[@class='dd-list lms-flex-equal-height']/li[1]/div/div[2]/h3/a"));
    }
}