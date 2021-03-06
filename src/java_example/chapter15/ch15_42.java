package java_example.chapter15;

import java.io.*;

public class ch15_42 extends SuperUserInfo implements java.io.Serializable{
    int age;

    public ch15_42() {
        this("Unknown", "1111", 0);
    }

    public ch15_42(String name, String password, int age) {
        super(name, password);
        this.age = age;
    }

    public String toString() {
        return "("+ name + "," + password + "," + age + ")";
    }

    private void writeObject(ObjectOutputStream out)
            throws IOException {
        out.writeUTF(name);
        out.writeUTF(password);
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        password = in.readUTF();
        in.defaultReadObject();

    }

}
class SuperUserInfo {
    String name;
    String password;

    SuperUserInfo() {
        this("Unknown", "1111");
    }

    SuperUserInfo(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
