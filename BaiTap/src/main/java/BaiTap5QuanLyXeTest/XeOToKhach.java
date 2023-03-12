package BaiTap5QuanLyXeTest;

// Class con XeOToKhach
public class XeOToKhach extends Xe {
    private int soChoNgoi;
    private double giaTri;

    public XeOToKhach(String tenChuXe, String bienSo, int soChoNgoi, double giaTri) {
        super(tenChuXe, bienSo);
        this.soChoNgoi = soChoNgoi;
        this.giaTri = giaTri;
    }

    @Override
    public double tinhThue() {
        double thueVAT = giaTri * 0.1;
        double thueTruocBa = giaTri * 0.2;
        double thueTieuThu = soChoNgoi >= 5 ? giaTri * 0.3 : giaTri * 0.5;
        return thueVAT + thueTruocBa + thueTieuThu;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }
}
