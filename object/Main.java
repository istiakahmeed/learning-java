public class Main {

  /**
   * InnerMain
   */
  public class Car {

    String name;
    String model;
    double year;

    Car(String name, String model) {
      this.name = name;
      this.model = model;
    }

    void running() {
      System.out.println(this.name + " is running");
    }
  }

  public static void main(String[] args) {
    // Car myCar = new Car();
    // System.out.println(myCar.make);
    // System.out.println(myCar.model);
    // System.out.println(myCar.year);
    // myCar.drive();
    // myCar.breaks();

    // constructor method used

    // Human human = new Human("Minal", 22, 70);
    // Human human2 = new Human("Mubin", 18, 80);
    // human.eat();
    // human2.drink();

  }
}
