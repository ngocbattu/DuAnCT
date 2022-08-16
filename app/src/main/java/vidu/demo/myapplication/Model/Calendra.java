package vidu.demo.myapplication.Model;

public class Calendra {
    private int id;
    private int so_ngay;
    private String Thang ;
    private String NgayGio;
    private String NoiDungCV;

    public Calendra() {
    }

    public Calendra(int id, int so_ngay, String thang, String ngayGio, String noiDungCV) {
        this.id = id;
        this.so_ngay = so_ngay;
        Thang = thang;
        NgayGio = ngayGio;
        NoiDungCV = noiDungCV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSo_ngay() {
        return so_ngay;
    }

    public void setSo_ngay(int so_ngay) {
        this.so_ngay = so_ngay;
    }

    public String getThang() {
        return Thang;
    }

    public void setThang(String thang) {
        Thang = thang;
    }

    public String getNgayGio() {
        return NgayGio;
    }

    public void setNgayGio(String ngayGio) {
        NgayGio = ngayGio;
    }

    public String getNoiDungCV() {
        return NoiDungCV;
    }

    public void setNoiDungCV(String noiDungCV) {
        NoiDungCV = noiDungCV;
    }
}
