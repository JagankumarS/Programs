public class Student {

    String name;
    int age;
    String sex;

    public static void main(String[] args) {

        Student priya = setDetails("priya S", 16, "female");
        Student lav = setDetails("Lavanya S", 70, "female");
        Student j = setDetails("Jagan S", 9, "male");
        Student v = setDetails("Vinod S", 50, "male");
        Student[] students = {priya, lav, j, v};
        for (int i = 0; i < students.length; i++) {
            if (students[i].sex == "female" || students[i].age > 40) {
                printDetails(students[i]);
            }
        }
    }
    static Student setDetails (String name,int age, String sex){

        Student s = new Student();
        s.name = name;
        s.age = age;
        s.sex = sex;
        return s;
    }
    static String getStudentType (Student student,int age){
        if (student.age > 65) {
            return "senior";
        } else if (student.age > 12 && student.age < 20) {
            return "teenager";
        } else {
            return "regular";
        }
    }
    static void printDetails (Student students) {
        String studentType = getStudentType(students, 38);
        System.out.println(students.name + " is a " + studentType + " student");
    }
}