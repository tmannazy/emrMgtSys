package EMR;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestEntry {
    private LocalDateTime dateCreated;
    private  String name;
    private double price;
    private String result;

    private List<String> testTypes = Stream.of(TestTypes.values()).map(TestTypes::getTestType).collect(Collectors.toList());

//    private

    public TestEntry(String nameOfTest, double priceOfTest, String testResult) {
        name = nameOfTest;
        price = priceOfTest;
        result = testResult;
        dateCreated = LocalDateTime.now();
    }

    public String getNameOfTest() {
        return name;
    }

    public double getPriceOfTest() {
        return price;
    }

    public String getResultOfTest() {
        return result;
    }

    public String getDateOfTest() {
        DateTimeFormatter dateNew = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        return dateCreated.format(dateNew);
    }

    public List<String> getListOfTestTypes() {
        return testTypes;
    }
}
