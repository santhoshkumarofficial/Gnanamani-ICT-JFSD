package oop;

import java.util.Arrays;

import oop.MyPlants.Nursary;

public class InnerClasses {
    public static void main(String[] args) {
        // System.out.println(Warehouse.boxes.length);
        // Warehouse.ViewHouse.show();
        // Warehouse.ViewHouse house = new Warehouse.ViewHouse();
        // house.show();
        // MyPlants myPlants = new MyPlants();
        // // System.out.println(myPlants.plants.length);
        // Nursary nursary = myPlants.new Nursary();
        // nursary.viewEvery();
        // Migrate migrate = new Migrate();
        // migrate.sqlToNoSQL();
        // Bus bus = new Bus();
        // bus.all();
        // bus.minimum(500);
        // anonymous
        new Bus().minimum(300);
    }
}

class Bus{
    private int[] fareCost = {200,500,1200,150,590,299};
    public void all(){
        System.out.println(Arrays.toString(fareCost));
    }
    public void minimum(int budget){
        for(int each:fareCost){
            if(each<=budget)
                System.out.println(each);
        }
    }
}

class Migrate{
    public void sqlToNoSQL(){
        String sql = "PostgreSQL";
        class Document{
            public void databases(){
                System.out.println("Fire Store, MongoDB");
            }
        }
        // System.out.println(sql);
        Document document = new Document();
        // document.databases();
    }
}

class MyPlants{
    private String[] plants = {"tomato","garlic","ginger"};
    class Nursary{
        public void viewEvery(){
            System.out.println(Arrays.toString(plants));
        }
    }
}

class Warehouse{
    private static String[] boxes = {"nike","adidas","puma","levis"};
    static class ViewHouse{
        // public static void show(){
        public void show(){
            System.out.println(Arrays.toString(boxes));
        }
    }
}

