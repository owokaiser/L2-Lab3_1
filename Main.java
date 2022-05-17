import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Scanner skan = new Scanner(System.in);
      Service1 s = new Service1();
      int c=4;
      String imie;
      int wiek;
      while(c!=0)
        {
          System.out.println("Co chcesz zrobic: \n"+
                        "1 - dodanie nowego studenta \n"+
                        "2 - wypisanie studentow \n"+
                        "3 - wyjście z programu");
          c=skan.nextInt();
          switch(c)
            {
                case 1:
                {
                  Scanner skan1 = new Scanner(System.in);
                  System.out.println("Podaj imie: ");
                  imie=skan1.nextLine();
                  System.out.println("Podaj wiek: ");
                  wiek=skan.nextInt();
                  s.addStudent(new Student(imie, wiek));
                }break;
              case 2:
                {
                    var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
     }
      }
                break;
              case 3:
                {
                  c=0;
                }break;
            }
            
        }
     
    } catch (IOException e) {

    }
  }
}