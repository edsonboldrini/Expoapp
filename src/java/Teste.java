
import domain.DAO.ClienteDAOImpl;
import domain.models.Cliente;
import domain.util.Conexao;
import java.text.DateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yagoz
 */
public class Teste {
    public static void main(String[] args) {
        try{
            Conexao.getEntityManager();
            System.out.println("Conexao Efetuada");
            ClienteDAOImpl controller = new ClienteDAOImpl();
            Date data = new Date();
            //Cliente cliente1 = new Cliente(data, 'M', "14166907786", 3, "yagozt", "2213", "yagozt.henrique@gmail.com", data, "Yago", "a", "a", "29166510");
            controller.removeByCpf("14166907785");
            //System.out.println("Cliente removido");
            //Cliente cliente2 = new Cliente(data, 'M', "14166907785", 3, "yagozt", "2213", "yagozt.henrique@gmail.com", data, "Yago", "a", "a", "29166510");
            //Cliente cliente3 = new Cliente(data, 'M', "14166907787", 3, "yagozt", "2213", "yagozt.henrique@gmail.com", data, "Yago", "a", "a", "29166510");
            //controller.inserir(cliente1);
            //controller.inserir(cliente3);
            System.out.println("Clientes Inseridos");
            for(Cliente a:controller.listar(Cliente.class)){
                System.out.println("Cpf" + a.getCpf());
            }
            Conexao.close();
            System.out.println("Conexao Fechada");
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
