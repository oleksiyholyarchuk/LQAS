using System;
using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.Support.UI;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace SeleniumExample
{
    [TestClass]
    public class UnitTest1
    {
        FirefoxDriver firefox;

        // это тест.
        [TestMethod]
        public void TestMethod1()
        {
            firefox = new FirefoxDriver();
            firefox.Navigate().GoToUrl("https://github.com/login");
            firefox.FindElement(By.Id("login_field")).SendKeys("oleksiyholyarchuk");
            firefox.FindElement(By.Id("password")).SendKeys("********");
            firefox.FindElement(By.Name("commit")).Click();
        }

        // разрушение объекта драйвера после окончание теста.
        [TestCleanup]
        public void TearDown()
        {
            firefox.Quit();
        }
    }
}