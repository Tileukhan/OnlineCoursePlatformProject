package Observer;

public interface CourseSubject {
    void addObserver(CourseObserver observer);
    void removeObserver(CourseObserver observer);
    void notifyObservers(String message);
}