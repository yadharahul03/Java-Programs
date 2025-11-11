package Encapsulation;
public class Getters_Setters {
   
        private String name;
        private int rollno;
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public int getRollno(){
            return rollno;
        }
        public void setRollno(int rollno){
            this.rollno=rollno;
        }
        public static void main(String[] args) {
            Getters_Setters s1=new Getters_Setters();
            s1.setName("rahul");
            s1.setRollno(90);
            System.out.println(s1.getName());
            System.out.println(s1.getRollno());
        }
}
