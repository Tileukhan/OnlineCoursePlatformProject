package Factory;

import Singleton.UserManager;

public class PythonCourse implements Course {
    @Override
    public void enroll() {
        System.out.println("You are enrolled in the Python Programming course!");
    }
}