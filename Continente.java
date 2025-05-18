import java.util.ArrayList;
import java.util.List;

public class Continente {
    private List<Pais> listaPaises = new ArrayList<>();

    public void adicionarPaises(Pais pais) {
        listaPaises.add(pais);
    }

    public Pais maiorPais() {
        if (listaPaises.isEmpty()) {
            return null;
        }

        Pais maior = listaPaises.get(0);
        for (Pais pais : listaPaises) {
            if (pais.getDimensao() > maior.getDimensao()) {
                maior = pais;
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil", 8515767);
        Pais argentina = new Pais("Argentina", 2780400);
        Pais paraguai = new Pais("Paraguai", 406752);
        Pais uruguai = new Pais("Uruguai", 176215);

        brasil.adicionarPaisesDeFronteira(argentina);
        brasil.adicionarPaisesDeFronteira(paraguai);
        argentina.adicionarPaisesDeFronteira(brasil);
        argentina.adicionarPaisesDeFronteira(paraguai);
        paraguai.adicionarPaisesDeFronteira(brasil);
        paraguai.adicionarPaisesDeFronteira(argentina);

        Continente americaDoSul = new Continente();
        americaDoSul.adicionarPaises(brasil);
        americaDoSul.adicionarPaises(argentina);
        americaDoSul.adicionarPaises(paraguai);
        americaDoSul.adicionarPaises(uruguai);

        Pais maior = americaDoSul.maiorPais();
        if (maior != null) {
            System.out.println("Maior país do continente: " + maior.getNome());
        }

        System.out.println("Brasil faz fronteira com a Argentina? " + brasil.fazFronteira(argentina));
        System.out.println("Brasil faz fronteira com o Uruguai? " + brasil.fazFronteira(uruguai));

        List<Pais> comuns = brasil.fronteirasIguais(argentina);
        System.out.print("Fronteiras em comum entre Brasil e Argentina: ");
        for (Pais p : comuns) {
            System.out.print(p.getNome() + " ");
        }
        System.out.println();
    }
}


