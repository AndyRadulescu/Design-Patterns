package structuralPatterns.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
