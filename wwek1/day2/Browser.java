package wwek1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println("Browser Launched Successfully");
		return browserName;
	}
	
	public void loadUrl() {
		System.out.println("Application Launched Successfully");
	}
	public static void main(String[] args) {
		Browser br = new Browser();
		String launchedBrowser = br.launchBrowser("Chrome");
		System.out.println("Launched Browser Is: " + launchedBrowser);
		br.loadUrl();
	}
	

}
