public class Biodata {

    String name, gender, bday, marital, citizenship, homeaddress, phoneNumber;
    int age;

    Biodata() {
        this.name = "Fitriani Eka";
        this.gender = "Female";
        this.bday = "09 January 2000";
        this.age = 20;
        this.marital = "Single";
        this.citizenship = "Indonesia";
        this.homeaddress = "Bekasi, West Java, Indonesia";
        this.phoneNumber = "(+62) 812-1814-9391";
    }

    Biodata(String n, String g, String bd, String m, String ct, String ha, String pn, int a) {
        this.name = n;
        this.gender = g;
        this.bday = bd;
        this.age = a;
        this.marital = m;
        this.citizenship = ct;
        this.homeaddress = ha;
        this.phoneNumber = pn;
    }

    public void printConstructor() {
        Biodata obj1 = new Biodata();
        Biodata obj2 = new Biodata("Fitriani Eka", "Female", "09 January 2000", "Single", "Indonesia", "Bekasi, West Java, Indonesia", "(+62) 812-1814-9391", 20);

        System.out.println("===============CONSTRUCTOR===============");
        System.out.println("Name: "+obj1.name);
        System.out.println("Gender: "+obj1.gender);
        System.out.println("bday: "+obj1.bday);
        System.out.println("Age: "+obj1.age);
        System.out.println("Marital: "+obj1.citizenship);
        System.out.println("Home Address: "+obj1.homeaddress);
        System.out.println("Phone Number: "+obj1.phoneNumber);
    }
}
