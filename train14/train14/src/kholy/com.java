package kholy;

import kholy.model.Email;
import kholy.model.Student;

public class com {
    public static class Main {
        public static void main(String[] args) {
            Student student = new Student() ;
            student.setId(1);
            student.setName("Kholy");

            Email email1 = new Email() ;
            email1.setId(11);
            email1.setE_name("mohamed315374@gmail.com");
            email1.setNumber("01120547921");

            Email email2 = new Email() ;
            email2.setId(12);
            email2.setE_name("elkholy972002@gmail.com");
            email2.setNumber("01119478310");

            student.getEmails().add(email1);
            student.getEmails().add(email2);

            System.out.println(student.getEmails().size());
            System.out.println(student.getEmails().get(0).getE_name());
            System.out.println(student.getEmails().get(1).getE_name());

            email1.setStudent(student);
            email2.setStudent(student);

            System.out.println(email1.getStudent().getName());
            System.out.println(email2.getStudent().getName());
        }
    }
}
