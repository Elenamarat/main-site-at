public class Human implements Overcoming {
    private int run = 10;
    private int jump = 2;

    public boolean run(int lengthTreadmill) {
        if (lengthTreadmill > this.run) {
            System.out.println("Человек не смог пробежать беговую дорожку");
            return false;
        }
        System.out.println("Человек пробежал " + this.run + " метров");
        return true;
    }

    public boolean jump(int heightWall) {
        if (heightWall > this.jump) {
            System.out.println("Человек не смог перепрыгнуть стену");
            return false;
        }
        System.out.println("Человек прыгнул на " + this.jump + " метра");
        return true;
    }
}
