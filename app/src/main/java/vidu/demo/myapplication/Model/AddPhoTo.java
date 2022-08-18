package vidu.demo.myapplication.Model;

public class AddPhoTo {
    private int id;
    private int image_add_photo;

    public AddPhoTo() {
    }

    public AddPhoTo(int id, int image_add_photo) {
        this.id = id;
        this.image_add_photo = image_add_photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage_add_photo() {
        return image_add_photo;
    }

    public void setImage_add_photo(int image_add_photo) {
        this.image_add_photo = image_add_photo;
    }
}
