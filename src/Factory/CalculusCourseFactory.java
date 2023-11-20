package Factory;

public class CalculusCourseFactory extends CourseFactory {
    @Override
    public Course createCourse() {
        return new CalculusCourse();
    }
}