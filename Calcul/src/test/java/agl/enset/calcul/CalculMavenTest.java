package agl.enset.calcul;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class CalculMavenTest extends TestCase {
	private CalculMaven maven;

	@Before
	public void setUp() throws Exception {
		super.setUp();
		maven=new CalculMaven();
	}
	
	public void testSomme() {
		assertTrue(maven.somme(20, 5)==25);
	}
	public void testProduit() {
		assertTrue(maven.produit(20, 5)==100);
	}
	
}
