public class Main {
    public static void main(String[] args) {
        int weight = 13;
        double gravitation = 0.165;
        double total = weight*gravitation;
        System.out.printf("%1$d * %2$.6f = %3$.6f",weight,gravitation,total);
        //System.out.println(weight+" * "+ gravitation +" = "+ weight*gravitation);
    }
}