package ch08.sec02.exam01;

public class Car {
		Tire frontLeftTire = new HankookTire();
		Tire frontRightTire = new HankookTire();
		Tire BackLeftTire = new HankookTire();
		Tire BackRightTire = new HankookTire();

		void run() {
			frontLeftTire.roll();
			frontRightTire.roll();
			BackLeftTire.roll();
			BackRightTire.roll();
		}
	}


