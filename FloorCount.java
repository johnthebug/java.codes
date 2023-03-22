public class FloorCount {

    static int findFloorCount(int chef,int chefina) {
        Integer count = 0;
        chef -= 1;
        chefina -= 1;
        count = (chef/10) - (chefina/10);
        return Math.abs(count);
    }

    public static void main(String[] args) {
        int chef = 81;
        int chefina = 80;
        int num = findFloorCount(chef,chefina);
        System.out.println("The Chef needs to climb "+num+" floor to reach Chefina room");
    }
}
