package HomeWorks.Hw4;


public class Training {

    public static void main(String[] args) {
        TrainTrain train = new TrainTrain(); // создаем объект класса TrainTrain

        train.sravnenie();
        train.printingWord();
        train .description = "bla bla balya";

        System.out.println(Math.pow(478,3));
        train.checkBoolean();
    }


    public static class TrainTrain {
        //public int a = 34534;
        public int b = 122231233;
        public static String description;
        private int a = 23331;

        public void checkBoolean() {

            boolean b1 = 2 > 1 || 5 < 3;
            System.out.println(b1);

        }

        public void sravnenie() {
            if (a < b) {
                System.out.println("a bigger then b");
            }


        }

        static void printingWord() {
            System.out.println("a bigger lkgkjhgkjgjhgthen b");
        }
    }
}
