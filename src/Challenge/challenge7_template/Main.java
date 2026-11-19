package challenge7_template;

public class Main {
    public static void main(String[] args) {
        Document[] docs = {
            new InvoiceDocument(),
            new ResumeDocument(),
            new ReportDocument()
        };

        for (Document d : docs) {
            d.generate();
        }
    }
}
