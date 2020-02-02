package gr.codehub.MyCollege;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        College diri = new College();

        Course programming = new Course("PROGRAMMING", "PANE");
        Course telecomuntication = new Course("TELECOMUNICATION", "PANE");

        Module cpp = new Module();
        cpp.setName("C++"); cpp.setCourse(programming); cpp.setAssignedTutor("Izabo"); cpp.setModuleType(ModuleType.MANDATORY);

        Module architecture = new Module();
        cpp.setName("Architecture"); cpp.setCourse(programming); cpp.setAssignedTutor("Lala"); architecture.setModuleType(ModuleType.MANDATORY);

        Module logicDesign = new Module();
        logicDesign.setName("Logic Design"); logicDesign.setCourse(programming); logicDesign.setAssignedTutor("Paschalis");logicDesign.setModuleType(ModuleType.MANDATORY);

        Module telec = new Module();
        telec.setName("Telec"); telec.setCourse(telecomuntication); telec.setAssignedTutor("Someone");telec.setModuleType(ModuleType.MANDATORY);

        Module telelek = new Module();
        telelek.setName("Telelek"); telelek.setCourse(telecomuntication); telelek.setAssignedTutor("Britney");telelek.setModuleType(ModuleType.MANDATORY);

        Module telelelek = new Module();
        telelelek.setName("Telelelek"); telelelek.setCourse(telecomuntication); telelelek.setAssignedTutor("Remos");telelek.setModuleType(ModuleType.MANDATORY);

        Student tim = new Student();
        diri.addStudent(tim);
        tim.setCourse(programming);
        tim.enroll(logicDesign);
        tim.getMarkModules();
        tim.printStudentToConsole();

        Student george = new Student();
        diri.addStudent(george);
        george.setCourse(programming);
        george.enroll(logicDesign);
        george.getMarkModules();
        george.printStudentToConsole();

        Student eva = new Student();
        diri.addStudent(eva);
        eva.setId(3);
        eva.setCourse(programming);
        eva.enroll(logicDesign);
        eva.getMarkModules();
        eva.printStudentToConsole();

        Student leo = new Student();
        diri.addStudent(leo);
        leo.setCourse(telecomuntication);
        leo.enroll(logicDesign);
        leo.getMarkModules();
        leo.printStudentToConsole();

        Student teo = new Student();
        diri.addStudent(teo);
        teo.setCourse(telecomuntication);
        teo.enroll(telec);
        teo.getMarkModules();
        teo.printStudentToConsole();

        Student aris = new Student();
        diri.addStudent(aris);
        aris.setCourse(telecomuntication);
        aris.enroll(telelek);
        aris.getMarkModules();
        aris.printStudentToConsole();

        Student s = new Student();
        s.setId(4);
        diri.addStudent(s);
        s.setCourse(telecomuntication);
        s.enroll(telec);
        s.getMarkModules();
        s.printStudentToConsole();

        diri.printCollegeoConsole();

        diri.saveStudentstoCSVFile("diri.txt");
        diri.saveToJasonFile("diriJSON.txt");
        diri.getStudentsAsXML("diriXML.txt");

        }


}
