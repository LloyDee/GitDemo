package testing;

import javax.swing.text.html.parser.TagElement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import onepiecemanga.Base;
import tagelements.TagElements;

public class Testing {
	Base base = new Base();
	TagElements tags = new TagElements();

	@BeforeMethod
	public void openBrowser() {
		base.openBrowser("https://kissmanga.com/");
	}

	@Test
	public void goToOnepiece() {
		base.sendKeys(tags.searchBar, "one piece");
	}
}
