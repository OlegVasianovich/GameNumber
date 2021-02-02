package com.gamezone.guessthenumber.gameguess;

public class Game {
	public  void startGame() {
		Player oleg = new Player();
		Player serg = new Player();
		Player vova = new Player();
		Player vit = new Player();
		Player slava = new Player();

		int guessOleg = 0;
		int guessSerg = 0;
		int guessVova = 0;
		int guessVit = 0;
		int guessSlava = 0;

		boolean olegIsRight = false;
		boolean sergIsRight = false;
		boolean vovaIsRight = false;
		boolean vitIsRight = false;
		boolean slavaIsRight = false;

		int secretNumber = (int) (Math.random() * 11);
		System.out.println("Я загадал число " + secretNumber);

		while (true) {
			oleg.guess();
			serg.guess();
			vova.guess();
			vit.guess();
			slava.guess();

			guessOleg = oleg.number;
			System.out.println("предполагает число " + guessOleg);
			guessSerg = serg.number;
			System.out.println("предполагает число " + guessSerg);
			guessVova = vova.number;
			System.out.println("предполагает число " + guessVova);
			guessVit = vit.number;
			System.out.println("предполагает число " + guessVit);
			guessSlava = slava.number;
			System.out.println("предполагает число " + guessSlava);

			if (guessOleg == secretNumber) {
				olegIsRight = true;
			}
			if (guessSerg == secretNumber) {
				sergIsRight = true;
			}
			if (guessVova == secretNumber) {
				vovaIsRight = true;
			}
			if (guessVit == secretNumber) {
				vitIsRight = true;
			}
			if (guessSlava == secretNumber) {
				slavaIsRight = true;
			}
			if (olegIsRight || sergIsRight || vovaIsRight || vitIsRight || slavaIsRight) {

				System.out.println("Мы имеем счастливчика))");
				System.out.println("Олег угадал? " + olegIsRight);
				System.out.println("Серж угадал? " + sergIsRight);
				System.out.println("Вова угадал? " + vovaIsRight);
				System.out.println("Виталик угадал? " + vitIsRight);
				System.out.println("Слава угадал? " + slavaIsRight);
				System.out.println("Победитель победил побежденных!");
				break;
			} else {
				System.out.println("Тупицы!!! давайте еще раз!");
			}
		}

	}
}