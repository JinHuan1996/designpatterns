package designpatterns.prototype;

/**
 * 克隆类
 */
public class Client {

    /**
     * 赋值方法.
     * @param person 赋值源对象
     * @return 赋值得到的对象
     */
    public static Person copy(Person person) {
        Person personCopy = new Person();
        personCopy.setName(person.getName());
        personCopy.setAge(person.getAge());
        personCopy.setNike(person.getNike());
        personCopy.setHobbyList(person.getHobbyList());
        return personCopy;
    }
}