package org.projeto01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class MinhasRotas {
    public static void main(String[] args) {SpringApplication.run(MinhasRotas.class, args);}

    @Autowired
    private String apresentacaoSite;
    @Autowired
    private String descricao;


    @GetMapping("/")
    public String home(){

        return apresentacaoSite + descricao;
    }

    @GetMapping("/rota1/{nome}")
    public String rota1(@PathVariable String nome) {


        return "Saudações " + nome + ". Bem vindo ao meu site" ;
    }
    @GetMapping("/rota2/{num1}/{num2}")
    public String rota2(@PathVariable int num1,@PathVariable int num2){
        int soma = num1 + num2;

        return "A soma é igual a: " + soma;

    }

}