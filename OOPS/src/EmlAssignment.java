 public class EmlAssignment {
     public EmlAssignment() {
     }

     public static void main(String[] args) {
         Manager m1 = new Manager(1, "Y.Naaju", 30000.0D);
         Manager m2 = new Manager(2, "B.Harika", 32000.0D);
         Manager m3 = new Manager(3, "V.Bhagya", 35000.0D);
         Labour l1 = new Labour(1, "B.Divya", 15000.0D);
         Labour l2 = new Labour(2, "K.Harsha", 16000.0D);
         Labour l3 = new Labour(3, "K.Sowji", 18000.0D);
         System.out.println(l1.getSalary() + l2.getSalary() + l3.getSalary() + m1.getSalary() + m2.getSalary() + m3.getSalary());
     }
 }