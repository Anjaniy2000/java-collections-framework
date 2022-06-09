package comparableAndComparator.comparable;

public class Student implements Comparable<Student>{

    private String name;
    private float cgpa;

    public Student(String name, float percentage) {
        this.name = name;
        this.cgpa = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student [Name = " + this.name + " , " + "CGPA = " + this.cgpa + "]";
    }

    //Soring On The Basis Of CGPA:
    @Override
    public int compareTo(Student o) {

        //Sorting(Decreasing Order):
//        return Float.compare(o.cgpa, this.cgpa);

        //Sorting(Increasing Order):
        return Float.compare(this.cgpa, o.cgpa);
    }
}