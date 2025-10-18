import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteEmail{
    @Test
    @DisplayName("Teste de email com @")
    public void testar_email_com_arroba(){
        String email_com_arroba = "email_teste@dominio.com.br";
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail(email_com_arroba);
        Assertions.assertTrue(Pessoa.emailValid(email_com_arroba));
    }

    @Test
    @DisplayName("Teste de email sem @")
    public void testar_email_sem_arroba(){
        String email_formato_invalido = "email_sem_arroba_teste_dominio.com.br";
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail(email_formato_invalido);
        Assertions.assertFalse(Pessoa.emailValid(email_formato_invalido));
    }

    @Test
    @DisplayName("Teste de email com mais de 50 caracteres")
    public void testar_email_mais_50_caracteres(){
        String email_tamanho_invalido = "email_com_tamanho_acima_de_50_caracteres@dominio.com.br";
        Pessoa pessoa = new Pessoa();
        pessoa.setEmail(email_tamanho_invalido);
        Assertions.assertEquals(false, Pessoa.emailValid(email_tamanho_invalido));
    }
}