import org.apache.commons.codec.binary.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.apache.commons.lang3.*;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Matthew on 10/18/2016.
 */
public class MyFirstTest {

    @Test
    public void startWebDriver() throws IOException{


        /******************************played around with chrome options**********************/
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //ChromeOptions options = new ChromeOptions();
        //set chrome account
        //options.addArguments("user-data-dir=C:/Users/Matthew/AppData/Local/Google/Chrome/User Data");
        WebDriver driver = new ChromeDriver();



        /******************************navigate to site and leadership**********************/
        driver.navigate().to("https://www.bettercloud.com/about-us");
        driver.findElement(By.partialLinkText("LEAD")).click();

        WebElement leaders = driver.findElement(By.xpath("//*[@id=\"leaders\"]"));
        List<String> HeadShots = new LinkedList<String>();
        List<String> LinkedIn = new LinkedList<String>();



        /******************************Politis get data**********************/
        WebElement DPolitis = driver.findElement(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[1]"));
        List<WebElement> DPPic = DPolitis.findElements(By.xpath("//*[@src]"));
        for(int i=0; i<DPPic.size(); i++){
            String pic = DPPic.get(i).getAttribute("src");
            if (pic.contains("politis")){
                HeadShots.add(pic);
                break;
            }
        }

        List<WebElement> DPLink = DPolitis.findElements(By.xpath("//*[@href]"));
        for(int i=0; i<DPLink.size(); i++){
            String linkedin = DPLink.get(i).getAttribute("href");
            if ((linkedin.contains("linkedin")) && (linkedin.contains("politis"))){
                LinkedIn.add(linkedin);
                break;
            }
        }


        /******************************Hardwick get data**********************/
        WebElement DHardwick = driver.findElement(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[2]"));
        List<WebElement> DHPic = DHardwick.findElements(By.xpath("//*[@src]"));
        for(int i=0; i<DHPic.size(); i++){
            String pic = DHPic.get(i).getAttribute("src");
            if (pic.contains("hardwick")){
                HeadShots.add(pic);
                break;
            }
        }
        List<WebElement> DHLink = DHardwick.findElements(By.xpath("//*[@href]"));
        for(int i=0; i<DHLink.size(); i++){
            String linkedin = DHLink.get(i).getAttribute("href");
            if ((linkedin.contains("linkedin")) && (linkedin.contains("hardwick"))){
                LinkedIn.add(linkedin);
                break;
            }
        }

        /******************************Hacking get data**********************/
        WebElement BHacking =driver.findElement(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[3]"));
        List<WebElement> BHPic = BHacking.findElements(By.xpath("//*[@src]"));
        for(int i=0; i<BHPic.size(); i++){
            String pic = BHPic.get(i).getAttribute("src");
            if (pic.contains("hacking")){
                HeadShots.add(pic);
                break;
            }
        }
        List<WebElement> BHLink = BHacking.findElements(By.xpath("//*[@href]"));
        for(int i=0; i<BHLink.size(); i++){
            String linkedin = BHLink.get(i).getAttribute("href");
            if ((linkedin.contains("linkedin")) && (linkedin.contains("hacking"))){
                LinkedIn.add(linkedin);
                break;
            }
        }


        /******************************Sachs get data**********************/
        WebElement RSachs =driver.findElement(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[4]"));
        List<WebElement> RSPic = RSachs.findElements(By.xpath("//*[@src]"));
        for(int i=0; i<RSPic.size(); i++){
            String pic = RSPic.get(i).getAttribute("src");
            if (pic.contains("sachs")){
                HeadShots.add(pic);
                break;
            }
        }
        List<WebElement> RSLink = RSachs.findElements(By.xpath("//*[@href]"));
        for(int i=0; i<RSLink.size(); i++){
            String linkedin = RSLink.get(i).getAttribute("href");
            if ((linkedin.contains("linkedin")) && (linkedin.contains("sachs"))){
                LinkedIn.add(linkedin);
                break;
            }
        }

        /******************************Skibbe get data**********************/
        WebElement KSkibbe =driver.findElement(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[5]"));
        List<WebElement> KSPic = KSkibbe.findElements(By.xpath("//*[@src]"));
        for(int i=0; i<KSPic.size(); i++){
            String pic = KSPic.get(i).getAttribute("src");
            if (pic.contains("skibbe")){
                HeadShots.add(pic);
                break;
            }
        }
        List<WebElement> KSLink = KSkibbe.findElements(By.xpath("//*[@href]"));
        for(int i=0; i<KSLink.size(); i++){
            String linkedin = KSLink.get(i).getAttribute("href");
            if ((linkedin.contains("linkedin")) && (linkedin.contains("skibbe"))){
                LinkedIn.add(linkedin);
                break;
            }
        }

        /******************************Gould get data**********************/
        WebElement TGould =driver.findElement(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[6]"));
        List<WebElement> TGPic = TGould.findElements(By.xpath("//*[@src]"));
        for(int i=0; i<TGPic.size(); i++){
            String pic = TGPic.get(i).getAttribute("src");
            if (pic.contains("taylor")){
                HeadShots.add(pic);
                break;
            }
        }
        List<WebElement> TGLink = TGould.findElements(By.xpath("//*[@href]"));
        for(int i=0; i<TGLink.size(); i++){
            String linkedin = TGLink.get(i).getAttribute("href");
            if ((linkedin.contains("linkedin")) && (linkedin.contains("gould"))){
                LinkedIn.add(linkedin);
                break;
            }
        }

        /******************************Greenwood get data**********************/
        WebElement BGreenwood =driver.findElement(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[7]"));
        List<WebElement> BGPic = BGreenwood.findElements(By.xpath("//*[@src]"));
        for(int i=0; i<BGPic.size(); i++){
            String pic = BGPic.get(i).getAttribute("src");
            if (pic.contains("greenwood")){
                HeadShots.add(pic);
                break;
            }
        }
        List<WebElement> BGLink = BGreenwood.findElements(By.xpath("//*[@href]"));
        for(int i=0; i<BGLink.size(); i++){
            String linkedin = BGLink.get(i).getAttribute("href");
            if ((linkedin.contains("linkedin")) && (linkedin.contains("greenwood"))){
                LinkedIn.add(linkedin);
                break;
            }
        }


        /******************************Convert each manager section to text**********************/
        List<WebElement> DPText = DPolitis.findElements(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[1]"));
        List<WebElement> DHText = DHardwick.findElements(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[2]"));
        List<WebElement> BHText = BHacking.findElements(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[3]"));
        List<WebElement> RSText = RSachs.findElements(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[4]"));
        List<WebElement> KSText = KSkibbe.findElements(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[5]"));
        List<WebElement> TGText = TGould.findElements(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[6]"));
        List<WebElement> BGText = BGreenwood.findElements(By.xpath("//*[@id=\"leaders\"]/div/div[2]/div[7]"));

        /*******************get names and titles from tags used********************/
        List<WebElement> names1 = leaders.findElements(By.tagName("h2"));
        List<WebElement> titles1 = leaders.findElements(By.tagName("h5"));
        List<Integer> counts = new LinkedList<Integer>();


        /**********************************Where I count up all the names***************************************************/
        int DPCount = 0;
        String DPTextString = DPText.get(0).getText().toLowerCase();
//        System.out.println(DPTextString);
        DPCount = org.apache.commons.lang3.StringUtils.countMatches(DPTextString, "david");
        DPCount -= org.apache.commons.lang3.StringUtils.countMatches(DPTextString, "david politis");
        counts.add(DPCount);

        int DHCount = 0;
        String DHTextString = DHText.get(0).getText().toLowerCase();
//        System.out.println(DHTextString);
        DHCount = org.apache.commons.lang3.StringUtils.countMatches(DHTextString, "david");
        DHCount -= org.apache.commons.lang3.StringUtils.countMatches(DHTextString, "david hardwick");
        counts.add(DHCount);

        int BHCount = 0;
        String BHTextString = BHText.get(0).getText().toLowerCase();
//        System.out.println(BHTextString);
        BHCount = org.apache.commons.lang3.StringUtils.countMatches(BHTextString, "bart");
        BHCount -= org.apache.commons.lang3.StringUtils.countMatches(BHTextString, "bart hacking");
        counts.add(BHCount);

        int RSCount = 0;
        String RSTextString = RSText.get(0).getText().toLowerCase();
//        System.out.println(RSTextString);
        RSCount = org.apache.commons.lang3.StringUtils.countMatches(RSTextString, "russell");
        RSCount -= org.apache.commons.lang3.StringUtils.countMatches(RSTextString, "russell sachs");
        counts.add(RSCount);

        int KSCount = 0;
        String KSTextString = KSText.get(0).getText().toLowerCase();
//        System.out.println(KSTextString);
        KSCount = org.apache.commons.lang3.StringUtils.countMatches(KSTextString, "kevin");
        KSCount -= org.apache.commons.lang3.StringUtils.countMatches(KSTextString, "kevin skibbe");
        counts.add(KSCount);

        int TGCount = 0;
        String TGTextString = TGText.get(0).getText().toLowerCase();
//        System.out.println(TGTextString);
        TGCount = org.apache.commons.lang3.StringUtils.countMatches(TGTextString, "taylor");
        TGCount -= org.apache.commons.lang3.StringUtils.countMatches(TGTextString, "taylor gould");
        counts.add(TGCount);

        int BGCount = 0;
        String BGTextString = BGText.get(0).getText().toLowerCase();
//        System.out.println(BGTextString);
        BGCount = org.apache.commons.lang3.StringUtils.countMatches(BGTextString, "brett");
        BGCount -= org.apache.commons.lang3.StringUtils.countMatches(BGTextString, "brett greenwood");
        counts.add(BGCount);
/**********************************end of counts***************************************************/

/******************************Inputting names into linkedlist***********************************************/
        List<String> names = new LinkedList<String>();
        names1.remove(0);
        for(int i=0;i<names1.size();i++){
            if ((names1.get(i).getText().length() > 1)) {
//                System.out.println(names1.get(i).getText());
                names.add(names1.get(i).getText());
            }
        }
/******************************Inputting titles into linkedlist***********************************************/
        List<String> titles = new LinkedList<String>();
//        System.out.println("start of titles");
        for(int i=0;i<titles1.size();i++){
//            System.out.println(titles1.get(i).getText());
            titles.add(titles1.get(i).getText());
        }

/**************************************Testing for picture URLs and LinkedIn URLs**************/
//        System.out.println("start of image urls");
//        for(String url : HeadShots){
//            System.out.println(url);
//        }
//
//        System.out.println("start of LinkedIn urls");
//        for(String url : LinkedIn){
//            System.out.println(url);
//        }
//        *******************************************************************************

        //testing all my counts
//        System.out.println("David p count: " + DPCount);
//        System.out.println("David h count: " + DHCount);
//        System.out.println("BH count: " + BHCount);
//        System.out.println("RS count: " + RSCount);
//        System.out.println("KS count: " + KSCount);
//        System.out.println("TGcount: " + TGCount);
//        System.out.println("BG count: " + BGCount);

//        System.out.println("test of counts:");
//        for (int c: counts){
//            System.out.print(c + " ");
//        }

        List<String> locations = new LinkedList<String>();
        List<String> educations = new LinkedList<String>();
        //display information listed from public linkedin page
        for (int i =0; i< LinkedIn.size(); i++){
            driver.navigate().to(LinkedIn.get(i));
            locations.add(driver.findElement(By.xpath("//*[@id=\"demographics\"]/dd[1]/span")).getText());
            if (!driver.findElements(By.xpath("//*[@id=\"topcard\"]/div[1]/div[2]/div/table/tbody/tr[3]/td/ol/li/a")).isEmpty()){
                educations.add(driver.findElement(By.xpath("//*[@id=\"topcard\"]/div[1]/div[2]/div/table/tbody/tr[3]/td/ol/li/a")).getText());
            }
            else educations.add("no education on public site");
            driver.navigate().back();
        }



//        Testing for locations and educations from linkedin
//        for (String s : locations){
//            System.out.println(s);
//        }
//        for (String s : educations){
//            System.out.println(s);
//        }

        //name, title, image, count, location, education
        /******************************create and write to csvFile**********************/


        FileWriter csvFile = new FileWriter("output.csv");
        csvFile.write("Name, Title, Headshot URL, Location, Education, First name count"+"\r\n");
        for (int i =0; i<7; i++){
            //System.out.print(names.get(i)+" , "+titles.get(i)+" , "+HeadShots.get(i)+" , "+locations.get(i)+" , "+educations.get(i));
            //StringBuilder sb = new StringBuilder();
            csvFile.write(names.get(i)+" , "+titles.get(i)+" , "+HeadShots.get(i)+
                    " , "+locations.get(i).replaceAll(", ", " ")+" , "+educations.get(i)+" , "+counts.get(i)+"\r\n");
            //writer.append(sb);

            //csvFile.write("FILE WRITING");

            //System.out.println();
        }
        csvFile.flush();
        csvFile.close();
        driver.close();
        driver.quit();
    }

}
