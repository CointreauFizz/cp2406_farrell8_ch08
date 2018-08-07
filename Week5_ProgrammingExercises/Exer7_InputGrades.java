import javax.swing.*;

public class Exer7_InputGrades {
    public static void main(String[] args)
    {
        Exer7_Student[] students = new Exer7_Student[' '];
        int x, y, z;
        String courseEntry, entry,  message;
        int idEntry, credits;
        char gradeEntry = ' ';
        boolean isGoodGrade;
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        final int NUM_COURSES = 5;
        for(x = 0; x < students.length; ++x)
        {
            Exer7_Student stu = new Exer7_Student();
            entry = JOptionPane.showInputDialog(null, "For student #" +
                    (x + 1) + ", enter the student ID");
            idEntry  = Integer.parseInt(entry);
            stu.setID(idEntry);
            for(y = 0; y < NUM_COURSES; ++y)
            {
                courseEntry = JOptionPane.showInputDialog(null,
                        "For student #" + (x + 1) + ", enter course #" +
                                (y + 1));
                entry  = JOptionPane.showInputDialog(null,
                        "For student #" + (x + 1) +
                                ", enter credits for course  #" + (y + 1));
                credits = Integer.parseInt(entry);
                isGoodGrade = false;
                while(!isGoodGrade)
                {
                    entry  = JOptionPane.showInputDialog(null,
                            "For student #" + (x + 1) +
                                    ", enter grade for course  #" + (y + 1));
                    gradeEntry = entry.charAt(0);
                    for(z = 0; z < grades.length; ++z)
                    {
                        if(gradeEntry == grades[z])
                            isGoodGrade = true;
                    }
                }
                Exer7_CollegeCourse temp = new Exer7_CollegeCourse();
                temp.setID(courseEntry);
                temp.setCredits(credits);
                temp.setGrade(gradeEntry);
                stu.setCourse(temp, y);
            }
            students[x] = stu;
        }
        for(x = 0; x < students.length;  ++x)
        {
            message  = "Student #" + (x + 1) + "  ID #" +
                    students[x].getID();
            for(y = 0; y < grades.length; ++y)
            {
                new Exer7_CollegeCourse();
                Exer7_CollegeCourse temp;
                temp =  students[x].getCourse(y);
                message = message + "\n" + temp.getID() + " " + temp.getCredits() + "  -- credits. Grade is "
                        + temp.getGrade();
            }
            JOptionPane.showMessageDialog(null, message);
        }
    }
}