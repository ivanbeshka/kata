import java.util.ArrayList;

public class School {
    //напишите класс School
    //goInSchool() — пришел в школу, outFromSchool() — вышел из школы
    // isInSchool() — статус в школе/не в школе типа boolean

    private ArrayList<Human> humans = new ArrayList<>();

    public String getPeoplesInSchool() {
        /* реализуйте метод получения учителей и учеников в школе
           в формате:

           В школе:
           Игорь Николаев Математика 20
           Иван Иванов 2010
         */
        StringBuilder res = new StringBuilder("В школе:");
        for (Human human:humans){
            res.append("\n").append(human.toString());
        }
        return res.toString();
    }

    public void goInSchool(Human human){
        humans.add(human);
    }

    public void outFromSchool(Human human){
        humans.remove(human);
    }

    public boolean isInSchool(Human human){
        return humans.contains(human);
    }
}

//
public class Human {
    public final String name;
    public final String surName;

    public Human(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
}

public class Pupil extends Human {

    private int yearOfStart;

    public Pupil(String name, String surName, int yearOfStart) {
        super(name, surName);
        this.yearOfStart = yearOfStart;
    }

    public int getYearOfStart() {
        return yearOfStart;
    }

    @Override
    public String toString() {
        return name + ' ' + surName + ' ' + yearOfStart;
    }
    /*напишите класс Pupil
      формат вывода toString(): <имя> <фамилия> <год поступления>
     */
}

public class Teacher extends Human {

    private String obj;
    private int exp;

    public Teacher(String name, String surName, String obj, int exp) {
        super(name, surName);
        this.obj = obj;
        this.exp = exp;
    }

    public String getObj() {
        return obj;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public String toString() {
        return name + ' ' + surName + ' ' + obj + ' ' + exp;
    }
    /*напишите класс Teacher
      формат вывода toString(): <имя> <фамилия> <предмет> <стаж работы>
     */
}