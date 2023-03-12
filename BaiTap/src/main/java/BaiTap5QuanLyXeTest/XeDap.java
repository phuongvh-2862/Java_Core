package BaiTap5QuanLyXeTest;

// Class con XeDap
public class XeDap extends Xe {
    private double giaTri;

    public XeDap(String tenChuXe, String bienSo, double giaTri) {
        super(tenChuXe, bienSo);
        this.giaTri = giaTri;
    }

    @Override
    public double tinhThue() {
        return 0; // không đóng thuế
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }
}
