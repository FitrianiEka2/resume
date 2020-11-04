public class newCgpa {

    double gpa[] = new double[4];
    double Cgpa = 3.5;

    newCgpa() {
        this.gpa = new double [] {3.5, 3.5, 3.4, 3.6};
        this.Cgpa = 3.5;
    }

    newCgpa(double a[], double b) {
        this.gpa = a;
        this.Cgpa = b;
    }

    public void printCgpa() {
        newCgpa obj1 = new newCgpa();
        newCgpa obj2 = new newCgpa(new double[]{3.5, 3.5, 3.4, 3.6}, 3.5);

        System.out.println("===============DEFAULT CONSTRUCTOR===============");
        double sum = 0, finalCgpa = 0;
        for (int i=0; i<obj1.gpa.length; i++) {
            sum += obj1.gpa[i];
            System.out.println("Gpa Sem" +i+ " : " + obj1.gpa[i]);
        }
        finalCgpa = sum/obj1.gpa.length;
        System.out.println("Average Gpa " +finalCgpa);
        System.out.println("Cgpa : " + obj1.Cgpa);

        System.out.println("===============CONSTRUCTOR WITH PARAMETER===============");
        double sum1 = 0, finalCgpa1 = 0;
        for (int i=0; i < obj2.gpa.length; i++) {
            sum1 = obj2.gpa[i] + sum1;
            System.out.println("Gpa sem" +i+ " : " + obj2.gpa[i]);
        }
        finalCgpa1 = (sum1/obj1.gpa.length);
        System.out.println("Average Gpa : "+finalCgpa1);
        System.out.println("Cgpa : "+ obj2.Cgpa);
    }
}
