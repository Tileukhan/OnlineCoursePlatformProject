package Factory;

import Singleton.UserManager;

public class WebDevelopmentCourse implements Course {
    @Override
    public void enroll() {
        System.out.println("You are enrolled in the Web Development course!");
    }
}