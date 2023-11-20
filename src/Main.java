import Singleton.*;
import Strategy.*;
import Decorator.*;
import Adapter.*;
import Factory.*;
import Observer.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        boolean isAuthenticated = userManager.authenticateUser("admin", "123456");

        GUI gui = new GUI();
        Scanner scanner = new Scanner(System.in);
        if (isAuthenticated) {
            System.out.println("Welcome to the Online Course Platform!");
            while (true) {
                gui.showMenu();
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        gui.showCourses();
                        System.out.print("Enter your choice: ");
                        int courseChoice = scanner.nextInt();
                        CourseFactory courseFactory;
                        Course course;

                        if (choice == 1) {
                            courseFactory = new CalculusCourseFactory();
                        } else if (choice == 2) {
                            courseFactory = new PythonCourseFactory();
                        } else {
                            courseFactory = new WebDevelopmentCourseFactory();
                        }

                        course = courseFactory.createCourse();

                        gui.showPaymentMethods();
                        System.out.print("Enter your choice: ");
                        int paymentChoice = scanner.nextInt();
                        scanner.nextLine();

                        String card;
                        switch (paymentChoice) {
                            case 1:
                                System.out.println("Enter your credit card: ");
                                card = scanner.nextLine();
                                PaymentStrategy paymentStrategy = new KaspiPayStrategy(card);
                                PaymentContext paymentContext = new PaymentContext(paymentStrategy);
                                paymentContext.executePayment(100);
                                break;
                            case 2:
                                System.out.println("Enter your credit card: ");
                                card = scanner.nextLine();
                                paymentStrategy = new HalykPayStrategy(card);
                                paymentContext = new PaymentContext(paymentStrategy);
                                paymentContext.executePayment(100);
                                break;
                            case 3:
                                System.out.println("Enter your credit card: ");
                                card = scanner.nextLine();
                                paymentStrategy = new QiwiPayStrategy(card);
                                paymentContext = new PaymentContext(paymentStrategy);
                                paymentContext.executePayment(100);
                                break;
                            case 4:
                                System.out.println("Exiting the program. Goodbye!");
                                System.exit(0);
                        }

                        gui.showFormats();
                        System.out.print("Enter your choice: ");
                        int formatChoice = scanner.nextInt();
                        if (formatChoice == 1) {
                            Course videoDecorator = new VideoCourseDecorator(course);
                            videoDecorator.enroll();
                        } else if (formatChoice == 2) {
                            Course textDecorator = new TextCourseDecorator(course);
                            textDecorator.enroll();
                        }
                        break;
                    case 2:
                        System.out.println("How many students do you want to add: ");
                        int students = scanner.nextInt();
                        scanner.nextLine();

                        String studentName;
                        for (int i = 0; i < students; i++) {
                            System.out.println("Student name: ");
                            studentName = scanner.nextLine();
                            userManager.addObserver(new Student(studentName));
                        }
                        userManager.notifyObservers("Welcome!");
                        break;
                    case 3:
                        gui.showVariants();
                        System.out.print("Enter your choice: ");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                            DownloadMaterial downloader = new DownloadMaterialToTxt("C:\\Users\\tleuk\\IdeaProjects\\Final_Project\\src\\courseinformation.txt");
                            downloader.saveMaterial();
                        } else if (choice == 2) {
                            DownloadMaterial downloader = new DownloadMaterialToHtmlAdapter(new HTMLDownloader("C:\\Users\\tleuk\\IdeaProjects\\Final_Project\\src\\courseinformation.html"));
                            downloader.saveMaterial();
                        }
                        break;
                    case 4:
                        System.out.println("Exiting the program. Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } else {
            System.out.println("Authentication failed");
        }
    }
}