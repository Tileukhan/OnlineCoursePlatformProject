package Decorator;
import Factory.Course;

public class CourseDecorator implements Course {
    protected Course decoratedCourse;
    public CourseDecorator(Course decoratedCourse)
    {
        this.decoratedCourse = decoratedCourse;
    }

    @Override
    public void enroll() {
        decoratedCourse.enroll();
    }
}