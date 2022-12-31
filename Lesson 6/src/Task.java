public class Task {
    public static void task() {

        //    1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
        //    Добавьте метод, который позволяет начислять сумму на кредитную карточку.
        //    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
        //    Добавьте метод, который выводит текущую информацию о карточке.
        //    Напишите программу, которая создает три объекта класса CreditCard у
        //    которых заданы номер счета и начальная сумма.

        //    Тестовый сценарий для проверки:
        //    Положите деньги на первые две карточки и снимите с третьей.
        //    Выведите на экран текущее состояние всех трех карточек.

        CreditCard card1 = new CreditCard("1111 1111 1111 1111", 0);      // Создание объектов
        CreditCard card2 = new CreditCard("2222 2222 2222 2222", 500);    // класса CreditCard
        CreditCard card3 = new CreditCard("3333 3333 3333 3333", 1000);

        card1.replenishment(); // Пополнение первой карты
        card2.replenishment(); // Пополнение второй карты
        card3.writeOff();      // Списание из третьей карты
        card1.information();   // Информация по первой карте
        card2.information();   // Информация по второй карте
        card3.information();   // Информация по третьей карте
    }
}