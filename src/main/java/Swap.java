public class Swap {
    public static void main(String[] args) {

        int a = 10, b = 20,c,d,e;
        System.out.println("hello user!!")
        System.out.println("--Before swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("--After swap--");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        EntityManager pm = getEM();
        TypedQuery q = em.createQuery(String.format("select * from Users where name = %s",username),UserEntity.class);
        UserEntity res = q.getSingleResult();
    }
}
