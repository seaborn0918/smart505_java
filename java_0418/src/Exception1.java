public class Exception1 {
  public static void main(String[] args) {
    // NullPointException 예외 발생
    // String data = null;
    // System.out.println(data.toString());


    // ArrayIndexOutOfBoundsException 예외 발생
    // int[] arrNum = new int[]{10, 20, 30};
    // for (int i = 0; i < 5; i++) {
    //   System.out.println(arrNum[i]);
    // }

    Dog dog = new Dog();
    changeDog(dog);

    Cat cat = new Cat();
    changeDog(cat);

  }

  public static void changeDog(Animal animal) {
    Dog dog = (Dog) animal;
  }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
