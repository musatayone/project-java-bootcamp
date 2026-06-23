package dz19;

public class Monkey implements Climbable, Eatable {
    private Climbable passenger;
    private String name;

    @Override
    public void climb() {
        System.out.println(name + " карабкается");
    }

    @Override
    public void eatFruit(String fruit) {
        System.out.println(name + " ест " + fruit);
    }

    public void carry(Climbable passenger) {
        this.passenger = passenger;
        System.out.println(name + " несет на спине " + passenger.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Climbable getPassenger() {
        return passenger;
    }

    public void setPassenger(Climbable passenger) {
        this.passenger = passenger;
    }
}
