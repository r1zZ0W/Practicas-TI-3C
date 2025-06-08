package U1_TI.U1_TI_03_PromediosClases.Model;

public class Estudiantes {

    private String studentName;
    private String studentId;
    private double[] studentGrades = new double[5];

    public String getStudentName() {

        return studentName;

    }

    public String getStudentId(){

        return studentId;

    }

    public double getGrade(int index){

        return studentGrades[index];

    }

    public double getAverage() {

        double sum = 0;

        for(int i = 0; i < studentGrades.length; i++) {

            sum += studentGrades[i];

        }

        double average = sum / 5;


        return average;

    }

    public void setStudentName(String studentName){

        this.studentName = studentName;

    }

    public void setStudentId(String studentId) {

        this.studentId = studentId;

    }

    public void setStudentGrade(int index, double grade){

        this.studentGrades[index] = grade;

    }

    public boolean isStudentPassed(){

        return getAverage() >= 70;

    }

}
