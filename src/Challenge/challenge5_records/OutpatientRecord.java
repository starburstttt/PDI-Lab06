package challenge5_records;

public class OutpatientRecord extends PatientRecord {
    public OutpatientRecord(String ssn, String medicalHistory) {
        super(ssn, medicalHistory);
    }

    public void showRecord() {
        // ssn is private -> cannot access directly
        // medicalHistory is protected -> accessible
        System.out.println("Outpatient SSN: " + getMaskedSsn() + " | History: " + medicalHistory);
    }
}
