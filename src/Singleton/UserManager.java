package Singleton;

import Observer.CourseObserver;
import Observer.CourseSubject;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements CourseSubject {
    private List<CourseObserver> observers;
    private static UserManager instance;

    private UserManager() {
        observers = new ArrayList<>();
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public boolean authenticateUser(String username, String password) {
        return username.equals("admin") && password.equals("123456");
    }

    @Override
    public void addObserver(CourseObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(CourseObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (CourseObserver observer : observers) {
            observer.update(message);
        }
    }
}