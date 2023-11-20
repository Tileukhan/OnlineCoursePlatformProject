package Factory;

public class WebDevelopmentCourseFactory extends CourseFactory {
    @Override
    public Course createCourse() {
        return new WebDevelopmentCourse();
    }
}