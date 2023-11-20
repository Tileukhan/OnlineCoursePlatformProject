package Decorator;
import Factory.Course;

public class TextCourseDecorator extends CourseDecorator{
    public TextCourseDecorator(Course decoratedCourse)
    {
        super(decoratedCourse);
    }

    @Override
    public void enroll() {
        super.enroll();
        System.out.println("You chose text format of this course.");
    }
}