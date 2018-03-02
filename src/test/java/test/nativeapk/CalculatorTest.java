package test.nativeapk;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorTest extends NativeApkBaseTest {
	
	
 	
	@Test
    public void calculatorTest() {
        WebElement two=driver.findElement(By.xpath("//android.widget.Button[@text='2']"));
        two.click();
        WebElement plus=driver.findElement(By.xpath("//android.widget.Button[@text='+']"));
        plus.click();
        WebElement four=driver.findElement(By.xpath("//android.widget.Button[@text='4']"));
        four.click();
        WebElement equalTo=driver.findElement(By.xpath("//android.widget.Button[@text='=']"));
        equalTo.click();   
        WebElement result=driver.findElement(By.id("result"));
        assertEquals(result.getText(), "6");
	}
    
	

	
}
