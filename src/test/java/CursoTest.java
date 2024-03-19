import dao.CursoDAO;
import dao.ICursoDAO;
import domain.Curso;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CursoTest {

    private ICursoDAO cursoDAO;

    public CursoTest(){
        cursoDAO = new CursoDAO();
    }

    @Test
    public void Cadastrar(){
        Curso curso = new Curso();
        curso.setCodigo("A1");
        curso.setNome("CURSO TEST");
        curso.setDescricao("domain.Curso de Java");
        cursoDAO.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
