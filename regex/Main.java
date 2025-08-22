public class Main{

    public static void main(String[] args) {

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        String email = "azer@zertert.ert";

        if(email.matches(regex)){
            System.out.println("email valide " + email.matches(regex));
        }
        else{
            System.err.println("email invalide " + email.matches(regex));
        }

    }

}