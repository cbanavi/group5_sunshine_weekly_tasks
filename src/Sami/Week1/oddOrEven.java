package Sami.Week1;

        public class oddOrEven {
            public class NumberTypeIdentifier {

                public static void main(String[] args) {
                    System.out.println(identifyNumberType(100));
                    System.out.println(identifyNumberType(37));
                }

                public static String identifyNumberType(int number) {
                    if (number % 2 == 0) {
                        return "even";
                    } else {
                        return "odd";
                    }
                }
            }
        }

