package Problema3;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
class BD {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void insert(String nr, String m, int an, String c, double km)
    {
        String SQL = "insert into masini (nr_inmatriculare, marca, an_fab, culoare, nr_KM) " +
                "values (?, ?, ?, ?, ?)";
        jdbcTemplateObject.update(SQL,nr,m,an,c,km);
    }

    public void delete(String nr){
        String SQL = "delete from masini where nr_inmatriculare = ?";
        jdbcTemplateObject.update(SQL, nr);
    }
    public Masina getMasina(String nr) {
        String SQL = "select * from masini where nr_inmatriculare = ?";
        Masina masina = jdbcTemplateObject.queryForObject(SQL, new Object[]{nr}, new MasinaMapper());
        return masina;
    }
    public List<Masina> getListaMasini() {
        String SQL = "select * from masini";
        List <Masina> masini = jdbcTemplateObject.query(SQL, new MasinaMapper());
        return masini;
    }

    public int getNrCuMarca(String m)
    {
        String SQL = "select COUNT(*) from masini WHERE marca = ?";
        return jdbcTemplateObject.queryForObject(SQL, Integer.class, m);
    }
}
