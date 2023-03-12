package BaiTap5QuanLyXeTest;

// Class cha Xe
public abstract class Xe {
    protected String tenChuXe;
    protected String bienSo;

    public Xe(String tenChuXe, String bienSo) {
        this.tenChuXe = tenChuXe;
        this.bienSo = bienSo;
    }

    public abstract double tinhThue();

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }
}

