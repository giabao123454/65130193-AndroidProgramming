package till.edu.baith8_tuychinhlv;

public class MonAn {
    private String tenMon;
    private double donGia;
    private String moTa;
    private int idAnhMinhHoa;

    public MonAn(String tenMon, double donGia, String moTa, int idAnhMinhHoa) {
        this.tenMon = tenMon;
        this.donGia = donGia;
        this.moTa = moTa;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }

    public String getTenMon() { return tenMon; }
    public double getDonGia() { return donGia; }
    public String getMoTa() { return moTa; }
    public int getIdAnhMinhHoa() { return idAnhMinhHoa; }
}