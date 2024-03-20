package patronDecorator;

public interface DataSource {
    void writeData(String data);
    String readData();
}
