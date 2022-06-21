package EMR;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

        private String testName;
        private double testCost;
        private String testResult;
        private LocalDateTime testDate;


    public Test(String testName, double testCost, String testResult){
            this.testName = testName;
            this.testCost = testCost;
            this.testResult = testResult;
            testDate = LocalDateTime.now();


        }

        public void setTestName (String testName){
            this.testName = testName;
        }

        public String getTestName () {
            return testName;
        }

        public void setTestCost ( double testCost){
            this.testCost = testCost;
        }

        public double getTestCost () {
            return testCost;
        }

        public String getTestResult () {
            return testResult;
        }

        public String getTestDate() {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String dateCreated = testDate.format(dateFormatter);
            return dateCreated;
        }

    }
