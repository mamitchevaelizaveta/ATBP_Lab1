package com.example;

/*
Вариант №16: Возрастной ценз в кино.
1.  Разработайте функцию, которая принимает возраст зрителя и возрастной рейтинг фильма (0+, 6+, 12+, 16+, 18+).
Функция возвращает «разрешено» или «запрещено».
Также функция должна учитывать наличие сопровождающего взрослого (для рейтингов до 16+ включительно это снимает ограничения).
2.  Учтите обработку ошибок: возраст должен быть в диапазоне от 0 до 100 лет.
Рейтинг фильма должен быть из списка допустимых.
3.  Проверьте пограничные случаи (зрителю ровно 12 лет для рейтинга 12+),
влияние сопровождающего и некорректно введенный возраст.
* */

public class FilmRatingAgeChecker {
    public String ageCheck(Integer viewerAge, Integer movieRating, Boolean isAccompanyingAdultExists) {

        if (viewerAge < 0 || viewerAge > 100) {
            return "запрещено";
        }

        System.out.println("Возраст зрителя: " + viewerAge);
        System.out.println(isAccompanyingAdultExists ? "Сопровождающий есть" : "Сопровождающего нет");

        String response;

        switch (movieRating) {
            case 0:
                System.out.println("Возрастной рейтинг: +0");
                response = (viewerAge >= 0 || isAccompanyingAdultExists) ? "разрешено" : "запрещено";
                break;
            case 6:
                System.out.println("Возрастной рейтинг: +6");
                response = (viewerAge >= 6 || isAccompanyingAdultExists) ? "разрешено" : "запрещено";
                break;
            case 12:
                System.out.println("Возрастной рейтинг: +12");
                response = (viewerAge >= 12 || isAccompanyingAdultExists) ? "разрешено" : "запрещено";
                break;
            case 16:
                System.out.println("Возрастной рейтинг: +16");
                response = (viewerAge >= 16) ? "разрешено" : "запрещено";
                break;
            case 18:
                System.out.println("Возрастной рейтинг: +18");
                response = (viewerAge >= 18) ? "разрешено" : "запрещено";
                break;
            default:
                return "Введено некорректное значение возрастного ограничения.";
        }
        return response;
    }
}