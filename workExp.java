public class workExp {

    String experience1, experience2;

    workExp() {
        this.experience1 = "Assistant Script Writer";
        this.experience2 = "Novelist";
    }

    workExp(String exp1, String exp2) {
        this.experience1 = exp1;
        this.experience2 = exp2;
    }

    public void printworkExp() {
        workExp obj1 = new workExp();
        workExp obj2 = new workExp("Assistant Script Writer", "Novelist");

        System.out.println("===============DEFAULT CONSTRUCTOR===============");
        System.out.println("Work Skills : \n\t1)" +obj1.experience1 + "\n\t2)" +obj1.experience2);
        System.out.println("===============CONSTRUCTOR WITH PARAMETER===============");
        System.out.println("Work Skills : \n\t1)" +obj2.experience1 + "\n\t2)" +obj2.experience2);
    }
}
