package org.hanamant.dsalgo.stack;

public class StackApplication {
    public static void main(String[] args) {
        Stack<Bicycle> stack = new Stack<Bicycle>();
        stack.pushStack(new Bicycle(1,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(2,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(3,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(4,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(5,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(6,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(7,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(8,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(9,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(10,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(11,"Hercules", "Contour", "Orange"));
        stack.pushStack(new Bicycle(12,"Hercules", "Contour", "Orange"));
        System.out.println("Peek at stack->" + stack.peek());
        stack.displayStack();
    }
}

class Bicycle {
    private int id;
    private String make;
    private String model;
    private String color;

    public Bicycle() {

    }

    public Bicycle(int id, String make, String model, String color) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bicycle bicycle = (Bicycle) o;
        return getId() == bicycle.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
