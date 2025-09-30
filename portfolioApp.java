// PortfolioApp.java
public class PortfolioApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("      MY JAVA PORTFOLIO APP");
        System.out.println("====================================");
        System.out.println("Name      : Thanusha (your name)");
        System.out.println("Role      : Student / Learner / Java beginner");
        System.out.println();
        System.out.println("About     : I build small projects to learn Java, Git and GitHub.");
        System.out.println();
        System.out.println("Skills    :");
        String[] skills = {"Java (basic)", "Problem Solving", "Git", "Video Editing (beginner)"};
        for (String s : skills) {
            System.out.println(" - " + s);
        }
        System.out.println();
        System.out.println("Projects   :");
        System.out.println("  1) PortfolioApp (this program) - prints my details.");
        System.out.println("  2) Add more projects here later.");
        System.out.println();
        System.out.println("How to run: javac PortfolioApp.java  then  java PortfolioApp");
        System.out.println();
        System.out.println("Contact   : your-email@example.com");
        System.out.println("====================================");
    }
}
