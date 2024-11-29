package Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("chrome is launched");
		VerifyRam();
		checkBrowserUpdates();
		verifyPolicyUpdates();
		verifyStorage();
	}
	private void VerifyRam() {
		System.out.println("verify the ram");
	}
	private void checkBrowserUpdates() {
		System.out.println("check the browser");
	}
	private void verifyStorage() {
		System.out.println("verify the storage");
	}
	private void verifyPolicyUpdates() {
		System.out.println("verify the policy");
	}
}
