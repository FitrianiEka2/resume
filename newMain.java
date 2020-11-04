public class newMain {

    public static void main (String[] args) {
        Biodata cons  = new Biodata();
        newCgpa c     = new newCgpa();
        workSkills ws = new workSkills();
        workExp    we = new workExp();

        cons.printConstructor();
        c.printCgpa();
        ws.printworkSkills();
        we.printworkExp();
    }
}
