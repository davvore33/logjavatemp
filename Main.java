/**
 * Created by matteo on 06/02/16.
 */
public class Main {
    public static void main(String[] args){

        BinaryNode a = new BinaryNode(),
                b = new BinaryNode(),
                c = new BinaryNode(),
                d = new BinaryNode(),
                e = new BinaryNode(),
                f = new BinaryNode(),
                g = new BinaryNode();

        a.addLeft(b);
        b.addLeft(d);
        b.addRight(e);
        a.addRight(c);
        c.addRight(f);
        f.addLeft(g);

        int[] r = Cerca(a,-1);
        System.out.println("p "+r[0]+"c "+r[1]+"p media "+((float)r[0]/(float)r[1]));
    }
    public static int[] Cerca(BinaryNode x, int parent_p) {
        int p=parent_p+1;
        int s1p=0,s2p=0,c1=0,c2=0;
        BinaryNode s1=x.getLeft();
        BinaryNode s2=x.getRight();
        if(s1!=null){
            int[] s1r=Cerca(s1,p);
            s1p=s1r[0];
            c1=s1r[1];
        }
        if (s2!=null){
            int[] s2r=Cerca(s2,p);
            s2p=s2r[0];
            c2=s2r[1];
        }
        int r[] = new int[2];
        r[0]=s1p+s2p+p;
        r[1]=c1+c2+1;
        return r;
    }
}
