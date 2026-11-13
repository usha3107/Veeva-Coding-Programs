//library member types
import java.util.Scanner;

abstract class Member {
    abstract int getLoanLimit();

    boolean canBorrow(int requested) {
        return requested <= getLoanLimit();
    }
}

class StudentMember extends Member {
    int getLoanLimit() { return 3; }
}

class FacultyMember extends Member {
    int getLoanLimit() { return 10; }
}

public class lib_mem_types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        int requested = sc.nextInt();

        Member m = type.equalsIgnoreCase("S") ? new StudentMember() : new FacultyMember();
        System.out.println(m.canBorrow(requested) ? "Allowed" : "Denied");
    }
}