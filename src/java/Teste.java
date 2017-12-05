

import com.expoapp.entity.Bairro;
import com.expoapp.entity.Cidade;
import com.expoapp.entity.Cliente;
import com.expoapp.entity.Empresa;
import com.expoapp.entity.Estado;
import com.expoapp.entity.Usuario;
import domain.util.Conexao;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

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
    @Autowired
    private static SessionFactory sessionFactory;
    public static void main(String[] args) {
        Estado estado = new Estado();
        List<Bairro> bairros = new ArrayList<Bairro>();
        List<Cidade> cidades = new ArrayList<Cidade>();
        estado.setNome("Espirito Santo");
        estado.setSigla("ES");
        
        Cidade cidade = new Cidade();
        cidade.setEstado(estado);
        cidade.setNome("Serra");
        
        cidades.add(cidade);
        
        Bairro bairro = new Bairro();
        bairro.setNome("Jacaraipe");
        bairro.setCidade(cidade);
        
        bairros.add(bairro);
        
        estado.setCidades(cidades);
        cidade.setBairros(bairros);
        
        sessionFactory.getCurrentSession().save(estado);
        

        try{
            System.out.println("Iniciando...");
            List<Estado> estados = sessionFactory.getCurrentSession().createQuery("selece estado from Estado estado order by id").list();
            System.out.println("Conexao Fechada");
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
    }
}
