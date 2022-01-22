package fenHack.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import femHack.Bullet.Bullet;
import femHack.utils.Teclado;
import junit.framework.TestCase;

class TecladoTest extends TestCase{

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Order(1)
	void testReadString() {
		String espected="hello";
		
		assertEquals(espected, Teclado.readString("write:hello"));
	
	}
	
	@Test
	@Order(2)
	void testReadjson() {
		
		Bullet bullet=new Bullet(1,50,50,true,true);
		assertEquals(bullet.getAlpha(), (Teclado.readjson("write this json: {'v0' : 50,'alpha' : 50,'save' :true,'typeData' :true }")).getAlpha());
	}
	
	@Test
	@Order(3)
	void testreadInt() {
		int espected=1;
		
		assertEquals(espected, Teclado.readInt("write: 1"));
	
	}
	
	@Test
	@Order(4)
	void testReadAngle() {
		int espected=50;
		
		assertEquals(espected, Teclado.readAngle("write: 50"));
	
	}

	@Test
	@Order(5)
	void testReadYesNo() {
		boolean espected=true;
		assertEquals(espected, Teclado.readyesNo("write: Y"));
	
	}
	@Test
	@Order(6)
	void testReadJsonManual() {
		boolean espected=true;
		assertEquals(espected, Teclado.readJsonManual("write: J"));
	
	}
}
