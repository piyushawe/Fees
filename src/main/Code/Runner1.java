package Code;

import com.github.mkolisnyk.cucumber.runner.AfterSuite;
import com.github.mkolisnyk.cucumber.runner.BeforeSuite;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import cucumber.api.CucumberOptions;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


@RunWith(ExtendedCucumber.class)
/*@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 3,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        toPDF = true,
        outputFolder = "target")*/
@CucumberOptions(
        features={"src/Feature_File/Login.feature"}
        ,glue={"Stepdef_Runner"}
        ,monochrome=true
        ,plugin= {"pretty","html:target/cucumber_html_report"}
)
public class Runner1 {
    @BeforeSuite
    public static void  setup() throws IOException {
        String loc="D:\\School_login.xlsx";
        File fl= new File(loc);
        FileInputStream in= new FileInputStream(fl);
        Workbook wb=null;
        String sr=loc.substring(loc.indexOf("."));
        //System.out.println(sr);
        if(sr.equals(".xls"))
        {
            wb= new HSSFWorkbook(in);
        }
        else if(sr.equals(".xlsx"))
        {
           wb = new XSSFWorkbook(in);
        }
        Sheet sh= wb.getSheetAt(0);


    }
    @AfterSuite
    public static void teardown()
    {

    }

}
