public class Teachers extends Human{
    private	int eid;
    private	int salary;



    public int getEid() {
        return eid;
    }



    public void setEid(int eid) {
        this.eid = eid;
    }






    public int getSalary() {
        return salary;
    }



    public void setSalary(int salary) {
        this.salary = salary;
    }



    public int salary() {
        return salary*12;
    }

    public void write() {
        System.out.println("Teacher is setting the paper for exam");
    }

}


