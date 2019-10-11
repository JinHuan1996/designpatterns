package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class PrototypeTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(18);
        person.setName("金欢");
        person.setNike("今后");
        List<String> hobbyList = new ArrayList<>();
        hobbyList.add("玩");
        hobbyList.add("乐");
        person.setHobbyList(hobbyList);

        System.out.println(JSON.toJSON(person));
        Person clone = (Person) person.clone();
        hobbyList.add("吃");
        System.out.println(JSON.toJSON(person));
        System.out.println(JSON.toJSON(clone));
    }
}
