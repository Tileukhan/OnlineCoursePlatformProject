package Factory;

import Singleton.UserManager;

public class CalculusCourse implements Course {
    @Override
    public void enroll() {
        System.out.println("You are enrolled in the Calculus course!");
    }
}