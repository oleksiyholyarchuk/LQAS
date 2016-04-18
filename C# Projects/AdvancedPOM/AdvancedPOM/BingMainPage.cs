using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdvancedPOM
{
    public class BingMainPage : BasePage<BingMainPageElementMap, BingMainPageValidator>
    {
        public BingMainPage()
            : base(@"http://www.bing.com/")
        {
        }

        public void Search(string textToType)
        {
            this.Map.SearchBox.Clear();
            this.Map.SearchBox.SendKeys(textToType);
            this.Map.GoButton.Click();
        }
    }
}