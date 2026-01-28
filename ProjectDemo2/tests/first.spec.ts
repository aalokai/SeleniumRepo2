

import {test, expect, Browser, Page, Locator} from '@playwright/test';
import {webkit, chromium, firefox} from 'playwright';
 
test('sample test', async () => {
const browser:Browser = await chromium.launch({headless: false});
const page:Page = await browser.newPage();
await page.goto("https://www.rediff.com/");
 
await page.getByText("Create Account").click();
await expect(page).toHaveTitle('Rediffmail Free Unlimited Storage');
 
await page.locator("//input[@placeholder='Enter your full name']").fill("Venkatesh");
await page.locator("//input[@placeholder='Enter Rediffmail ID']").fill("vivek7983");
await page.locator("//input[@value='Check availability']").click();
await page.locator("//span[@class='success']").waitFor();
const message: Locator = await page.locator("//span[@class='success']");
await expect(message).toContainText("ID you've chosen is available");
// await browser.close();
});