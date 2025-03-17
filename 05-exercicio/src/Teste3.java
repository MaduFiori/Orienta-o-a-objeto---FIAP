public class Teste3 {
    public static void main(String[] args) {

        BilheteUnico[] bilhete = new BilheteUnico[3];

        // 1 forma
        Usuario u1 = new Usuario("maria", 22244423, "E");
        bilhete[0] = new BilheteUnico(null);

        // 2 forma
        bilhete[1] = new BilheteUnico(new Usuario("Bruno", 239664, "E"));
        bilhete[2] = new BilheteUnico(new Usuario("Luffy", 239664, "E"));

        for(BilheteUnico b:bilhete){
            System.out.println(b.usuario.nome);
        }
    }   
}
