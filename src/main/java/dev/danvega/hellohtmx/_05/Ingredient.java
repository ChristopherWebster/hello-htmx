package dev.danvega.hellohtmx._05;

public class Ingredient {
    private String name;
    private String quantity;
    private String unit;

    public Ingredient(String name, String quantity, String unit) {
        try {
            this.name = name;
            this.quantity = quantity;
            this.unit = Unit.getUnit(unit).abbreviation();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unitAbreviation) {
        this.unit = unitAbreviation;
    }
}
