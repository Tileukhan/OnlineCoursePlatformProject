package Factory;

public class PythonCourseFactory extends CourseFactory {
    @Override
    public Course createCourse() {
        return new PythonCourse();
    }
}