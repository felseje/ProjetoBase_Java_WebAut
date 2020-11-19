package br.com.projeto.web.steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Dado;
import java.lang.reflect.Method;
import io.cucumber.datatable.DataTable;
import br.com.projeto.commons.StepExecutor;
import br.com.projeto.web.functionalities.evidence.Parameters;
import br.com.projeto.web.functionalities.CommonFuncionalities;
import io.cucumber.java.pt.Quando;

public class CommonSteps {

    private Parameters parameters = new Parameters();
    private StepExecutor stepExecutor = new StepExecutor();
    private CommonFuncionalities commonFunc = new CommonFuncionalities();

    @Dado("que acesso o site {string}")
    public void queAcessoOSite(String link) {
        Method method = stepExecutor.findMethod(commonFunc, "acessarSite", link);
        stepExecutor.execute(commonFunc, method, link);
    }

    @E("estou executando o teste")
    public void estouExecutandoOTeste(DataTable parametros) {
        parameters.estouExecutandoOTeste(parametros);
    }

    @E("clico no botão {string}")
    public void clicoNoBotão(String botao) {
        Method method = stepExecutor.findMethod(commonFunc, "clicarNoBotao", botao);
        stepExecutor.execute(commonFunc, method, botao);
    }

    @E("insiro no campo {string} o valor {string}")
    public void insiroNoCampoOValor(String campo, String valor) {
        Method method = stepExecutor.findMethod(commonFunc, "inserirValorNoCampo", campo, valor);
        stepExecutor.execute(commonFunc, method, campo, valor);
    }

    @Quando("aperto a tecla {string}")
    public void apertoATecla(String tecla) {
        Method method = stepExecutor.findMethod(commonFunc, "apertarTecla", tecla);
        stepExecutor.execute(commonFunc, method, tecla);
    }
}
