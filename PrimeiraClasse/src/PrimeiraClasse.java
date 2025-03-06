public class PrimeiraClasse {

    public static void main(String[] args) {

        System.out.println("Olá Bruno Daniel");

        Cliente cliente = new Cliente();

        cliente.cadastrarEndereco("São Paulo - SP, Brasil");
        cliente.setCodigo(1);
        cliente.imprimirEndereco();
        String end = cliente.retornarNomeCliente();
        int valor = cliente.getValorTotal();

        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getEndereco());
        System.out.println(end);
        System.out.println(valor);
    }
}