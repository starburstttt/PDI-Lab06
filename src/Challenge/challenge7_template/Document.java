package challenge7_template;

public abstract class Document {
    public final void generate() {
        writeHeader();
        writeBody();
        writeFooter();
        System.out.println("-------------------------");
    }

    protected abstract void writeHeader();
    protected abstract void writeBody();
    protected abstract void writeFooter();
}
