public class Staff {
    private String name;
    private String gender;
    private String birthday;
    public Staff() {}
    public Staff(String name, String gender, String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name=" + name +
                ", gender=" + gender +
                ", birthday=" + birthday +
                "}";
    }
    public boolean femaleGender(Staff staff) {
        if(staff.getGender() == "female") {
            return true;
        } else
            return false;
    }

}