package triangulo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrianguloTest {


    private Triangulo triangulo;

    @BeforeEach
    void setTriangulo(){
        triangulo = new Triangulo();
    }

    @Test
    void testVerificaSeEquilatero(){
        String equilatero = triangulo.verificaTriangulo(3,3,3);
        String esperado = "O triangulo eh equilatero";

        assertEquals(esperado,equilatero);
    }

    @Test
    void testVerificaSeIsoceles(){
        String equilatero = triangulo.verificaTriangulo(2,3,2);
        String esperado = "O triangulo eh isosceles";

        assertEquals(esperado,equilatero);
    }

    @Test
    void testVerificaSeNaoETriangulo(){
        String equilatero = triangulo.verificaTriangulo(1,2,3);
        String esperado = "Nao eh um triangulo";

        assertEquals(esperado,equilatero);
    }

    @Test
    void testVerificaSeNaoEEscaleno(){
        String equilatero = triangulo.verificaTriangulo(7,11,9);
        String esperado = "O triangulo eh escaleno";

        assertEquals(esperado,equilatero);
    }
}
