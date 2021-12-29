public class College {
    public static void main(String[] args) {


        Students	obj=new Students();
        obj.setRollno(4);
        obj.setName("Anu");
        obj.setMarks(79);;
        obj.setAge(20);
        obj.write();
        obj.write("Assignment");

        double percent=obj.getPercent();

        System.out.println(percent);


        Teachers obj1=new Teachers();
        obj1.setEid(467);
        obj1.setName("Rahul");
        obj1.setAge(50);
        obj1.setSalary(30000);
        obj1.write();


        int sal=obj1.salary();
        System.out.println(sal);



    }

}


