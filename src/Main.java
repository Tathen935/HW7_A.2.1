public class Main {
    public static void main(String[] args) {
        Team olympics = new Team("Olympics Team");
        Team asia = new Team("Team Asia");
        Team africa = new Team("Team Africa");
        Team afghanistan = new Team("Team Afghanistan");
        Team china = new Team("Team China");
        Team womensChina = new Team("Team China Women");
        Team menChina = new Team("Team China Men");
        Team europe = new Team("Team Europe");
        Team germany = new Team("Team Germany");
        Team womensGermany = new Team("Team Germany Women");
        Team menGermany = new Team("Team Germany Men");
        Team italy = new Team("Team Italy");
        Team womensItaly = new Team("Team Italy Women");
        Team menItaly = new Team("Team Italy Men");
        Team southAmerica = new Team("Team South America");

        Sport teakwondo = new Sport("Teakwondo", 3, 6);
        Sport waterpolo = new Sport("Waterpolo", 3, 6);
        Sport artisticGymnastic = new Sport("Artistic Gymnastic", 3, 6);
        Sport shooting = new Sport("Shooting", 3, 6);
        Sport cycling = new Sport("Cycling", 3, 6);
        Sport tennis = new Sport("Tennis", 3, 6);
        Sport tableTennis = new Sport("Table Tennis", 3, 6);
        Sport footballGermany = new Sport("Football Germany", 3, 6);
        Sport alpineSki = new Sport("Alpine Ski", 3, 6);
        Sport footballItaly = new Sport("Football Italy", 3, 6);
        Sport swimming = new Sport("Swimming", 3, 6);

        olympics.add(asia);
        olympics.add(africa);
        olympics.add(europe);
        olympics.add(southAmerica);

        asia.add(afghanistan);
        asia.add(china);
        europe.add(germany);
        europe.add(italy);

        china.add(womensChina);
        china.add(menChina);
        germany.add(womensGermany);
        germany.add(menGermany);
        italy.add(womensItaly);
        italy.add(menItaly);

        womensChina.add(teakwondo);
        womensChina.add(waterpolo);
        womensChina.add(artisticGymnastic);
        menChina.add(shooting);

        womensGermany.add(cycling);
        womensGermany.add(tennis);
        menGermany.add(tableTennis);
        menGermany.add(footballGermany);

        womensItaly.add(alpineSki);
        menItaly.add(footballItaly);
        menItaly.add(swimming);

        System.out.println("Number of european Athletes Total: " + europe.getNumberOfAthletesTotal());
        System.out.println("Number of european Goldmedals Total: " + europe.getNumberOfGoldMedalsTotal());
        System.out.println("");
        olympics.getNumberOfAthletes();
        System.out.println("");
        olympics.getNumberOfGoldMedals();
    }
}