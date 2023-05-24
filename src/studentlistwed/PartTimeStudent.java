/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlistwed;

/**
 * a PartTime Student is like a student from our other class 
 * @author azad
 */
public class PartTimeStudent extends Student {
    private int numCourses;
    
    public PartTimeStudent(String name, int givenNumCourse){
        super(name);
        numCourses = givenNumCourse;
    }

    /**
     * @return the numCourses
     */
    public int getNumCourses() {
        return numCourses;
    }

    /**
     * @param numCourses the numCourses to set
     */
    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
}
