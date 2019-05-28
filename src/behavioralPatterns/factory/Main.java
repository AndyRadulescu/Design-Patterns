package behavioralPatterns.factoryPattern;

public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        dialog.renderWindow();
    }

    private static void configure() {
        String osName = System.getProperty("os.name");
        System.out.println("OS name: " + osName);
        if (osName.equals("Windows 10") || osName.equals("Mac OS X")) {
            dialog = new WindowsDialog(osName);
        } else {
            dialog = new HtmlDialog();
        }
    }
}
