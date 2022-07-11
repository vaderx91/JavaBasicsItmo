package JavaBasics.lesson7.lab7;

public class Plane {
    private String name;
    private Wing wing;

    public Plane(String name, Integer wingWeight) {
        this.name = name;
        this.wing = new Wing(wingWeight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wing getWing() {
        return wing;
    }

    private void setWing(Wing wing) {
        this.wing = wing;
    }


     static class Wing {
        private Integer weight;

        public Wing(Integer weight) {
            this.weight = weight;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        String printWeight() {
            return (" wing weight is: " + weight + " kg");
        }
    }

    public static void main(String[] args) {
        Plane airbus = new Plane("Airbus", 4600);
        Plane boeing = new Plane("Boeing", 3800);

        System.out.println( airbus.getName() + airbus.getWing().printWeight());
        System.out.println(boeing.getName() + boeing.getWing().printWeight());

        airbus.setWing(new Wing(5200));
        boeing.setWing(new Wing(3200));

        System.out.println( airbus.getName() + airbus.getWing().printWeight());
        System.out.println(boeing.getName() + boeing.getWing().printWeight());
    }
}