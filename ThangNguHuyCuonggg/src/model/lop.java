package model;

/**
 *
 * @author minhius23
 */
public class lop {
    private String Malop;
    private String Tenlop;
     public lop(){
         super();
     }
    public  lop(String Malop , String Tenlop){
        super();
        this.Malop = Malop;
        this.Tenlop = Tenlop;
    }
    public void setMalop(String Malop){
        this.Malop = Malop;
    }
    public void setTenlop(String Tenlop){
        this.Tenlop = Tenlop;
    }
    public String getTenlop(){
        return Tenlop;
    }
    public String getMalop(){
        return Malop;
    }
    
}
