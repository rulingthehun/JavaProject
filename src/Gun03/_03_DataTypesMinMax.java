package Gun03;

public class _03_DataTypesMinMax {
    public static void main(String[] args) {
        byte byteMinDeger = Byte.MIN_VALUE;
        byte byteMaxDeger = Byte.MAX_VALUE;
        System.out.println("byteMinDeger = " + byteMinDeger);
        System.out.println("byteMaxDeger = " + byteMaxDeger);

        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);

        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
    }
}
/*
byteMinDeger = -128
byteMaxDeger = 127
Byte.MIN_VALUE = -128
Byte.MAX_VALUE = 127
Integer.MIN_VALUE = -2147483648
Integer.MAX_VALUE = 2147483647
Long.MIN_VALUE = -9223372036854775808
Long.MAX_VALUE = 9223372036854775807
Float.MIN_VALUE = 1.4E-45
Float.MAX_VALUE = 3.4028235E38
Double.MIN_VALUE = 4.9E-324
Double.MAX_VALUE = 1.7976931348623157E308
*/