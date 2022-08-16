package vidu.demo.myapplication.Model;

public class IconProfile {
    private int id;
    private int imageProflie ;
    private String tenProflie;

    public IconProfile() {
    }

    public IconProfile(int id, int imageProflie, String tenProflie) {
        this.id = id;
        this.imageProflie = imageProflie;
        this.tenProflie = tenProflie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImageProflie() {
        return imageProflie;
    }

    public void setImageProflie(int imageProflie) {
        this.imageProflie = imageProflie;
    }

    public String getTenProflie() {
        return tenProflie;
    }

    public void setTenProflie(String tenProflie) {
        this.tenProflie = tenProflie;
    }
}
