import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Classifier {
    HashMap<String, ArrayList<File>> data;
    String pathSrc;
    String pathDst;

    public void setData() {
        System.out.println(this+" set data");

        this.data= new HashMap<>();
        List<File> files = new ArrayList<>();
        this.listf(this.getPathSrc(),files);

        //file.forEach(fileName -> System.out.println("\t "+fileName.getAbsolutePath()));
        for (File file : files) {
            if(this.getInfo(file).compareToIgnoreCase("")==0)
                continue;
            ArrayList<File> alternateList = data.get(this.getInfo(file));
            if(alternateList == null) {
                alternateList = new ArrayList<>();
                data.put(this.getInfo(file), alternateList);
            }
            alternateList.add(file);

        }
        System.out.println(data);
    }
    public void writeData() {
        File directory = new File(pathDst);

        System.out.println("Extension : write data");
        System.out.println(directory.getAbsoluteFile());

        for (Map.Entry<String, ArrayList<File>> dataFile:data.entrySet()) {
            System.out.println("\t"+dataFile.getKey());
            for (File file:dataFile.getValue()) {
                System.out.println("\t\t"+file.getAbsolutePath());
                System.out.println("\t\t"+directory.getAbsoluteFile()+"/"+dataFile.getKey()+"/"+file.getName());
                System.out.println();
            }
        }
    }

    public void display(String stat ,String key,String fileName){
        // stat read or write
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

    public void listf(String directoryName, List<File> files) {
        File directory = new File(directoryName);

        // Get all files from a directory.
        File[] fList = directory.listFiles();
        if (fList != null){
            for (File file : fList) {
                if (file.isFile()) {
                    files.add(file.getAbsoluteFile());
                } else if (file.isDirectory()) {
                    listf(file.getAbsolutePath(), files);
                }
            }
        }
    }
    public String getPathSrc() {
        return pathSrc;
    }

    public String getPathDst() {
        return pathDst;
    }

    public abstract String getInfo(File file);

}
