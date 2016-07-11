package ly.generalassemb.actors_list_trial1;

/**
 * Created by samwyz on 7/11/16.
 */
public class Actor {

    String name;
    int age;
    String sex;
    String url;

    public Actor(String name, int age, String sex, String url) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
