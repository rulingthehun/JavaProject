package Gun15;

public class _07_DebugOrnek {
    public static void main(String[] args) {
        int x, y;
        // F8 adım adım ilerler, F9 ise breakpoint ten brekpoint e ilerler
        x = 10;
        y = x;

        x+=2;
        y--;

        y*=2;

        y=5;
        for(int i = 0; i < 40; i++) {

            if(i / 15 == 1) {
                continue;
            }
            System.out.println( i );
        }
    }
}
