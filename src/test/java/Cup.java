public class Cup {
    //--------------------------ATTRIBUTES------------------------------------------------------
    private double weight;
    private String material;
    private String content;
    private double capacity;
    private boolean isLiquidInside;

    //---------------------------GETTERS/SETTERS-------------------------------------------------

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isLiquidInside() {
        return isLiquidInside;
    }

    public void setLiquidInside(boolean liquidInside) {
        isLiquidInside = liquidInside;
    }
}
