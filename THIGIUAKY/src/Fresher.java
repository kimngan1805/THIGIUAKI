public class Fresher implements Employee {
    private int ID;
    private String FullName;
    private String BirthDay;
    private int Phone;
    private String Email;
    private String Employee_type;
    private int Employee_count;
    private int Graduation_date;
    private String Graduation_rank;
    private String Education;
    public Fresher(int ID, String fullName, String birthDay, int phone, String email, String employee_type, int employee_count, int graduation_date, String graduation_rank, String education) {
        this.ID = ID;
        FullName = fullName;
        BirthDay = birthDay;
        Phone = phone;
        Email = email;
        Employee_type = employee_type;
        Employee_count = employee_count;
        Graduation_date = graduation_date;
        Graduation_rank = graduation_rank;
        Education = education;
    }
    public int getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(int graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmployee_type() {
        return Employee_type;
    }

    public void setEmployee_type(String employee_type) {
        Employee_type = employee_type;
    }

    public int getEmployee_count() {
        return Employee_count;
    }

    public void setEmployee_count(int employee_count) {
        Employee_count = employee_count;
    }

//    public Fresher(int ID, String fullName, String birthDay, int phone, String email,
//    String employee_type, int employee_count, int graduation_date, String graduation_rank, String education) {
    @Override
    public String showInfo() {

        return("Id"+ID +"Fullname"+FullName+"DOB"+BirthDay+"Phone"+Phone+"Email"+Email+"Employee_Type"+Employee_type+"Graduation Date"+Graduation_date+"Graduation Rank"+Graduation_rank+"Education"+Education);
    }
}

