
public class TestStudent {


    public static void main(String[] args) {
        Student supansa = new Student();
        System.out.println("Object =" + supansa);
        supansa.studentId = "614234022";
        supansa.major = "CS";
        supansa.faculty = "Science and Technology";
        supansa.showdata();
        supansa.enrollment();
        supansa.dropCourse();

        Student sineenart = new Student();
        sineenart.studentId = "614234006";
        sineenart.StudentName = "Miss sineenart";
        sineenart.major = "IT";
        sineenart.faculty = "Science and Technology";
        System.out.println("Object = " + sineenart);
        sineenart.showdata();
        
        GraduateStudent too =new GraduateStudent();
        too.stuyLevel="Year2";
        too.thaesisAdviser="DR.mimisi";
        too.thesisExamination();
        too.oraoralExaminat();
   }
}//end class

