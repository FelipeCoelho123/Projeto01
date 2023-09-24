package org.projeto01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public  class Config {

    @Bean
    public String apresentacaoSite() {
        return "<h1>Projeto de Rotas </h1>" + "Nome: Felipe Junior Coelho Santos <br>" + "RGM: 31360904 <br><br>"
                ;
    }

    @Bean
    public String descricao() {
        return " A rota 1 irá receber um texto e vai dizer saudações. <br>Exemplo: <b>localhost:3500/rota1/Prof. Vinicius</b> " +
                "<br> A rota 2 funciona como calculadora, Recebe 2 números e faz a soma. <br>Exemplo: <b>localhost:3500/rota2/2/2</b> ";
    }

}