
import domain.DAO.ClienteDAOImpl;
import domain.DAO.EmpresaDAOImpl;
import domain.models.Bairro;
import domain.models.Cliente;
import domain.models.Empresa;
import domain.util.Conexao;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
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
//            ClienteDAOImpl controller = new ClienteDAOImpl();
//            EmpresaDAOImpl controllerEmpresa = new EmpresaDAOImpl();
//            LocalDate data = LocalDate.now();
////            Cliente cliente1 = new Cliente(data, 'M', "14166907786", 3, "yagozt", "2213", "yagozt.henrique@gmail.com", data, "Yago", "a", "a", "29166510");
////            Cliente cliente = new Cliente(data, 'M', "14166907786", "yagozt", "2213", "yagozt.henrique@gmail.com", "Yago", "a", "A", "29166510", new Bairro(3));
////            //controller.removeByCpf("14166907785");
////            Cliente cliente = controller.getByCpf("14166907787");
////            controller.remove(cliente);
////            //System.out.println("Cliente removido");
////            Cliente cliente2 = new Cliente(data, 'M', "14166907785", 3, "yagozt", "2213", "yagozt.henrique@gmail.com", data, "Yago", "a", "a", "29166510");
//            Cliente cliente3 = new Cliente(data, 'M', "14166907783", "teste", "teste", "teste.henrique@gmail.com", "teste", "a", "A", "29166510", new Bairro(5));
//            Empresa empresa = new Empresa("teste", "11111111", LocalDate.of(1994, Month.MARCH, 22), "teste", "teste", "teste", "tese", "teste", "teste", "11111", new Bairro(10));
//            controller.inserir(cliente3);
//            controllerEmpresa.inserir(empresa);
//            controller.inserir(cliente3);
//            System.out.println("Clientes Inseridos");
//            for(Cliente a:controller.listar(Cliente.class)){
//                System.out.println("Cpf" + a.getCpf());
//            }
            Conexao.close();
            System.out.println("Conexao Fechada");
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
