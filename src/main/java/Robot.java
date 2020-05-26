public class Robot implements Overcoming {
    private int run = 15;
    private int jump = 3;

    public boolean run(int lengthTreadmill) {
        if (lengthTreadmill > this.run) {
            System.out.println("Робот не смог пробежать беговую дорожку");
            return false;
        }
        System.out.println("Робот пробежал " + this.run + " метров");
        return true;
    }

    public boolean jump(int heightWall) {
        if (heightWall > this.jump) {
            System.out.println("Робот не смог перепрыгнуть стену");
            return false;
        }
        System.out.println("Робот прыгнул на " + this.jump + " метра");
        return true;
    }
}
