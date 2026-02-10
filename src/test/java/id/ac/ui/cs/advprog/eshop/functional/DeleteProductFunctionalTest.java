package id.ac.ui.cs.advprog.eshop.functional;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DeleteProductFunctionalTest extends BaseFunctionalTest {

    @Test
    void deleteProduct_isCorrect(ChromeDriver driver) throws Exception {
        driver.get(baseUrl + "/product/list");
        driver.findElement(By.partialLinkText("Create Product")).click();

        driver.findElement(By.id("nameInput")).sendKeys("Produk Dihapus");
        driver.findElement(By.id("quantityInput")).sendKeys("5");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        assertTrue(driver.getPageSource().contains("Produk Dihapus"));

        driver.findElement(By.xpath("//tr[td[contains(text(), 'Produk Dihapus')]]//a[contains(@class, 'btn-danger')]")).click();

        String pageSource = driver.getPageSource();
        assertFalse(pageSource.contains("Produk Dihapus"), "Produk sudah terhapus");
    }
}