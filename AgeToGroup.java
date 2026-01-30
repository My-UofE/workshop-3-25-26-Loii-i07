public class AgeToGroup {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        String ageGroup = (age <= 18) ? "Group 1": (age >=65)  ? "Group 2" : "Group 3";
     
         
            
        System.out.println("Age: " + age + ", Age Group: " + ageGroup);
    }
}