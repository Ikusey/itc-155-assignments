
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class octagonTest {
	
	

	@Test
	void test() {
		Octagon oct = new Octagon(3);
		assertEquals(43.45, oct.getArea());
		assertEquals(24, oct.getPerimeter());
		assertEquals(3, oct.getSideLength());
	}

}
