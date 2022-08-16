package vidu.demo.myapplication.Model;

public class Photos {
    private int id ;
    private int image_list_photo;

    public Photos() {
    }

    public Photos(int id, int image_list_photo) {
        this.id = id;
        this.image_list_photo = image_list_photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage_list_photo() {
        return image_list_photo;
    }

    public void setImage_list_photo(int image_list_photo) {
        this.image_list_photo = image_list_photo;
    }
}
