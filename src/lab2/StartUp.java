/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author nstokesbeamon
 */
public class StartUp {
    public static void main(String[] args) {
        AdvancedJavaCourse AJC = new AdvancedJavaCourse();
        IntroJavaCourse IJC = new IntroJavaCourse();
        IntroToProgrammingCourse ITPC = new IntroToProgrammingCourse();
        
        AJC.courseName();
        AJC.courseNumber();
        AJC.credits();
        AJC.Prerequisites();
        
        IJC.courseName();
        IJC.courseNumber();
        IJC.credits();
        IJC.Prerequisites();
        
        ITPC.courseName();
        ITPC.courseNumber();
        ITPC.credits();
        ITPC.Prerequisites();
        
        
        
    }
}
