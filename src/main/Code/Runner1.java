package Code;

import com.github.mkolisnyk.cucumber.runner.AfterSuite;
import com.github.mkolisnyk.cucumber.runner.BeforeSuite;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.sun.swing.internal.plaf.synth.resources.synth_sv;
import cucumber.api.CucumberOptions;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;


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
     static int i=0;
    static String  Url;
    static String username;
    static String password;
    static Properties prop;
   static List list;
    @BeforeSuite
    public static void  setup() throws IOException {
        list=new ArrayList();
        String loc="D:\\School_login.xlsx";
        File fl= new File(loc);
        FileInputStream in= new FileInputStream(fl);
        Workbook wb=null;
        String sr=loc.substring(loc.indexOf("."));
        //System.out.println(sr)qwqweea12y;
        if(sr.equals(".xls"))
        {
            wb= new HSSFWorkbook(in);
        }
        else if(sr.equals(".xlsx"))
        {
           wb = new XSSFWorkbook(in);

        }
        Sheet sh= wb.getSheetAt(0);
        Iterator<Row> it= sh.iterator();
        while(it.hasNext())
        {
            Row row= it.next();
            Iterator<Cell> c=row.iterator();
            while(c.hasNext())
            {
                Cell cell=c.next();
                list.add(cell);


            }
        }
        /*for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
*/System.out.println(list.size());

        Url= list.get(i).toString();
        username=list.get(i+1).toString();
        password=list.get(i+2).toString();
        /*System.out.println(Url);
        System.out.println(username);
        System.out.println(password);*/
       prop= new Properties();
        FileInputStream fl1=new FileInputStream("C:\\Users\\himanshu\\IdeaProjects\\Fees\\prop.properties");
        prop.load(fl1);

    }

    @AfterSuite
    public static void teardown()
    {
     i+=3;
     if(i==list.size())
     {

     }
     else
     {

     }
    }

}
