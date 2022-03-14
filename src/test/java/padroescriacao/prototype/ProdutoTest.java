package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Produto produto = new Produto(123123, "Sapato comum", new Tipo("Calcado", 1), "Batata");

        Produto produtoClone = produto.clone();
        produtoClone.setCodigo(456);
        produtoClone.setNome("Sapato Clonado");
        produtoClone.getTipo().setCodigotipo(2);

        assertEquals("Produto{codigo=123123, nome='Sapato comum', tipo=Tipo{descricao='Calcado', codigotipo=1}, marca='Batata'}", produto.toString());
        assertEquals("Produto{codigo=456, nome='Sapato Clonado', tipo=Tipo{descricao='Calcado', codigotipo=2}, marca='Batata'}", produtoClone.toString());
    }
}