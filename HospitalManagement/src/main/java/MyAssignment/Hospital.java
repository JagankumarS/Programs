package MyAssignment;

public class Hospital {
    public static void main(String[] args) {
        Patient1 p=new Patient1("jagan", "01.01.2023", 25,"Male");
        Doctor1 d=new Doctor1("pradeeb","skin","senior");
        System.out.println(p.patientName);
        System.out.println(d.doctorName);
    }
}
