package ly.basetest.ClassCast;

/**
 * 父类Animal
 */
class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
}

/**
 * 子类cat继承Animal
 */
class Cat extends Animal {
    public String eyeColoer;

    public Cat(String name, String e) {
        super(name);
        this.eyeColoer = e;
    }
}

/**
 * 子类Dog继承Animal
 */
class Dog extends Animal {
    public String furColoer;

    public Dog(String name, String c) {
        super(name);
        this.furColoer = c;
    }
}

public class TestClassCast {
    public static void main(String[] args) {
        Animal a = new Animal("name");
        Cat c = new Cat("name", "black");
        Dog d = new Dog("name", "yellow");
        System.out.println(String.format("a instanceof animal", a instanceof Animal));
        System.out.println(String.format("c instanceof animal", c instanceof Animal));
        System.out.println(String.format("d instanceof animal", d instanceof Animal));

        /**
         * 这里判断说“动物是一只猫”，不符合逻辑，所以打印出来的结果是false。
         */
        System.out.println(String.format("a instanceof Cat的结果是%s", a instanceof Cat));
        /**
         * 这句话比较有意思了，a本身是Animal类的实例对象的引用，
         * 但现在这个引用不指向Animal类的实例对象了，而是指向了Dog这个类的一个实例对象了，
         * 这里也就是父类对象的引用指向了子类的一个实例对象。
         */
        a = new Dog("bigyellow", "yellow");
        System.out.println(a.name);//bigyellow
        /**
         * 这里的furColor属性是子类在继承父类的基础上新增加的一个属性，是父类没有的。
         * 因此这里使用父类的引用对象a去访问子类对象里面新增加的成员变量是不允许的，
         * 因为在编译器眼里，你a就是Animal类对象的一个引用对象，你只能去访问Animal类对象里面所具有的name属性，
         * 除了Animal类里面的属性可以访问以外，其它类里面的成员变量a都没办法访问。
         * 这里furColor属性是Dog类里面的属性，因此你一个Animal类的引用是无法去访问Dog类里面的成员变量的，
         * 尽管你a指向的是子类Dog的一个实例对象，但因为子类Dog从父类Animal继承下来，
         * 所以new出一个子类对象的时候，这个子类对象里面会包含有一个父类对象，
         * 因此这个a指向的正是这个子类对象里面的父类对象，因此尽管a是指向Dog类对象的一个引用，
         * 但是在编译器眼里你a就是只是一个Animal类的引用对象，你a就是只能访问Animal类里面所具有的成员变量，
         * 别的你都访问不了。
         * 因此一个父类(基类)对象的引用是不可以访问其子类对象新增加的成员(属性和方法)的。
         */
        //System.out.println(a.furColor);
        System.out.println(String.format("a指向了Dog，a instanceof Animal的结果是%s", a instanceof Animal));//true
        /**
         * 这里判断说“a是一只Dog”是true。
         * 因为instanceof探索的是实际当中你整个对象到底是什么东西，
         * 并不是根据你的引用把对象看出什么样来判断的。
         */
        System.out.println(String.format("a instanceof Dog的结果是%s", a instanceof Dog));//true
        /**
         * 这里使用强制转换，把指向Animal类的引用对象a转型成指向Dog类对象的引用，
         * 这样转型后的引用对象d就可以直接访问Dog类对象里面的新增的成员了。
         */
        Dog d1 = (Dog) a;
        System.out.println(d1.furColoer);//yellow
    }

}
