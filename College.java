class College {

    String collegeName = "ABC Engineering College";
    String city = "Bangalore";

    class Student {
        int studentId;
        String studentName;
        String course;

        Student(int studentId, String studentName, String course) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.course = course;
        }

        void displayStudent() {
            System.out.println("----- College Details -----");
            System.out.println("College Name: " + collegeName);
            System.out.println("City: " + city);

            System.out.println("\n----- Student Details -----");
            System.out.println("Student ID: " + studentId);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {

        College college = new College();
        College.Student s1 = college.new Student(1, "Rahul", "CSE");

        s1.displayStudent();
    }
}
