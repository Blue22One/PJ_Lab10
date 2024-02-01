package Problema3;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

class MasinaMapper implements RowMapper<Masina> {
    public Masina mapRow(ResultSet rs, int rowNum) throws SQLException {
        Masina masina = new Masina();
        masina.setNr_inmatriculare(rs.getString("nr_inmatriculare"));
        masina.setMarca(rs.getString("marca"));
        masina.setAn_fab(rs.getInt("an_fab"));
        masina.setCuloare(rs.getString("culoare"));
        masina.setNr_KM(rs.getDouble("nr_KM"));
        return masina;
    }
}
