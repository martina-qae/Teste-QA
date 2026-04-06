package tests;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.BlogSearchPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BlogSearchTest extends BaseTest {

    @Test
    void deveRetornarResultadosParaTermoValido() {
        BlogSearchPage page = new BlogSearchPage(driver);
        page.open();
        page.searchFor("empréstimo");

        assertTrue(page.hasResults(), "Esperava resultados para a pesquisa");
    }

    @Test
    void deveExibirMensagemQuandoNaoHouverResultados() {
        BlogSearchPage page = new BlogSearchPage(driver);
        page.open();
        page.searchFor("asdf1234");

        assertTrue(page.hasNoResultsMessage(), "Esperava mensagem de nenhum resultado");
    }
}