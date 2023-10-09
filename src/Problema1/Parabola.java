package Problema1;

public class Parabola {
    private int a;
    private int b;
    private int c;
    private float v1;
    private float v2;
    public Parabola(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.v1=-b/2*a;
        this.v2=(-b*b + 4*a*c)/4*a;
    }

    public String toString()
    {
        return "f(x)="+a+"x^2+"+b+"x+"+c;
    }

    public String varfuri_parabola()
    {
        return "Varful parabolei are coordonatele: "+this.v1+ ", "+this.v2;
    }
    public String mijloc_segment1(Parabola p)
    {
        float x = (this.v1+this.v2)/2;
        float y = (p.v1+p.v2)/2;
        return "x="+x+"  y="+y;
    }

    public static void mijloc_segment2(Parabola p1, Parabola p2)
    {
        float x = (p1.v1+p1.v2)/2;
        float y = (p2.v1+p2.v2)/2;
        System.out.println("x= "+x+"  y="+y);
    }

    public double lungime_segment1(Parabola p)
    {
        double l = Math.sqrt((p.v1-this.v1)*(p.v1-this.v1) + (p.v2-this.v2)*(p.v2-this.v2));
        return l;
    }
    public double lungime_segment2(Parabola p1,Parabola p2)
    {
        double l = Math.sqrt((p2.v1-p1.v1)*(p2.v1-p1.v1) + (p2.v2-p1.v2)*(p2.v2-p1.v2));
        return l;
    }
}
