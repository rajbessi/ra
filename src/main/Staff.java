
class Sample{
    int id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class Staff {
    public static void main(String ar[])
    {
        Sample s=new Sample();
        s.setId(1);
        s.setName("raj");
        // statement:
        System.out.println("The id is "+s.getId()+" and the name is "+s.getName());
    }
}