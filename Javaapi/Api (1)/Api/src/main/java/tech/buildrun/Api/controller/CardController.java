package tech.buildrun.Api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tech.buildrun.Api.model.Card;
import tech.buildrun.Api.repository.CardRepository;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/cards")
@CrossOrigin
public class CardController {

    @Autowired
    private CardRepository repository;

    @PostMapping
    public Card criarCard(
            @RequestParam String nome,
            @RequestParam String descricao,
            @RequestParam Double preco,
            @RequestParam(required = false) MultipartFile imagem
    ) throws Exception {

        String caminhoImagem = "";

        if (imagem != null && !imagem.isEmpty()) {
            File pasta = new File(System.getProperty("user.dir") + "/uploads");
            if (!pasta.exists()) pasta.mkdirs();

            String nomeArquivo = System.currentTimeMillis() + "_" + imagem.getOriginalFilename();
            File arquivo = new File(pasta, nomeArquivo);
            imagem.transferTo(arquivo);

            caminhoImagem = "uploads/" + nomeArquivo;
        }

        Card card = new Card();
        card.setNome(nome);
        card.setDescricao(descricao);
        card.setPreco(preco);
        card.setImagem(caminhoImagem);

        return repository.save(card);
    }

    @GetMapping
    public List<Card> listar() {
        return repository.findAll();
    }
}