package CONTROLADOR;

import CONTROLADOR.AlumnoData;
import javaapplication59.Conexion;
//import Conectores.MateriaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javaapplication59.Conexion;
import MODELO.Alumno;
import MODELO.Cursada1;
import MODELO.Materia;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class CursadaData {

    private Connection connection = null;
    private Conexion conexion;

    public CursadaData(Conexion conexion) {
        try {
            this.conexion = conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

    public void guardarCursada(Cursada1 cursada) {
        try {

            String sql = "INSERT INTO cursada (idAlumno, idMateria, nota) VALUES ( ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, cursada.getIdAlumno());
            statement.setInt(2, cursada.getIdMateria());
            statement.setInt(3, cursada.getNota());

            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                cursada.setId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un alumno");
            }
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al guardar la cursada: " + ex.getMessage());
        }
    }

    public List<Cursada1> obtenerCursadas() {
        List<Cursada1> cursadas = new ArrayList<Cursada1>();

        try {
            String sql = "SELECT * FROM cursada;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Cursada1 cursada;
            while (resultSet.next()) {
                cursada = new Cursada1();
                cursada.setId(resultSet.getInt("id"));

                Alumno a = buscarAlumno(resultSet.getInt("idAlumno"));
                cursada.setAlumno(a);

                Materia m = buscarMateria(resultSet.getInt("idMateria"));
                cursada.setMateria(m);
                cursada.setNota(resultSet.getInt("nota"));

                cursadas.add(cursada);
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las materias cursadas: " + ex.getMessage());
        }

        return cursadas;
    }

    public List<Cursada1> obtenerCursadasXAlumno(int id) {
        List<Cursada1> cursadas = new ArrayList<Cursada1>();

        try {
            String sql = "SELECT * FROM cursada WHERE idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Cursada1 cursada;
            while (resultSet.next()) {
                cursada = new Cursada1();
                cursada.setId(resultSet.getInt("id"));

                Alumno a = buscarAlumno(resultSet.getInt("idAlumno"));
                cursada.setAlumno(a);

                Materia m = buscarMateria(resultSet.getInt("idMateria"));
                cursada.setMateria(m);
                cursada.setNota(resultSet.getInt("nota"));

                cursadas.add(cursada);
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las cursadas por alumno: " + ex.getMessage());
        }

        return cursadas;
    }

    public Alumno buscarAlumno(int id) {

        AlumnoData ad = new AlumnoData(conexion);

        return ad.buscarAlumno(id);

    }

    public Materia buscarMateria(int id) {

        MateriaData md = new MateriaData(conexion);
        return md.buscarMateria(id);

    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();

        try {
            String sql = "SELECT idMateria, nombre FROM cursada, materia WHERE cursada.idMateria = materia.id\n"
                    + "and cursada.idAlumno = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while (resultSet.next()) {
                materia = new Materia();
                materia.setId(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las materias cursadas: " + ex.getMessage());
        }

        return materias;

    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();

        try {
            String sql = "Select * from materia where id not in "
                    + "(select idMateria from cursada where idAlumno =?);";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while (resultSet.next()) {
                materia = new Materia();
                materia.setId(resultSet.getInt("id"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
            }
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las materias no cursadas: " + ex.getMessage());
        }

        return materias;

    }

    public void borrarCursadaDeUnaMateriaDeunAlumno(int idAlumno, int idMateria) {

        try {

            String sql = "DELETE FROM cursada WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, idAlumno);
            statement.setInt(2, idMateria);

            statement.executeUpdate();

            statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al borar la cursada del alumno: " + ex.getMessage());
        }

    }

    public void actualizarNotaCursada(int idAlumno, int idMateria, int nota) {

        try {

            String sql = "UPDATE cursada SET nota = ? WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, nota);
            statement.setInt(2, idAlumno);
            statement.setInt(3, idMateria);

            statement.executeUpdate();

            statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al actualizar la nota: " + ex.getMessage());
        }

    }

    public void borrarCursada(int id) {

        String sql = "DELETE FROM cursada WHERE id=?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, id);

            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(CursadaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cursada1 buscarCursada(int id) {
        Cursada1 cursada = null;
        String sql = "SELECT * FROM cursada WHERE id=?;";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cursada = new Cursada1();
                cursada.setId(rs.getInt("id"));
                cursada.setIdAlumno(rs.getInt("id_Alumno"));
                cursada.setIdMateria(rs.getInt("id_Materia"));
                cursada.setNota(rs.getInt("nota"));

            }
            ps.close();

        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
        return cursada;
    }

}
