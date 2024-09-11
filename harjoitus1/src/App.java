public class App {
    public static void main(String[] args) throws Exception {
        
        //Kännykkä, tutkitaan, onko päällä vai ei.

        boolean paalla;
        int paalla2; //0 = ei, 1 = on päällä, 2 = virhetila

        paalla = true;

        if (paalla == true){
            System.out.println("Kännykkä on päällä");
        }
        else{
            System.out.println("Kännykkä ei ole päällä");
        }
    
        // Tutkitaan, onko hellettä, eli lämpötila 24 tai yli

        int lampotila = 20;

        if (lampotila >= 24){
            System.out.println("on hellettä");
        }
        else{
            System.out.println("ei ole hellettä");
        }

        // ==yhtäsuuri
        //!= erisuuri
        // < ja >
        // <= pienempi tai yhtäsuuri

        System.out.println("");
        System.out.println("*********************");
        System.out.println("");

        int age = 20;

        // Print "minor", if age is less than 18

        if (age < 18){
            // if the statement is true
            System.out.println("minor");
        }
        else{
            System.out.println("adult");
        }

        int n1 = 10;
        int n2 = 20;

        // if n1 and n2 are equal

        if (n1 == n2) {
            System.out.println("n1 and n2 are equal");
        }

        // if n1 is rqual or less than n2
        if (n1 <= n2) {
            System.out.println("n1 is equal or less than n2");
        }

        // if n1 is 100 and n1 is more than n2
        if (n1 == 100 && n1 > n2) {
            System.out.println("n1 is 100 and n1 is more than n2");
        }

        String os = "Windows";

        // Os is windows
        // if (os.equals("Windows")) {
        //     System.out.println("Os is Windows");
        // }
        
        // // Os is not windows
        // if (!os.equals("Windows")) {
        //     System.out.println("Os is not Windows");
        //}

        // if (os.equalsIgnoreCase("Windows")) {
        //     System.out.println("Windows");
        // }
        // if (os.equals("Linux")) {
        //     System.out.println("Linux");
        // }
        // if (os.equals("Mac")) {
        //     System.out.println("Mac");
        // }

        int memory = 32;

        if (os.equals("Windows")) {
            System.out.println("Os is Windows");
            if (memory > 16) {
                System.out.println("Memory is more than 16");
            }
        }
        else {
            System.out.println("Not windows");
        }




        }
        
    }

