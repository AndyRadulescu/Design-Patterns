package creationalPatterns.factory;

public class WindowsDialog extends Dialog {
    private String titleText;

    WindowsDialog(String titleText) {
        this.titleText = titleText;
    }

    @Override
    public Button createButton() {
        return new WindowsButton(this.titleText);
    }
}
