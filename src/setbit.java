public class setbit {
    public static void main(String args[]){
        int num = 5;
        int pos= 1;
        int bitMask = 1<<pos;

        int newNumber = bitMask |num;
        System.out.println(newNumber);
    }
}
