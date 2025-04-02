package ex_19_OOPS_Inheritence._Single_Inheritence;

public class TestCase2 extends CommonToAll {

    void runningTC2() {
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }

}