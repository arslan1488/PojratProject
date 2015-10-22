package ru.room108.dmitry.uskov.pojrat.databace;

/**
 * Created by Dmitry on 22.10.2015.
 */
public class EnergyValue {

    private double nutritionalValue;

    private double protein;

    private double fats;

    private double carbohydrates;

    public EnergyValue(double nutritionalValue, double protein, double fats, double carbohydrates) {
        this.nutritionalValue = nutritionalValue;
        this.protein = protein;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public EnergyValue(){
        this(-1, -1, -1, -1);
    }

    public double getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(double nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
}
