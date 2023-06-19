package aplicacao;

import entidades.*;
import entidades.enums.Sexo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Programa {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        var dadosPessoaisLuiz = new DadosPessoais("Luiz", "7021455485", LocalDate.parse("27/01/1999", formatter), Sexo.M.getDescricao());

        var enderecoLuiz = new Endereco("Rua rua", "24", "A", "Corrego", "Recife", "Pernambuco");

        var contatoLuiz = new Contato("luiz@gmail.com", 8199999999L, 8188888888L, true);

        var profissionaisLuiz = new DadosProfissionais("Desempregado", "", 0d, false);

        var adicionaisLuiz = new DadosAdicionais( new ArrayList<>(), 1500d, 2000d);
        adicionaisLuiz.getHabilidades().addAll(Arrays.asList("Java", "Spring"));

        var completo = new DadosCompleto(dadosPessoaisLuiz, enderecoLuiz, contatoLuiz, profissionaisLuiz, adicionaisLuiz);

        var arquivo = new File("/home/lucarlosmelo/Documentos", "cadastro.csv");
        try {
            arquivo.createNewFile();

            var saida = new FileOutputStream(arquivo);

            ByteArrayOutputStream byteOutput = new ByteArrayOutputStream();
            byteOutput.write(completo.toString().getBytes());
            byteOutput.writeTo(saida);

            saida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
