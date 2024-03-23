public class Shoes {

    String reference = "";
    float price = 0;
    int size = 0;
    String photo_route = "";
    boolean send_method = false;
    int cant_colours = 0;

    public Shoes(String reference_param, float price_param, int size_param, String photo_route_param,
            boolean send_method_param, int cant_colours_param) {
        this.reference = reference_param;
        this.price = price_param;
        this.size = size_param;
        this.photo_route = photo_route_param;
        this.send_method = send_method_param;
        this.cant_colours = cant_colours_param;
    }

    public String getReference() {
        return reference;
    }

    public float getPrice() {

        return price;
    }

    public int getsize() {
        return size;
    }

    public String getphoto_route() {
        return photo_route;
    }

    public boolean isSend_method() {
        return send_method;
    }

    public int getcant_colours() {
        return cant_colours;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPhoto_route(String photo_route) {
        this.photo_route = photo_route;
    }

    public void setSend_method(boolean send_method) {
        this.send_method = send_method;
    }

    public void setCant_colours(int cant_colours) {
        this.cant_colours = cant_colours;
    }
}