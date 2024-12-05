package weekThirteen.setAndIteratorActivity;

public class Test {
    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValid("({[]})"));
        System.out.println(vp.isValid("([)]"));

        System.out.println();

        RecentCounter rc =  new RecentCounter();
        System.out.println(rc.ping(1));
        System.out.println(rc.ping(100));
        System.out.println(rc.ping(3001));
        System.out.println(rc.ping(3002));
    }
}
