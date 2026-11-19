package challenge5_records;

public class InpatientRecord extends PatientRecord {
    private int roomNumber;

    public InpatientRecord(String ssn, String medicalHistory, int roomNumber) {
        super(ssn, medicalHistory);
        this.roomNumber = roomNumber;
    }

    public void showRecord() {
        System.out.println("Inpatient Room " + roomNumber + " | SSN: " + getMaskedSsn() + " | History: " + medicalHistory);
    }
}
