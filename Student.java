public class Student {
    private String surname;
    private int id;
    int sudentnumb = 0;

    Student() {
    }

    public Student(string sn, int id){

        this.surname = surname;
        this.id=id;
        sudentnumb=sudentnumb+1;

    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public void changeId(int id) {
        this.id = id;
    }

    public void changeSurname(String surname) {
        this.surname = surname;
    }
    public String fullStudent(){
        return new StringBuilder().append("[Номер: ").append(getId()).append(",Фамилия: ").append(getSurname()).append("]. ").append("Всего студентов на данный момент: ").append(numStud).toString();

    }
}
