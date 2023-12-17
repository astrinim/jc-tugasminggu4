package com.juaracoding;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FinancialReportTest {

    private AndroidDriver driver;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Pixel 2 API 30");
        dc.setCapability("udid", "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("platformVersion", "11");
        dc.setCapability("appPackage", "com.chad.financialrecord");
        dc.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
        dc.setCapability("noReset", true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, dc);
    }


    @AfterClass
    public void finish() {
        driver.quit();
    }

    @Test
    public void testPengeluaran() {
        MobileElement harian = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.a.c[@content-desc=\"Daily\"]");
        harian.click();
        MobileElement btnAdd = (MobileElement) driver.findElementByXPath("//android.widget.ImageButton[@resource-id=\"com.chad.financialrecord:id/fabMenu\"]");
        btnAdd.click();
        MobileElement tabPengeluaran = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/btnExpense\"]");
        tabPengeluaran.click();
        MobileElement tanggal = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvDate\"]");
        tanggal.click();
        MobileElement pilihTanggal = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"17 Desember 2023\"]");
        pilihTanggal.click();
        MobileElement btnOke = (MobileElement) driver.findElementByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
        btnOke.click();
        MobileElement pilihKategori = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvName\" and @text=\"Makanan\"]");
        pilihKategori.click();
        MobileElement btnCalculator = (MobileElement) driver.findElementByXPath("//android.widget.ImageButton[@resource-id=\"com.chad.financialrecord:id/ibCalc\"]");
        btnCalculator.click();
        MobileElement angkaSatu = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/calc_btn_13\"]");
        angkaSatu.click();
        MobileElement angkaLima = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/calc_btn_22\"]");
        angkaLima.click();
        MobileElement angkaDua = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/calc_btn_23\"]");
        angkaDua.click();
        MobileElement angkaNol1 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/calc_btn_24\"]");
        angkaNol1.click();
        MobileElement angkaNol2 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/calc_btn_24\"]");
        angkaNol2.click();
        MobileElement btnOk = (MobileElement) driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.chad.financialrecord:id/calc_btn_ok\"]");
        btnOk.click();
        MobileElement btnSimpan = (MobileElement) driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.chad.financialrecord:id/btSave\"]");
        btnSimpan.click();
        MobileElement result = (MobileElement) driver.findElementById("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvAmount\"]");
        System.out.println(result.getText());
    }

    @Test
    public void testPemasukan() {
        MobileElement harian1 = (MobileElement) driver.findElementByXPath("//androidx.appcompat.app.a.c[@content-desc=\"Daily\"]");
        harian1.click();
        MobileElement btnTambah = (MobileElement) driver.findElementByXPath("//android.widget.ImageButton[@resource-id=\"com.chad.financialrecord:id/fabMenu\"]");
        btnTambah.click();
        MobileElement tabPemasukan = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/btnExpense\"]");
        tabPemasukan.click();
        MobileElement tanggall = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvDate\"]");
        tanggall.click();
        MobileElement pilihTanggall = (MobileElement) driver.findElementByXPath("//android.view.View[@content-desc=\"17 Desember 2023\"]");
        pilihTanggall.click();
        MobileElement btnOkee = (MobileElement) driver.findElementByXPath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
        btnOkee.click();
        MobileElement pilihKategorii = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvName\" and @text=\"Penjualan\"]");
        pilihKategorii.click();
        MobileElement btnCalculatorr = (MobileElement) driver.findElementByXPath("//android.widget.ImageButton[@resource-id=\"com.chad.financialrecord:id/ibCalc\"]");
        btnCalculatorr.click();
        MobileElement angkaTiga = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/calc_btn_33\"]");
        angkaTiga.click();
        MobileElement angkaEnam = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/calc_btn_32\"]");
        angkaEnam.click();
        MobileElement angkaTujuh = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/calc_btn_11\"]");
        angkaTujuh.click();
        MobileElement angkaN1 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/calc_btn_24\"]");
        angkaN1.click();
        MobileElement angkaN2 = (MobileElement) driver.findElementByXPath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/calc_btn_24\"]");
        angkaN2.click();
        MobileElement klikOk = (MobileElement) driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.chad.financialrecord:id/calc_btn_ok\"]");
        klikOk.click();
        MobileElement btnSave = (MobileElement) driver.findElementByXPath("//android.widget.Button[@resource-id=\"com.chad.financialrecord:id/btSave\"]");
        btnSave.click();


        MobileElement resultPemasukan = (MobileElement) driver.findElementById("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvAmount\" and @text=\"36.700\"]");
        System.out.println(resultPemasukan.getText());

    }
}
