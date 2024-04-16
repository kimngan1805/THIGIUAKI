public class Intern implements Employee{
    private int ID;
    private String full_name;
    private String dob;
    private int phone;
    private String mail;
    private String Employee_type;
    private int Employee_count;
    private String major;
    private int semester;
    private String university;
    public Intern(int ID,String full_name, String dob, int phone, String mail, String Employee_type, int Employee_count, String major, int semester, String university){
        this.ID=ID;
        this.full_name=full_name;
        this.dob=dob;
        this.phone=phone;
        this.mail=mail;
        this.Employee_type=Employee_type;
        this.Employee_count=Employee_count;
        this.major=major;
        this.semester=semester;
        this.university=university;
    }

    public String getEmployee_type() {
        return Employee_type;
    }

    public String getMail() {
        return mail;
    }

    public String getDob() {
        return dob;
    }

    public int getPhone() {
        return phone;
    }

    public int getEmployee_count() {
        return Employee_count;
    }

    public int getID() {
        return ID;
    }

    public int getSemester() {
        return semester;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getUniversity() {
        return university;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmployee_type(String employee_type) {
        Employee_type = employee_type;
    }

    public void setEmployee_count(int employee_count) {
        Employee_count = employee_count;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMajor() {
        return major;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String showInfo() {

        return("Id"+ID +"Fullname"+full_name);
    }
}
