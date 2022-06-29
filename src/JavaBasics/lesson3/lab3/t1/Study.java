package JavaBasics.lesson3.lab3.t1;


// Допишите в класс «Study» конструктор, что будет принимать один параметр и будет устанавливать
// значение этого параметра в поле «course». Создайте объект класса «Study».
// В качестве значения для поля «course» установите текст: «Изучение Java - это просто!».
// Обратитесь к методу «printCourse» для вывода значения поля «course».

class Study {
    private final String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");

        System.out.println(study.printCourse());
    }
}




