import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Staff> staffSet = new LinkedList<>();
        staffSet.add(new Staff("Trung", "female", "27/06/1996"));
        staffSet.add(new Staff("Phu", "female", "27/12/2003"));
        staffSet.add(new Staff("Thao", "male", "12/03/1987"));
        staffSet.add(new Staff("Huyen", "male", "03/05/1997"));

        Queue<Staff> femaleSet = new LinkedList<>();
        Queue<Staff> maleSet = new LinkedList<>();
        for( Staff s: staffSet) {
            if(s.femaleGender(s)) {
                femaleSet.add(s);
            }
            else maleSet.add(s);
        }

        System.out.println("Danh sach nhan vien nam:");
        for(Staff s: femaleSet){
            System.out.println(s.toString());
        }

        System.out.println("Danh sach nhan vien nu:");
        for(Staff s: maleSet){
            System.out.println(s.toString());
        }
    }
}
