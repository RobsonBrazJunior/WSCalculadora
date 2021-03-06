package servico;

import javax.jws.WebService;
import javax.jws.WebMethod;
import negocio.Calculadora;

@WebService(serviceName = "ServicoCalculadora")
public class ServicoCalculadora {

    @WebMethod(operationName = "somar")
    public double processaSoma (double termo1, double termo2) {
        return Calculadora.somar(termo1, termo2);
    }
    
    @WebMethod(operationName = "subtrair")
    public double processaSubtracao (double termo1, double termo2) {
        return Calculadora.subtrair(termo1, termo2);
    }
    
    @WebMethod(operationName = "multiplicacao")
    public double processaMultiplicacao (double termo1, double termo2) {
        return Calculadora.multiplicar(termo1, termo2);
    }
    
    @WebMethod(operationName = "dividir")
    public double processaDivisao (double termo1, double termo2) {
        return Calculadora.dividir(termo1, termo2);
    }
}
