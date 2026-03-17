class Principal {
    String name = "Rameesh";
}

class Teacher extends Principal {
    int tchrid = 56;
}

class Student extends Teacher {
    int rno = 70;

    void display() {
        System.out.println("Principal name: " + name);
        System.out.println("Teacher Id: " + tchrid);
        System.out.println("Student roll no: " + rno);
    }
}

class Multilevel {
    public static void main(String args[]) {
        Student ob = new Student();
        ob.display();
    }
}