package BaiTap5QuanLyXeTest;

// Class con XeMay
public class XeMay extends Xe {
    private double giaTri;

    public XeMay(String tenChuXe, String bienSo, double giaTri) {
        super(tenChuXe, bienSo);
        this.giaTri = giaTri;
    }

    @Override
    public double tinhThue() {
        double thueVAT = giaTri * 0.1;
        double thueTruocBa = giaTri * 0.05;
        return thueVAT + thueTruocBa;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }
}
