import java.util.ArrayList;
import java.util.List;

class Bootcamp {
    private String nome;
    private String descricao;
    private final List<Conteudo> conteudos = new ArrayList<>();
    private final List<Dev> devsInscritos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void inscreverDev(Dev dev) {
        devsInscritos.add(dev);
        dev.inscreverBootcamp(this);
    }
}