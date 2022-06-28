package myhomework1;

import org.testng.annotations.Test;

public class Method1 {


    @Test

    public static void loop1() {

            for (int i = 0; i <= 100; i++) {
                if (i==0){
                    System.out.println(i);
                }
                else if (i % 15 == 0) {
                    System.out.println("MIX");
                } else if (i % 3 == 0) {
                    System.out.println("BANANA");
                } else if (i % 5 == 0) {
                    System.out.println("AVOCADO");
                }
                else System.out.println(i);
            }
        }



        @Test
        public void loop2() {
        String text = "I believe I can fly";
        for (int i = text.length(); i>=0; i--){
            System.out.println(i);
        }

            System.out.println(text.length());
            System.out.println(text.charAt(text.length()-5));


        }
        @Test
    public void stringsMethods(){
        String text = "just do it";
        char z = '!';
            System.out.println(text+z);
            System.out.println(text.substring(3,6));
            System.out.println(text.length());
            System.out.println(text.charAt(2));



        }


        @Test
    public void checkArray(){
        int[] age = {18, 25, 45};
            System.out.println(age[0]);
            age[0] = 4;
            System.out.println(age[0]);
        }

        @Test

        public void checkArrayAgain(){
        int[] age = new int[10];
        age[0] = 1;
        age[5] = 6;
        age[8] = 9;
            System.out.println(age[0]);
        }

        @Test
        public void checkSplit(){
        String text = "My home is my castle";
        String[] sp = text.split(" ");
            System.out.println(sp[0]);
            for (String word:sp){
                System.out.println(word);
            }
        }
    }
