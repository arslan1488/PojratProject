package ru.room108.dmitry.uskov.pojrat;


//Item.Builder().setXXX().setXXX().create;

public class Item {

    private int id;

    private String name;

    private String categiry;

    private int imageId;

    private double price;

    private EnergyValue mEnergyValue;

    public Item(int id, String name, String categiry, int imageId, double price, EnergyValue mEnergyValue) {
        this.id = id;
        this.name = name;
        this.categiry = categiry;
        this.imageId = imageId;
        this.price = price;
        this.mEnergyValue = mEnergyValue;
    }

    public static class Builder{

        private final static String DEFAULT_STRING="-";

        private int id;

        private String name;

        private String categiry;

        private int imageId;

        private double price;

        private EnergyValue mEnergyValue;

        public Builder(){
            id=-1;
            name = DEFAULT_STRING;
            categiry= DEFAULT_STRING;
            imageId = -1;
            price = -1;
            mEnergyValue = new EnergyValue();
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCategiry(String categiry) {
            this.categiry = categiry;
            return this;
        }

        public Builder setImageId(int imageId) {
            this.imageId = imageId;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setEnergyValue(EnergyValue mEnergyValue) {
            this.mEnergyValue = mEnergyValue;
            return this;
        }

        public Builder setNutritionalValue(double nutritionalValue) {
            this.mEnergyValue.setNutritionalValue(nutritionalValue);
            return this;
        }

        public Builder setCarbohydrates(double carbohydrates) {
            this.mEnergyValue.setCarbohydrates(carbohydrates);
            return this;
        }

        public Builder setFats(double fats) {
            this.mEnergyValue.setFats(fats);
            return this;
        }

        public Builder setProtein(double protein) {
            this.mEnergyValue.setProtein(protein);
            return this;
        }

        public Item build() {
            return new Item( id, name, categiry, imageId, price, mEnergyValue);
        }

    }


}
