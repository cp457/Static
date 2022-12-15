public class Main {
    public static void main(String[] args) {
        Employee em1 = new Employee(" Chris ", " Priolo ", " Via Origano 9 ");
        Badge b1 = new Badge(em1);
        b1.showBadgeDetails();

        Employee em2 = new Employee(" Mario ", " Bianchi ", " Via SanCristofolo ");
        Badge b2 = new Badge(em2);
        b2.showBadgeDetails();


    }
}

/*   create 2 new Employee objects
    create their new 2 Badge
    show to the user the 2 employees' badge details */