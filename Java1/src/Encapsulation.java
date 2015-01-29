/**
 * Created by rari on 28-01-2015.
 */
public class Encapsulation{

    private String name;
    private String idNum;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getIdNum(){
        return idNum;
    }

    public void setAge( int newAge){
        age = newAge;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setIdNum( String newId){
        idNum = newId;
    }
}

class RunEncap{

    public static void main(String args[]){
        Encapsulation a = new Encapsulation();
        a.setName("James");
        a.setAge(20);
        a.setIdNum("12343ms");

        System.out.print("Name : " + a.getName()+
                " Age : "+ a.getAge());
    }
}

