package BaseProjectAction;

 class Ex2 {

    String color;
    protected int number;
    public String car;
    private int age;

    public Ex2(String color, int number, String car, int age) {
        this.color = color;
        this.number = number;
        this.car = car;
        this.age = age;
    }
    private void displayColor () {
        System.out.printf("Color is \n", color);
    }
    void displayNumber () {
        System.out.printf("Number is \n", number);
    }
    protected void displayCar () {
        System.out.printf("Car is \n", car);
    }
    public void displayAge () {
        System.out.printf("Age is \n", age);
    }

}
