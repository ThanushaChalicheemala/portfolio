import javax.swing.*;
import java.awt.*;

public class PortfolioGUI {
    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("My Portfolio");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Title Panel
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(72, 61, 139)); // Dark Purple
        JLabel title = new JLabel("🌸 My Portfolio 🌸");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.WHITE);
        titlePanel.add(title);
        frame.add(titlePanel, BorderLayout.NORTH);

        // Main Content Panel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(5, 1, 10, 10));
        contentPanel.setBackground(new Color(255, 228, 225)); // Light Pink

        // About Me
        JLabel about = new JLabel("👩 About Me: Hi, I'm Thanusha, a final year student in Sreenivasa Institute of Technology and Management studies.");
        about.setFont(new Font("Verdana", Font.PLAIN, 16));
        about.setForeground(new Color(138, 43, 226)); // Violet
        contentPanel.add(about);

        // Skills
        JLabel skills = new JLabel("🛠 Skills: Java, SQL, GitHub, HTML, CSS, Canva,Capcut Problem Solving,");
        skills.setFont(new Font("Verdana", Font.PLAIN, 16));
        skills.setForeground(new Color(34, 139, 34)); // Green
        contentPanel.add(skills);

        // Projects
        JLabel projects = new JLabel("📂 Projects: Portfolio App, Youtube Spam Detection, Crop Recommendation System");
        projects.setFont(new Font("Verdana", Font.PLAIN, 16));
        projects.setForeground(new Color(255, 69, 0)); // Orange-Red
        contentPanel.add(projects);

        // Education
        JLabel education = new JLabel("🎓 Education: B.Tech CSE, SITAMS (Graduating 2026)");
        education.setFont(new Font("Verdana", Font.PLAIN, 16));
        education.setForeground(new Color(70, 130, 180)); // Steel Blue
        contentPanel.add(education);

        // Contact
        JLabel contact = new JLabel("📧 Contact: tanuchoudary09@gmail.com | GitHub: github.com/ThanushaChalicheemala");
        contact.setFont(new Font("Verdana", Font.PLAIN, 16));
        contact.setForeground(new Color(199, 21, 133)); // Pinkish Purple
        contentPanel.add(contact);

        // Add content to frame
        frame.add(contentPanel, BorderLayout.CENTER);

        // Show frame
        frame.setVisible(true);
    }
}
