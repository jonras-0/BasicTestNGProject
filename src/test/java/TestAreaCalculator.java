import org.testng.Assert;
import org.testng.annotations.*;

public class TestAreaCalculator {
    private AreaCalculator areaCalculator;


    @BeforeSuite(groups = {"Preparation"})
    public void initializeTest() {
        areaCalculator = new AreaCalculator();
    }

    @Test(testName = "Test Rectangle Area", groups = {"Quadrilateral"})
    public void testRectangleArea() {
        double expectedValue = 12.0;
        Assert.assertEquals(areaCalculator.areaOfRectangle(4.0, 3.0), expectedValue);
    }

    @Test(testName = "Test Square Area", groups = {"Quadrilateral"}, dependsOnMethods = {"testRectangleArea"})
    public void testSquareArea() {
        double expectedValue = 16.0;
        Assert.assertEquals(areaCalculator.areaOfSquare(4.0), expectedValue);
    }

    @Test(testName = "Test Triangle Area", groups = {"Trilateral"})
    public void testTriangleArea() {
        double expectedValue = 12.5;
        Assert.assertEquals(areaCalculator.areaOfTriangle(5.0, 5.0), expectedValue);
    }

}
