package duyydang.ldd.listviewup;

public class TraiCay {
    private String Ten;
    private String moTa;
    private int hinhAnh;

    public TraiCay(String ten, String moTa, int hinhAnh) {
        Ten = ten;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
