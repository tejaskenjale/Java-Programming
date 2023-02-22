package Assignment1;

public class ComputerScience {

        // Declaration of variables.
        protected String course_ID;
        protected String course_name;
        protected String semester;
        protected int credits;

        //Argument or Parameterized constructor
        public ComputerScience(String course_ID, String course_name, String semester, int credits){
            this.course_ID = course_ID;
            this.course_name = course_name;
            this.semester = semester;
            this.credits = credits;

        }

        public void setCourse_ID (String course_ID){
            this.course_ID = course_ID;
        }

       public void setCourse_name (String course_name){
            this.course_name = course_name;
        }

        public void setSemester (String semester){
            this.semester = semester;
        }

        public void setCredits (int credits){
            this.credits = credits;
        }

        public String getCourse_ID () {
            return this.course_ID;
        }

        public int getCredits () {
            return this.credits;
        }

        public String getCourse_name () {
            return this.course_name;
        }

        public String getSemester () {
            return this.semester;
        }

        public String toString () {
            return "A Course with Course Id " + course_ID + ",name of the course " + course_name + " offered in the semester " + semester + " with " + credits + " credits";
        }
}
