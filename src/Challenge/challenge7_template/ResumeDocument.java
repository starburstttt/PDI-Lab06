package challenge7_template;

public class ResumeDocument extends Document {
    @Override protected void writeHeader() { System.out.println("=== RESUME: JANE DOE ==="); }
    @Override protected void writeBody() { System.out.println("Skills: Java, OOP, System Design"); }
    @Override protected void writeFooter() { System.out.println("Contact: jane@example.com"); }
}
