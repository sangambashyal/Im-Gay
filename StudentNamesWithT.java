public class StudentNamesWithT {
    public static void main(String[] args) {
        String[] students = {"Stuart", "Alice", "Tom", "Emily"};
        System.out.println("Students whose names contain the letter 't':");
        for (String name : students) {
            if (name.toLowerCase().contains("t")) {
                System.out.println(name);
            }
        }
    }
}
