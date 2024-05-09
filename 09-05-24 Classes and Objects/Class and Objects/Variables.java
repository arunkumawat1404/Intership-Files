class InstanceVarible{
     String studentName;
    int regNo;
    String school;

    public void localVaribles(){
        String className = "X";
        System.out.println(" Name " + studentName + " Roll No " + regNo + "Class " + className +" School " + school );

    }


}
class Staticvarible{
    String studentName;
    int regNo;
    static String school;
    public void studentDetails(){
        String className = " X";
        System.out.println(" Name " + studentName + " Roll No " + regNo + "Class " + className +" School " + school );

    }
}
class StaticBlock{
    String studentName;
    int regNo;
    static String school;
    static{
        school= " Gurukul Academy";
    }
    public void studentDetails(){
        String className = " X";
        System.out.println(" Name " + studentName + " Roll No " + regNo + "Class " + className +" School " + school );

    }
}
public class Variables {
    public static void main(String[] args) {
        InstanceVarible s1 = new InstanceVarible();
        s1.studentName="Arun";
        s1.regNo=10;
        s1.school="Gurukul  Academy";
        InstanceVarible s2 = new InstanceVarible();
        s2.studentName="Vaibhav";
        s2.regNo=45;
        s2.school="Matrix School";
        s1.localVaribles();
        s2.localVaribles();
        Staticvarible s3 = new Staticvarible();
        s3.studentName="Arun";
        s3.regNo=10;
        s3.school="Gurukul  Academy";
        Staticvarible s4 = new Staticvarible();
        s4.studentName="Vaibhav";
        s4.regNo=45;
        s4.school="Matrix School";
        s3.studentDetails();
        s4.studentDetails();
        StaticBlock s5= new StaticBlock();
        s5.studentName="Arun";
        s5.regNo=10;
       // s5.school="Gurukul  Academy";
        StaticBlock s6= new StaticBlock();
        s6.studentName="Vaibhav";
        s6.regNo=45;
       // s6.school="Matrix School";
        s5.studentDetails();
        s6.studentDetails();

    }
    
}
