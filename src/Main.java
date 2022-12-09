public class Main {
    public static void main(String[] args) {
        /*
        [A]: (55 != 55) && (false ^ true)
        [B]: considering that a=true, b=false, int c=2 and char d='2': (!a || !b) || c == d )
        [C]: false && true || false && !false
        [D]: (false && true) || (false || true))
         */

        //A False
        boolean A = (55 !=55) && (false ^ true);
        //B True
        boolean a=true;
        boolean b=false;
        int c=2;
        char d='2';
        boolean B= (!a||!b) || (c == d);
        //C False
        boolean C=false && true || false && !false;
        //D True
        boolean D= (false && true) || (false || true);

        System.out.println("A is "+A);
        System.out.println("B is "+B);
        System.out.println("C is "+C);
        System.out.println("D is "+D);

    }
}