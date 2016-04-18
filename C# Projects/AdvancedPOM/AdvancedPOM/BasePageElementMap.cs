using OpenQA.Selenium;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdvancedPOM
{
    public class BasePageElementMap
    {
        protected IWebDriver browser;

        public BasePageElementMap()
        {
            this.browser = Driver.Browser;
        }
    }
}