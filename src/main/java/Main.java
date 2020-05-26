public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Human human = new Human();
        Robot robot = new Robot();
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

        Overcoming[] participants = {cat, human, robot};
        Object[] obstacles = {treadmill, wall};

        for (Object obstacle : obstacles) {
            for (Overcoming participant : participants) {
                if (obstacle instanceof Treadmill)
                    if (!participant.run(((Treadmill) obstacle).getTreadmill())) {
                        continue;
                    }
                if (obstacle instanceof Wall)
                    if (!participant.jump(((Wall) obstacle).getWall())) {
                        continue;
                    }
            }
        }
    }
}
