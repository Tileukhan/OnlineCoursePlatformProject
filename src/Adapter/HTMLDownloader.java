package Adapter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class HTMLDownloader implements HTMLSaver {
    private String path;
    public HTMLDownloader(String path) {
        this.path = path;
    }
    @Override
    public void saveToHtml() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write("<!DOCTYPE html>");
            writer.newLine();
            writer.write("<html lang=\"en\">");
            writer.newLine();
            writer.write("<head>");
            writer.newLine();
            writer.write("<meta charset=\"UTF-8\">");
            writer.newLine();
            writer.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            writer.newLine();
            writer.write("<title>Document</title>");
            writer.newLine();
            writer.write("</head>");
            writer.newLine();
            writer.write("<body>");
            writer.newLine();
            writer.write("<p>" + """
            Title: Online Course Platform Overview - Calculus, Python Programming, and Web Development
                                   \s
            Introduction:
            In the rapidly evolving landscape of education, online learning platforms have gained immense popularity, providing accessible and flexible education to learners worldwide. This overview focuses on an exemplary Online Course Platform that offers a diverse range of courses, with a particular emphasis on Calculus, Python Programming, and Web Development.
                       \s
            Platform Name: LearnHub Pro
                       \s
            Key Features:
                       \s
            Course Diversity:
                       \s
            Calculus: out platform offers comprehensive courses in Calculus, catering to both beginners and advanced learners. Courses cover topics such as limits, derivatives, integrals, and multivariable calculus, ensuring a well-rounded understanding of the subject.
                       \s
            Python Programming: The platform provides an extensive array of Python programming courses, suitable for beginners and experienced developers alike. From basic syntax to advanced topics like web scraping, data analysis, and machine learning, learners can choose courses tailored to their skill level.
                       \s
            Web Development: out platform excels in providing cutting-edge courses in web development. Covering HTML, CSS, JavaScript, and frameworks like Django and React, learners can acquire the skills necessary to build robust and dynamic web applications.
                       \s
            Interactive Learning Environment:
                       \s
            Out platform employs interactive learning methodologies, including hands-on coding exercises, quizzes, and projects. This fosters a practical understanding of concepts and allows learners to apply their knowledge in real-world scenarios.
            Expert Instructors:
                       \s
            Courses are led by industry experts and experienced educators. Instructors bring a wealth of practical knowledge and real-world experience to the virtual classroom, ensuring a high-quality learning experience.
            Self-Paced Learning:
                       \s
            The platform recognizes the importance of flexibility in education. Learners can progress through courses at their own pace, allowing those with busy schedules or varying learning speeds to benefit fully from the educational offerings.
            Certification and Recognition:
                       \s
            Upon successful completion of courses, learners receive certificates that are recognized by industry professionals and employers. These certificates serve as a testament to the learner's proficiency in Calculus, Python Programming, or Web Development.
            Community and Networking:
                       \s
            Our platform fosters a vibrant online community where learners can connect, collaborate, and share insights. This networking opportunity enhances the overall learning experience by providing a platform for discussions, peer support, and collaboration on projects.
            Up-to-Date Content:
                       \s
            Courses are regularly updated to align with the latest developments in Calculus, Python programming, and Web Development. This ensures that learners are equipped with the most relevant and current knowledge in their respective fields.
            In conclusion, out platform stands out as a leading Online Course Platform that excels in providing high-quality education in Calculus, Python Programming, and Web Development. With its diverse course offerings, interactive learning environment, and industry-recognized certifications, it caters to the needs of learners seeking to enhance their skills and advance their careers in these critical fields.
            ""\");
            """ + "</p>");
            writer.newLine();
            writer.write("</body>");
            writer.newLine();
            writer.write("</html>");
            writer.newLine();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
