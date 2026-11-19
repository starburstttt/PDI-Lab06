package challenge5_records;

public class Main {
    public static void main(String[] args) {
        OutpatientRecord out = new OutpatientRecord("123-45-6789", "Routine Checkup");
        InpatientRecord in = new InpatientRecord("987-65-4321", "Post-Surgery Recovery", 304);
        out.showRecord();
        in.showRecord();
    }
}
