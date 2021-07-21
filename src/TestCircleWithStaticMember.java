public class TestCircleWithStaticMember {

    public static void main(String[] args) {
        System.out.println("Before creating object the  number of objects is " + CircleWithStaticMember.numberOfObjects);
        CircleWithStaticMember c1 = new CircleWithStaticMember();
        System.out.println("After creating c1 the number of objects are " + c1.numberOfObjects);
        CircleWithStaticMember c2 = new CircleWithStaticMember(25);
        System.out.println("After creating c2 the number of objects " + c2.numberOfObjects);
        System.out.println(CircleWithStaticMember.numberOfObjects);

    }
}
