import java.util.Stack;

class BrowserNavigationSys {
    private Stack<String> backHistory;
    private Stack<String> forwardHistory;
    private String currentPage;

    public BrowserNavigationSys() {
        backHistory = new Stack<>();
        forwardHistory = new Stack<>();
        currentPage = "Home";
    }

    public void navigateTo(String url) {
        if (currentPage != null) {
            backHistory.push(currentPage);
        }
        currentPage = url;
        forwardHistory.clear();
    }

    public void goBack() {
        if (!backHistory.isEmpty()) {
            forwardHistory.push(currentPage);
            currentPage = backHistory.pop();
        }
    }

    public void goForward() {
        if (!forwardHistory.isEmpty()) {
            backHistory.push(currentPage);
            currentPage = forwardHistory.pop();
        }
    }

    public void showCurrentPage() {
        System.out.print(currentPage + " ");
    }

    public static void main(String[] args) {
        BrowserNavigationSys browser = new BrowserNavigationSys();

        browser.navigateTo("home.html");
        browser.navigateTo("about.html");
        browser.navigateTo("contact.html");
        browser.showCurrentPage();

        browser.goBack();
        browser.showCurrentPage();

        browser.goBack();
        browser.showCurrentPage();

        browser.goForward();
        browser.showCurrentPage();

        browser.navigateTo("services.html");
        browser.showCurrentPage();
    }
} 