package femHack.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import femHack.Bullet.Bullet;
import junit.framework.TestCase;

class BulletTest extends TestCase {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Order(1)
	void testCalculateH_max() {
		Bullet bullet=new Bullet(50,180,true,false);
		double espected=127.55102040816325;
		assertEquals(espected, bullet.calculateH_max());
	}

	@Test
	@Order(2)
	void testCalculateX_max() {
		Bullet bullet=new Bullet(50,180,true,false);
		double espected=-8.175026895243168;
		assertEquals(espected, bullet.calculateX_max());
	}
	
	@Test
	@Order(3)
	void testToString() {
		Bullet bullet=new Bullet(50,180,true,false);
		String espected="Bullet [id=1, v0=50, alpha=180, save=true, typeData=false, h_max=127.55102040816325, x_max=-8.175026895243168]";
		assertEquals(espected, bullet.toString());
	}
	
	@Test
	@Order(4)
	void testIncrementId() {
		Bullet bullet=new Bullet(50,180,true,false);
		int espected=3;;
		assertEquals(espected, bullet.incrementId());
	}
	

}
