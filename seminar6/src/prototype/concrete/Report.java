package prototype.concrete;

public interface Report extends Cloneable{
    void setData(String data);
    void setFormat(String format);
    void generateReport();
    Report clone() throws CloneNotSupportedException;
}
