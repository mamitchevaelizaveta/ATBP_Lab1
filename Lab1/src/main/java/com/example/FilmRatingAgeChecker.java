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

    public String ageCheck (Integer viewerAge, Integer movieRating, Boolean isAccompanyingAdultExists){
        String response = (viewerAge < 0 || viewerAge > 100) ? "запрещено" : " "; // создание переменной responce,
        // проверка корректности возраста
        System.out.print("Возрастной рейтинг: ");
        switch(movieRating){
            case 0:
                System.out.println("0+");
                response = viewerAge >= 0 ? "разрешено" : "запрещено";
                break;
            case 6:
                System.out.println("6+");
                response = viewerAge >= 6 ? "разрешено" : "запрещено";
                break;
            case 12:
                System.out.println("12+");
                response = viewerAge >= 12 ? "разрешено" : "запрещено";
                break;
            case 16:
                System.out.println("16+");
                response = (viewerAge >= 16 || isAccompanyingAdultExists) ? "разрешено" : "запрещено";
                break;
            case 18:
                System.out.println("18+");
                response = (viewerAge >= 18 || isAccompanyingAdultExists) ? "разрешено" : "запрещено";
                break;
            default:
                break;
        }
        return response;
    }
}
