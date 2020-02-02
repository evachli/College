package gr.codehub.MyCollege;

import org.json.JSONArray;

import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class College {
    private final String DELIMETER =",";
    private List<Student> students;

    //CONSTRUCTORS

    public College() {
        students = new ArrayList<>();
    }

    public College(List<Student> students) {
        this.students = students;
    }

    public int addStudent(Student student) {

        if (students.equals(student)) {
            System.out.println("Student with ID: " + student + "already exist");
            return student.getId();
        }
        student.setId(students.size() + 1);
        System.out.println("...Adding student with ID: " + student.getId());
        student.setCourse(student.getCourse());
        student.setMarkModules(student.getMarkModules());
        students.add(student);
        return student.getId();
    }

    public double calculateStudentAvgMarks() {
        double studentsAvgMarks = students.stream().mapToDouble(Student::getAverageMark).sum() / students.size();
        return studentsAvgMarks;
    }

    public void saveStudentstoCSVFile(String filename) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File(filename));
        for (Student s : students)
            pw.println(s.getId() + DELIMETER + s.getCourse() + DELIMETER + s.getMarkModules());
        pw.close();
    }

        public void getStudentsAsXML(String filename){
            XMLEncoder encoder=null;
            try{
                encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream(filename)));
            }catch(FileNotFoundException fileNotFound){
                System.out.println("ERROR: While Creating or Opening the File dvd.xml");
            }
            encoder.writeObject(students);
            encoder.close();
        }



    public String getAsJson(){
        JSONArray jsArray = new JSONArray(students);
        return jsArray.toString();
    }

    public boolean saveToJasonFile(String filename) {
        try (PrintWriter pw = new PrintWriter(new File(filename))) {

            pw.println( getAsJson());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public int printCollegeoConsole() {
        students.forEach(System.out::println);
        return students.size();
    }
}
