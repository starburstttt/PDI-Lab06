package challenge7_template;

public class InvoiceDocument extends Document {
    @Override protected void writeHeader() { System.out.println("=== INVOICE ==="); }
    @Override protected void writeBody() { System.out.println("Items: Web Hosting - $120.00"); }
    @Override protected void writeFooter() { System.out.println("Total Due: $120.00"); }
}
