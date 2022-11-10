public class Circle {
    private  static double Pi=Math.PI;

    public static double getPi() {
        return Pi;
    }

    public static void setPi(double pi) {
        Pi = pi;
    }

    public static double area(double r){
       return  Pi * (r * r);
    }
    public  static  double circumference(double r){
        return   Pi * 2 * r;
    }
}
