public class Lilly {
    public static void main(String[] args) {

    }
}
abstract class Employees{
    String name;
    int id;

    public Employees(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract float salary();
    float working_hour;
    public float work_hour(){}

}
class Fulltime extends Employees{

    float month_salary;

    public Fulltime(String name, int id, float month_salary) {
       super(name, id);
        this.month_salary = month_salary;
    }

    @Override
    float salary() {
        return month_salary;
    }
}

class Part_Time extends Employees{
    int hour_worked;
    float wages_per_hour;

    int workin_hours;

    public Part_Time(String name, int id) {
        super(name, id);
        this.wages_per_hour=wages
    }

    float salary(){
        return hour_worked*wages_per_hour;
    }
}



