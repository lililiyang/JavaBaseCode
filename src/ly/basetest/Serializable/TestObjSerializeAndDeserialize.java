package ly.basetest.Serializable;

import java.io.*;

/**
 * Description: 测试对象的序列化和反序列
 * @author liyang
 */
public class TestObjSerializeAndDeserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serializablePerson();
        Person person = DeserializePerson();
        System.out.println(person.toString());
    }

    private static void serializablePerson() throws IOException {
        Person person = new Person();
        person.setAge(22);
        person.setName("笑话");
        person.setSex("男");

        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("D:\\person.txt")));
        oo.writeObject(person);
        System.out.println("person 序列化成功");
        oo.close();
    }

    public static Person DeserializePerson() throws IOException, ClassNotFoundException {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("D:\\person.txt")));
        Person person = (Person) oi.readObject();
        System.out.println("对象反序列化成功");
        return person;
    }
}
