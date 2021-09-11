package pro.sky.java.course1.lesson6;

public class Lesson6 {
    public static void main(String[] args) {
//Task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
        System.out.println("ФИО сотрудника – " + fullName);

//Task2
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullNameUpperCase);
//Task3
        String fullNameForPass = fullName.replace(' ', ';');
        System.out.println("Данные ФИО сотрудника для административного отдела – " + fullNameForPass);
//Task4
        String fullName1 = "Иванов Семён Семёнович";
        String fullName3 = fullName1.replace('ё', 'e');
        System.out.println(fullName3);
        if (fullName1.contains("ё")) {
            char[] fullName2 = fullName1.toCharArray();
            for (int i = 0; i < fullName2.length; i++) {

                if (fullName2[i] == 'ё') {
                    fullName2[i] = 'е';
                }
                System.out.print(fullName2[i]);
            }
            System.out.println();
            StringBuilder sb = new StringBuilder();
            sb.append(fullName2);
            System.out.println("Данные ФИО сотрудника – " + sb);
        }
//Только что произошло натягивание огромной совы на огромный глобус, с replace прекрасно работает код. Скорее всего подсказки смещены  split и contain относятся к 5 заданию
//Task 5
//5.1
        String fullName11 = "Ivanov Ivan Ivanovich";
        String[] fullNameArr = fullName11.split(" ");
        String firstName1 = fullNameArr[1];
        String middleName1 = fullNameArr[2];
        String lastName1= fullNameArr[0];
        System.out.println("Имя сотрудника – " + firstName1);
        System.out.println("Отчество сотрудника – " + middleName1);
        System.out.println("Фамилия сотрудника – " + lastName1);
        //5.2
        String lastName11 = fullName11.substring(0, fullName11.indexOf(' '));
        String firstName11 = fullName11.substring(fullName11.indexOf(' '), fullName11.lastIndexOf(' '));
        String middleName11 = fullName11.substring(fullName11.lastIndexOf(' '));
        System.out.println("Фамилия сотрудника – " +lastName11);
        System.out.println("Имя сотрудника – " + firstName11);
        System.out.println("Отчество сотрудника – " +middleName11);
//Task6
        String fullNameLower = "ivanov ivan ivanovich";

        char[] fullNameLowerArr = fullNameLower.toCharArray();
        fullNameLowerArr[0] = Character.toUpperCase(fullNameLowerArr[0]);
        for (int i = 0; i < fullNameLowerArr.length; i++) {

            if (fullNameLowerArr[i] == ' ') {
                fullNameLowerArr[i+1] = Character.toUpperCase(fullNameLowerArr[i + 1]);
            }
        }
        String fullNameUpperCase1 = new String(fullNameLowerArr);
        System.out.println(fullNameUpperCase1);

//Task7
        String taskSevenOne = "135";
        String taskSevenTwo = "246";
        StringBuilder taskSevenBuild = new StringBuilder(taskSevenOne + taskSevenTwo);
        char c = taskSevenBuild.charAt(1);
        char d = taskSevenBuild.charAt(4);
        char e = taskSevenBuild.charAt(2);
        char f = taskSevenBuild.charAt(5);
        taskSevenBuild.deleteCharAt(1);
        taskSevenBuild.deleteCharAt(1);
        taskSevenBuild.deleteCharAt(3);
        taskSevenBuild.deleteCharAt(2);
        taskSevenBuild.append(c);
        taskSevenBuild.append(d);
        taskSevenBuild.append(e);
        taskSevenBuild.append(f);
        System.out.println(taskSevenBuild);
//Task8
        String taskEight = "aabccddefgghiijjkk";
        StringBuilder taskEightBuild = new StringBuilder();
        char[] taskEightArr = taskEight.toCharArray();
            for (int i = 0; i < taskEightArr.length - 1; i++) {
            if (taskEightArr[i] == taskEightArr[i+1]) {
                taskEightBuild.append(taskEightArr[i]);
            }
        }
        System.out.println(taskEightBuild);
    }
}


