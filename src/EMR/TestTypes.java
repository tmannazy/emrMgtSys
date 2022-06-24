package EMR;

public enum TestTypes {
    PREGNANCY("Pregnancy"), HIV("HIV"), URINALYSIS("Urinalysis"), BLOODCOUNT("Blood Count"), VISUALACTIVITY("Visual Activity"),
    BLOODPRESSURE("Blood Pressure"), CTSCAN("CT Scan"), CHESTXRAY("Chest X-Ray"), RETROVIVALSCREENING("Retrovival Screening");
    private String testName;

    TestTypes(String testType) {
        this.testName = testType;
    }

    String getTestType() {
        return testName;
    }
}
