/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author L115student
 */
public class StartUp {
    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */
        
        
        //Providing input
    AdvancedJavaCourse AJC = new AdvancedJavaCourse("Advanced Java","152367",3.0,"Intro Java");
    IntroJavaCourse IJC = new IntroJavaCourse("IntroJava","152345",4.0,"Intro to Programming");
    IntroToProgrammingCourse ITPC = new IntroToProgrammingCourse("IntroToProgramming","152098",4.0,"No Prerequisites");
    
    
    
        // Test input/output..
            System.out.println(" Course Name: " + AJC.getCourseName() +  
                    "\n Course Number: "+ AJC.getCourseNumber() + 
                    "\n Prerequisites: " + AJC.getPrerequisites() + 
                    "\n Credits: " + AJC.getCredits());
        }
    }
 
