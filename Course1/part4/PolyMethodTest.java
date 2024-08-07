package Course1.part4;

import Course1.model.Animal;
import Course1.model.Cat;
import Course1.model.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d=new Dog();
        display(d);
        Cat c=new Cat();
        display(c);
    }

    private static void display(Animal ani) {// 1.다형성인수
        ani.eat();
        // Cat타입으로 받은 경우에만 실행 -> if
    if (ani instanceof Cat) {
        ((Cat)ani).night();
        }
    }



}
