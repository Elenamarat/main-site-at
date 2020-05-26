public class Cat implements Overcoming {
    private int run = 5;
    private int jump = 1;

    public boolean run(int lengthTreadmill) {
        if (lengthTreadmill > this.run) {
            System.out.println("Кот не смог пробежать беговую дорожку");
            return false;
        }
        System.out.println("Кот пробежал " + this.run + " метров");
        return true;
    }

    public boolean jump(int heightWall) {
        if (heightWall > this.jump) {
            System.out.println("Кот не смог перепрыгнуть стену");
            return false;
        }
        System.out.println("Кот прыгнул на " + this.jump + " метра");
        return true;
    }
}
