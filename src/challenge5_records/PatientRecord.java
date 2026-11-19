package challenge5_records;

public class PatientRecord {
    private String ssn;
    protected String medicalHistory;

    public PatientRecord(String ssn, String medicalHistory) {
        this.ssn = ssn;
        this.medicalHistory = medicalHistory;
    }

    public String getMaskedSsn() {
        return "***-**-" + ssn.substring(ssn.length() - 4);
    }
}
