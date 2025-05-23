package dev.danvega.hellohtmx._05;

import java.util.ArrayList;


    public enum Unit {
        GRAMS("Grams", "G"),
        ITEM("Item", "ITEM"),
        MILLILITRES("Millilitres", "ML"),
        LITRES("Litres", "L"),
        CUP("Cup", "CUP"),
        TEASPOON("Tea Spoon", "TSP"),
        DESSERT_SPOON("Dessert Spoon", "DSP"),
        NONE("None", " ");

        private final String displayName;
        private final String abbreviation;

        Unit(String displayName, String abbreviation) {
            this.displayName = displayName;
            this.abbreviation = abbreviation;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String abbreviation()throws Exception {
            try {
                return this.abbreviation;
            }catch (Exception e){
                throw new Exception("Invalid Unit");
            }

        }

        public static ArrayList<Unit> getAllUnits() {
            ArrayList<Unit> units = new ArrayList<Unit>();
            for (Unit unit : Unit.values()) {
                units.add(unit);
            }
            return units;
        }

        public static Unit getUnit(String abbreviation) throws Exception {
            for (Unit unit : Unit.values()) {
                if (unit.abbreviation().equals(abbreviation)) {
                    return unit;
                }
            }
            return null;
        }
    }


