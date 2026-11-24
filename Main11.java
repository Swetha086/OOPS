class UniversityMember {
    int memberId;

    void checkIn() {
        System.out.println("Member checked in");
    }
}

class Staff extends UniversityMember {
    String department;

    void attendMeeting() {
        System.out.println("Staff from " + department + " is attending a meeting");
    }
}

class Professor extends Staff {
    String subject;

    void conductLecture() {
        System.out.println("Conducting lecture on " + subject);
    }
}

class AdminOfficer extends Staff {
    String officeRoom;

    void processFiles() {
        System.out.println("Processing files in " + officeRoom);
    }
}

public class Main11 {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.memberId = 101;
        prof.department = "Computer Science";
        prof.subject = "Data Structures";

        prof.checkIn();
        prof.attendMeeting();
        prof.conductLecture();

        AdminOfficer admin = new AdminOfficer();
        admin.memberId = 202;
        admin.department = "Admissions";
        admin.officeRoom = "Room 105";

        admin.checkIn();
        admin.attendMeeting();
        admin.processFiles();
    }
}