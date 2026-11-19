package challenge7_template;

public class ReportDocument extends Document {
    @Override protected void writeHeader() { System.out.println("=== ANNUAL REPORT ==="); }
    @Override protected void writeBody() { System.out.println("Revenue grew by 18% YoY."); }
    @Override protected void writeFooter() { System.out.println("Confidential - Internal Use"); }
}
