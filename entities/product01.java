package entities;

public class product01 {
    
    private  String name;
    private double price;

    public product01(String name, double price){

        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName( String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(){
        this.price = price;
    }
}
