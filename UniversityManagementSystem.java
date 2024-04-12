interface Employees {
    void work();
    void takeBreak();
}

class Admin implements Employees {
    @Override
    public void work() {
        System.out.println("Admin is working right now");
    }

    @Override
    public void takeBreak() {
        System.out.println("Admin is taking a break right now");
    }
}

class Faculty implements Employees {
    @Override
    public void work() {
        System.out.println("Faculty is working properly");
    }

    @Override
    public void takeBreak() {
        System.out.println("Faculty is taking a break.");
    }
}

class Professor extends Faculty {
    @Override
    public void work() {
        System.out.println("Professor is teaching.");
    }
}

class AssistantProfessor extends Faculty {
    @Override
    public void work() {
        System.out.println("Assistant Professor is teaching.");
    }
}

class Lecturer extends Faculty {
    @Override
    public void work() {
        System.out.println("Lecturer given teaching.");
    }
}

class Examination extends Admin {
    @Override
    public void work() {
        System.out.println("Examination department is preparing exams.");
    }
}

class Admission extends Admin {
    @Override
    public void work() {
        System.out.println("Admission department is processing applications.");
    }
}

public class PracticeLab04 {
    public static void main(String[] args) {
        Employees professor = new Professor();
        Employees assistantProfessor = new AssistantProfessor();
        Employees lecturer = new Lecturer();
        Employees examination = new Examination();
        Employees admission = new Admission();

        professor.work();
        assistantProfessor.work();
        lecturer.work();
        examination.work();
        admission.work();

        professor.takeBreak();
        assistantProfessor.takeBreak();
        lecturer.takeBreak();
        examination.takeBreak();
        admission.takeBreak();
    }
}
