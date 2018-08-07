class Exer7_Student {

    private int stuID;
    private Exer7_CollegeCourse[] course = new Exer7_CollegeCourse [5];

    int getID()
        {
            return stuID;
        }
        Exer7_CollegeCourse getCourse(int x)
        {
            return course[x];
        }

        void setID(int idNum)
        {
            stuID = idNum;
        }
        void setCourse(Exer7_CollegeCourse c, int x)
        {
            course[x] = c;
        }
    }