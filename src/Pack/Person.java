package Pack;

public class Person  {
    String name;
    Integer age;
    String  hairColor;

    public Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }
    @Override
    public String toString(){
        return name+" "+ age+" "+ hairColor;
    }
}

