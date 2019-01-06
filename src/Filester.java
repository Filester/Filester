import java.io.File;

public class Filester {
    Classifier klasifikasi;
    public static void main(String[] args) {
        Filester tes = new Filester();
        tes.setKlasifikasi(1);
        tes.setPath("data/","dst/");
        tes.runFilester();
    }

    public void setKlasifikasi(int pilihan) {
        if(pilihan==1){
            this.klasifikasi = new Extension();
        }
        else if (pilihan==2){
            this.klasifikasi = new Year();
        }
        else if(pilihan==3){
            this.klasifikasi = new Month();
        }
        else if(pilihan==4){
            this.klasifikasi = new Alfabet();
        }
        else{
            System.out.println("error pilihan :"+ pilihan +"\n 1 : extension \n 2 : year \n 3 : month \n 4 : alfabet ");
        }

    }

    public void setPath(String pathsSrc,String pathDst){
        if(klasifikasi==null) {
            return;
        }
        if(pathsSrc.compareToIgnoreCase(pathDst)==0){
            System.out.println("error src == dst");
            System.out.println("src : "+pathsSrc);
            System.out.println("dst : "+pathDst);
            return;
        }
        File fileSrc = new File(pathsSrc);
        File fileDst = new File(pathDst);

        if(fileSrc.isDirectory() && fileDst.isDirectory()){

            if(fileSrc.list().length==0 ){

                System.out.println("src : Directory is empty!");
                return;
            }
            if(fileDst.list().length!=0 ){
                System.out.println("dst : Directory is not empty!");
                return;
            }

        }
        System.out.println("add src directory");
        System.out.println("add dst directory");
        this.klasifikasi.setPathSrc(pathsSrc);
        this.klasifikasi.setPathDst(pathDst);
    }

    public void runFilester(){
        if(this.klasifikasi!=null && this.klasifikasi.getPathSrc()!=null && this.klasifikasi.getPathDst()!=null){
            this.klasifikasi.setData();
            this.klasifikasi.writeData();
        }else{
            System.out.println("ikuti prosedure");
        }
    }
}
