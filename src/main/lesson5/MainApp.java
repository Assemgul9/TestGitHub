package lesson5;

public class MainApp {
    public static void main(String[] args){
        Emploee emploee = new Emploee("Борис Пастернак","главный редактор","doctor@mail.ru",556565,565652,70);
     emploee.info();


        Emploee[]empArray=new Emploee[5];
        empArray[0]=new Emploee("Александр Пушкин","Писатель","iamhateDantes@mail.ru",50211,25362,37);
        empArray[1]=new Emploee("Юрий Лермонтов","писатель","hero@mail.ru",245,5625,26);
        empArray[2]=new Emploee("Владимир Маяковский","писатель","passport@mail.ru",2565,2586,36);
        empArray[3]=new Emploee ("Джек Лондон","писатель","seaWoolf@gmail.com",1541,2655,40);
        empArray[4]=new Emploee("Оскар Уальд","писатель","portrait@gmail.com",15454,25647,46);
        for (int i = 0; i < empArray.length; i++) {
            if(empArray[i].age>=40){
                empArray[i].info();
            }

        }



    }
}
