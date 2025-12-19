package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataproviders {

    // DataProvider 1 — Login Data
    @DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {

        // Excel file path (make sure testData folder exists under project root)
        String path = ".\\testdata\\OpenCart_LoginTestData.xlsx";

        // Create ExcelUtility object
        ExcelUtility xlutil = new ExcelUtility(path);

        // Get total rows and columns
        int totalrows = xlutil.getRowCount("Sheet1");
        int totalcols = xlutil.getCellCount("Sheet1", 1);

        // Create 2D array to store Excel data
        String[][] logindata = new String[totalrows][totalcols];

        // Read Excel data into array
        for (int i = 1; i <= totalrows; i++) {
            for (int j = 0; j < totalcols; j++) {
                logindata[i - 1][j] = xlutil.getCellData("Sheet1", i, j);
            }
        }

        // Return data to TestNG test
        return logindata;
    }
}
