public class Ex7 {
    public static void main(String[] args) {
        float sumpositive = 0;
        float sumnegative = 0;
        for(float i = 1.0f; i < 14; i+=4){
            sumpositive += 1.0/(i);
        }
        System.out.println(sumpositive);

        for(float k = 3.0f; k < 14; k+=4){
            sumnegative += 1.0/(k);
        }
        System.out.println(sumnegative);
        System.out.println(4*(sumpositive-sumnegative));
    }
}
