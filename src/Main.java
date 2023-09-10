import java.util.Scanner;

public class Main {
    public static String CodeLandUsernameValidation(String str) {
        int len = str.length();

        if (len < 3 || len > 25) {
            return "O Nome nao pode ser maior que 25 caracteres nem menor que 3 caracteres";
        }

        if (!Character.isLetter(str.charAt(0))) {
            return "O nome tem de comecar com o primeiro caracter sendo Letra";
        }

        for (int i = 0; i < len; i++) {

            Character character = str.charAt(i);

            if (!Character.isLetterOrDigit(character) && character != '_') {
                return "O nome so podera ter letras, numeros e _";
            }
        }

        return "usarname cadastrado com sucesso " + str + "!";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(CodeLandUsernameValidation(scanner.nextLine()));
        scanner.close();
    }
}