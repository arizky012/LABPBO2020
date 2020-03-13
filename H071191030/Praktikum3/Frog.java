//Tgs Praktikum kls C No.1
class Frog {
    private String color;
    private int jump;

    public Frog(String color, int jump) {
        this.color = color;
        this.jump = jump;
    }

    public boolean getRun(Field field) {
        if (field != null) {
            return true;
        } else {
            return false;
        }

    }

    public void getProcess(Field field) {
        if (getRun(field)) {

            for (int i = 0; i < field.getBambooHeight().length; i++) {
                if (jump - (field.getBambooHeight(i)) > 0) {
                    System.out.println(
                            color + " frog succeed to jump bamboo number " + (i + 1) + " for jumping as high as " + jump
                                    + " while the bamboo length is " + field.getBambooHeight(i));

                } else {
                    System.out.println(color + " frog failed to jump bamboo number " + (i + 1));
                    break;

                }

            }
        } else {
            System.out.println("No such field");
        }

    }

    public boolean compare(Frog frog) {

        return jump > frog.jump ? true : false;

    }

    public static int getMax(Frog[] frg) {
        int max = frg[0].jump;

        for (int i = 1; i < frg.length; i++) {
            max = frg[i].jump > max ? frg[i].jump : max;
        }

        return max;

    }

}