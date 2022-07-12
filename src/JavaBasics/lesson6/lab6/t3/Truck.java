package JavaBasics.lesson6.lab6.t3;

public class Truck extends Car{
    protected int wheelCount;
    protected int maxWeight;



    public Truck(int w, String m, char c, float s, int wheelCount, int maxWeight) {
        super(w, m, c, s);
        this.wheelCount = wheelCount;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int wheelCount) {
        this.wheelCount = wheelCount;
        System.out.println("Количество колес: " + wheelCount);
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Максимальный вес: " + maxWeight + " тонн, количество колес: " + wheelCount);
    }

    public static void main (String[] args){
        Truck truck = new Truck(7000, "КамАЗ",'K', 150f, 18, 12000);

        truck.outPut();
    }

}
