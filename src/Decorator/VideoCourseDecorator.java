package Decorator;
import Factory.Course;

public class VideoCourseDecorator extends CourseDecorator{
    public VideoCourseDecorator(Course decoratedCourse)
    {
        super(decoratedCourse);
    }

    @Override
    public void enroll() {
        super.enroll();
        System.out.println("You chose video format of this course.");
    }
}