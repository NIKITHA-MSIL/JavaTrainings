public class Students extends Human{
    private	int rollno;
    private	int marks;


    public int getRollno() {
        return rollno;
    }



    public void setRollno(int rollno) {
        this.rollno = rollno;
    }


    public int getMarks() {
        return marks;
    }


    public void setMarks(int marks) {
        this.marks = marks;
    }



    public double getPercent() {
        return (marks*1.0/75)*100;
    }

    public void write() {
        System.out.println("Student is writing the exam");
    }

    public void write(String assign) {
        System.out.println("student is writing assignment");
    }

}


