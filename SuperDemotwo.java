class Parent {
    int pid;

    Parent(int id) {
        pid = id;
    }
}

class Child extends Parent {
    String course;

    Child(int id, String c) {
        super(id);  
        course = c;
    }

    void putdata() {
        System.out.println("Parent ID: " +pid);
        System.out.println("Course: " +course);
    }
}

class SuperDemotwo {
    public static void main(String args[]) {
        Child ob = new Child(101, "Computer Science");
        ob.putdata();
    }
}