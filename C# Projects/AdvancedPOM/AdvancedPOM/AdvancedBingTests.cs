using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Threading;

namespace AdvancedPOM
{
    [TestClass]
    public class AdvancedBingTests
    {
        [TestInitialize]
        public void SetupTest()
        {
            Driver.StartBrowser();
        }

        [TestCleanup]
        public void TeardownTest()
        {
            Driver.StopBrowser();
        }

        [TestMethod]
        public void SearchTextInBing_Advanced_PageObjectPattern()
        {
            BingMainPage bingMainPage = new BingMainPage();
            bingMainPage.Navigate();
            bingMainPage.Search("автоматизоване тестування");
            bingMainPage.Validate().ResultsCount("7,350 РЕЗУЛЬТАТИ");
        }
    }
}