package bad.robot.unicorn.integration;

import bad.robot.unicorn.Orientation;
import bad.robot.unicorn.Unicorn;
import bad.robot.unicorn.neopixel.NeoPixelDisplayMatrix;
import bad.robot.unicorn.shape.Shape;
import bad.robot.unicorn.shape.Arrow;
import bad.robot.unicorn.shape.Cross;
import org.junit.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static bad.robot.unicorn.Sleep.sleep;
import static java.awt.Color.*;
import static java.util.concurrent.TimeUnit.SECONDS;

public class OrientationIntegrationTest {

	@Test
	public void shouldShowArrowThenRotate() {
		Unicorn unicorn = new NeoPixelDisplayMatrix();
		Shape arrow = new Arrow();
		Shape cross = new Cross();

		unicorn.rotate(Orientation.GPIO_UP);
		arrow.draw(green, unicorn);
		sleep(1, SECONDS);

		cross.draw(red, unicorn);
		sleep(1, SECONDS);

		unicorn.rotate(Orientation.GPIO_RIGHT);
		arrow.draw(orange, unicorn);
		sleep(1, SECONDS);
		cross.draw(red, unicorn);
		sleep(1, SECONDS);

		unicorn.rotate(Orientation.GPIO_DOWN);
		arrow.draw(green, unicorn);
		sleep(1, SECONDS);
		cross.draw(red, unicorn);
		sleep(1, SECONDS);

		unicorn.rotate(Orientation.GPIO_LEFT);
		arrow.draw(green, unicorn);
		sleep(1, SECONDS);
		cross.draw(red, unicorn);
	}

	public static void main(String... args) {
		new OrientationIntegrationTest().shouldShowArrowThenRotate();
	}

}
