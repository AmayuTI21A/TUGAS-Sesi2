public class Handphone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis_hp, int tahun_pembuatan){//pwngguanaan String diganti dengan Public void
        this.jenis_hp = jenis_hp;//menggunakan this
        this.tahun_pembuatan = tahun_pembuatan;//menggunakan this
        
    }
    
    public String getJenisHp(){//String diganti dengan public String
        return jenis_hp;//ditambahkan return
    }
    
    public int getTahunPembuatan(){//String di ganti dengan int
        return tahun_pembuatan;//ditambahkan return 
    }
    
    
    public static void main(String[] args) {//public static main vooid diganti dengan public static void main
        Handphone hp = new Handphone();
        
        hp.setDataHP("Poco X3 NFC", 2020);
        
        System.out.println(hp.getJenisHp());//ditambahkan Sout
        System.out.println(hp.getTahunPembuatan());//Ditambahkan Sout
        
        
    }
}