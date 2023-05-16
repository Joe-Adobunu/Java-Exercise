package codeworld;

public class ChristmasSong {
    public static void main(String[] args) {

                String gift;
                for (int day = 1; day <= 12; day++) {
                    System.out.print("On the ");
                    switch (day) {
                        case 1 -> {
                            System.out.print("first");
                            gift = "a partridge in a pear tree.";
                        }
                        case 2 -> {
                            System.out.print("second");
                            gift = "two turtle doves, and";
                        }
                        case 3 -> {
                            System.out.print("third");
                            gift = """
                                    Three french hens
                                    Two turtle  doves,and
                                    A partridge in a pear tree 
                                    """;
                        }
                        case 4 -> {
                            System.out.print("fourth");
                            gift = "four calling birds,";
                        }
                        case 5 -> {
                            System.out.print("fifth");
                            gift = "five golden rings,";
                        }
                        case 6 -> {
                            System.out.print("sixth");
                            gift = "six geese a-laying,";
                        }
                        case 7 -> {
                            System.out.print("seventh");
                            gift = "seven swans a-swimming,";
                        }
                        case 8 -> {
                            System.out.print("eighth");
                            gift = "eight maids a-milking,";
                        }
                        case 9 -> {
                            System.out.print("ninth");
                            gift = "nine ladies dancing,";
                        }
                        case 10 -> {
                            System.out.print("tenth");
                            gift = "ten lords a-leaping,";
                        }
                        case 11 -> {
                            System.out.print("eleventh");
                            gift = "eleven pipers piping,";
                        }
                        case 12 -> {
                            System.out.print("twelfth");
                            gift = "twelve drummers drumming,";
                        }
                        default -> gift = "";
                    }
                    System.out.println(" day of Christmas,");
                    System.out.println("my true love sent to me");
                    for (int i = day; i > 0; i--) {
                        System.out.println(gift);
                        if (i == 1 && day > 1) {
                            System.out.println("and");
                        }
                    }
                    System.out.println();
                }
    }
}
