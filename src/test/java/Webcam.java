public class Webcam {
    //--------------------------ATTRIBUTES------------------------------------------------------
    private int buttonQuantity;
    private String type;
    private String color;
    private double totalPrice;
    private String firm;

    //---------------------------GETTERS/SETTERS-------------------------------------------------

    public int getButtonQuantity() {
        return buttonQuantity;
    }

    public void setButtonQuantity(int buttonQuantity) {
        this.buttonQuantity = buttonQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }
}
