import java.util.HashMap;

public abstract class Classifier {
    private HashMap data;
    private String pathSrc;
    private String pathDst;

    public abstract void setData();
    public abstract void writeData();
    public abstract void display();
    public abstract void setPathSrc(String pathSrc);
    public abstract void setPathDst(String pathDst);

    public String getPathDst() {
        return pathDst;
    }

    public String getPathSrc() {
        return pathSrc;
    }
}
