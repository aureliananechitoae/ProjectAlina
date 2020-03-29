import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Persoane> persones = new ArrayList<>();

        persones.add(new Angajat("Mihai"));
        persones.add(new Somer("Irina"));
        persones.add(new Student("Claudiu"));

        for (Persoane p : persones) {
            System.out.println(p.name);
        }

    }}
//
//        relload();
//    }
//
//        public static void relload (){
//            String giveName = null;
//
//            Scanner in = new Scanner(System.in);
//            System.out.println("Ce persoana doriti sa adaugati ? *** Student * Somer * Angajat ");
//             giveName = in.nextLine();
//        //while (giveName.equals("Student") || giveName.equals("Somer") || giveName.equals("Angajat")){
//            if (giveName.equals("Somer")) {
//                persones.add(addSomer());
//                relload();
//            } else if (giveName.equals("Student")){
//                persones.add(addStudent());
//                break;
//            }else if (giveName.equals("Angajat")){
//                persones.add(addAngajat());
//                break;
//            }
//
//        }
//
//    }
//
//        public static Persoane addAngajat () {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Introduceti numele Angajatului :");
//            String name = input.nextLine();
//            return new Angajat(name);
//        }
//        static Persoane addStudent () {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Introduceti numele Studentului :");
//            String name = input.nextLine();
//            return new Student(name);
//        }
//        static Persoane addSomer () {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Introduceti numele Somerului :");
//            String name = input.nextLine();
//            return new Somer(name);
//        }
//
//
//
//}