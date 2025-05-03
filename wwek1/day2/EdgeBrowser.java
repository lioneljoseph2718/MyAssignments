package wwek1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
		Browser browser = new Browser();
		String launchedBrowser = browser.launchBrowser("Edge");
		System.out.println("Launched Browser Is: " + launchedBrowser);
		browser.loadUrl();
	}

}
