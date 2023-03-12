package BaiTap5QuanLyXeTest;

// Class con XeOToTai
public class XeOToTai extends Xe {
    private double giaTri;

    public XeOToTai(String tenChuXe, String bienSo, double giaTri) {
        super(tenChuXe, bienSo);
        this.giaTri = giaTri;
    }

    @Override
    public double tinhThue() {
        double thueVAT = giaTri * 0.1;
        double thueTruocBa = giaTri * 0.02;
        return thueVAT + thueTruocBa;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }
}
