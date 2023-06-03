public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(generateRandomAge(),10));
        System.out.println(ageAndTemperature(19, 6));
        System.out.println(ageAndTemperature(12,28));
        System.out.println(ageAndTemperature(87, 35));
        System.out.println(ageAndTemperature(65, 24));
        System.out.println(ageAndTemperature(23, -15));
    }

    public static String ageAndTemperature(int age, int temperature) {
        if ((age >= 20 && age < 45) && (temperature >= -20 && temperature < 30)) {
            return "Можно идти гулять.";
        } else if (age < 20 && (temperature >= 0 && temperature < 28)) {
            return "Можно идти гулять.";
        } else if (age > 45 && temperature >= -10 && temperature < 25) {
            return "Оставайтесь дома";
        } else {
            return "Оставайтесь дома";
        }

    }
public static int generateRandomAge(){
        final int max = 100;
        return (int) (Math.random() * max);

}
}
