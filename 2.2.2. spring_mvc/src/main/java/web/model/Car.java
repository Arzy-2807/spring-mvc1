package web.model;

public class Car {
    private int productionYear;
    private int series;
    private String model;

    public Car(int productionYear, int series, String model) {
        this.productionYear = productionYear;
        this.series = series;
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear=" + productionYear +
                ", series=" + series +
                ", model='" + model + '\'' +
                '}';
    }
}
