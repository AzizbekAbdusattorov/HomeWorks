package Lesson15;

public enum Season {

    SPRING {
        public void month(int x) {
            super.month(3);
        }
    }, SUMMER {
        public void month(int x) {
            super.month(6);
        }
    }, AUTUMN {
        public void month(int x) {
            super.month(9);
        }
    } , WINTER {
        public void month(int x) {
            super.month(12);
        }
    };


    public void month(int x) {
        int y = x + 3;
        for (int i = x; i < y; i++) {
            if (i == 13){
                i = 1;
                y = 3;
            }
            switch (i){
                case 1: System.out.println("January"); break;
                case 2: System.out.println("February"); break;
                case 3: System.out.println("March"); break;
                case 4: System.out.println("April"); break;
                case 5: System.out.println("May"); break;
                case 6: System.out.println("June"); break;
                case 7: System.out.println("July"); break;
                case 8: System.out.println("August"); break;
                case 9: System.out.println("September"); break;
                case 10: System.out.println("October"); break;
                case 11: System.out.println("November"); break;
                case 12: System.out.println("December"); break;
            }
        }
    }


}
