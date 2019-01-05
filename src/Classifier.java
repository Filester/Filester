import java.util.HashMap;

public abstract class Classifier {
    private HashMap data;
    private String pathSrc;
    private String pathDst;

    public abstract void setData();
    public abstract void writeData();

    public void display(String stat ,String key,String fileName){
        System.out.println(stat+" "+key+" "+fileName);
    }

    public void setPathSrc(String pathSrc){
        System.out.println("path src set : "+pathSrc);
        this.pathSrc=pathSrc;
    }
    public void setPathDst(String pathDst){
        System.out.println("path dst set : "+pathDst);
        this.pathDst=pathDst;
    }

    public String getPathDst() {
        return pathDst;
    }

    public String getPathSrc() {
        return pathSrc;
    }
}
