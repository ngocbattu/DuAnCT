package vidu.demo.myapplication.Model;

public class Discover {
    private int id;
    private int Image;
    private String noiDung;
    private String gioVaTen;

    public Discover() {
    }

    public Discover(int id, int image, String noiDung, String gioVaTen) {
        this.id = id;
        Image = image;
        this.noiDung = noiDung;
        this.gioVaTen = gioVaTen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getGioVaTen() {
        return gioVaTen;
    }

    public void setGioVaTen(String gioVaTen) {
        this.gioVaTen = gioVaTen;
    }
}
