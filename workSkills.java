public class workSkills {
    String skill1, skill2;

    workSkills() {
        this.skill1 = "Java";
        this.skill2 = "C++";
    }

    workSkills(String s1, String s2) {
        this.skill1 = s1;
        this.skill2 = s2;
    }

    public void printworkSkills() {
        workSkills obj1 = new workSkills();
        workSkills obj2 = new workSkills("Java", "C++");

        System.out.println("===============DEFAULT CONSTRUCTOR===============");
        System.out.println("Work Skills : \n\t1)" +obj1.skill1 + "\n\t2)" +obj1.skill2);
        System.out.println("===============CONSTRUCTOR WITH PARAMETER===============");
        System.out.println("Work Skills : \n\t1)" +obj2.skill1 + "\n\t2)" +obj2.skill2);

    }
}
