package posttest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Calculator {
    private AndroidDriver<MobileElement> driver;
    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    By btnSatu = By.id("com.android.calculator:id/digit_1");
    By btnDua = By.id("com.android.calculator:id/digit_2");
    By btnTiga= By.id("com.android.calculator:id/digit_3");
    By btnEmpat= By.id("com.android.calculator:id/digit_4");

    By btnKali= By.id("com.android.calculator:id/op_mul");
    By btnTambah = By.id("com.android.calculator:id/op_add");
    By btnSamaDengan = By.id("com.android.calculator:id/eq");
    By hasil = By.id("com.android.calculator:id/result_final");


    public void Tambah() {
        driver.findElement(btnSatu).click();
        driver.findElement(btnTambah).click();
        driver.findElement(btnDua).click();
        driver.findElement(btnSamaDengan).click();
    }
    public void Kali(){
        driver.findElement(btnTiga).click();
        driver.findElement(btnKali).click();
        driver.findElement(btnEmpat).click();
        driver.findElement(btnSamaDengan).click();
    }
    public String getTxtResult() {
        return driver.findElement(hasil).getText();
    }

    public String getTxtKali(){
        return driver.findElement(hasil).getText();
    }
}
