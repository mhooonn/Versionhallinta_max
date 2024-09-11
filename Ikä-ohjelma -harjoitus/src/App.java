public class App {
    public static void main(String[] args) throws Exception {
        
        int ika = 45;
        // Tulostusehdot

        // if (ika >= 0 && ika < 18){
        //     System.out.println("Olet alaikäinen");
        // }
        // else {
        //     System.out.println("Olet aikuinen");
        // }

        // if (ika >  0 && ika < 18) {
        //     System.out.println("Olet alaikäinen");
        // }
        // else if (ika >= 65) {
        //     System.out.println("Olet eläkeläinen");
        // }
        // else {
        //     System.out.println("Olet aikuinen");
        // }

        if (ika > 0 && ika < 18) {
            System.out.println("olet alaikäinen");
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
            if (ika == 16 || ika == 17) {
                System.out.println("Saat ajaa kevaria");
            }
            

        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");
        }
        
        if (ika == 18) {
            System.out.println("Olet juuri tullut 18-vuotiaaks ja saat ajaa autoa");
        }
        if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60 || ika == 70 || ika == 80 || ika == 90) {
            System.out.println("Onnittelut tasavuosikymmenestä");
        }
        if (ika == 100) {
            System.out.println("************");
            System.out.println("*Onnittelut*");
            System.out.println("************");
        }
        if (ika >= 58 && ika < 65) {
            System.out.println("Voit mennä varhaiseläkkeelle");
        }
        if (ika == 65) {
            System.out.println("Hyviä eläkepäiviä");
        }
        if (ika >= 40 && ika <= 50) {
            System.out.println("Parasta keski-ikää");
        }

        else {
            System.out.println("Olet aikuinen");
            }
       










    }
}
