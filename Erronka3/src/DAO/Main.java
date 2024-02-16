package DAO;

import Modelo.Bezeroa;
import Modelo.Zinema;

public class Main {

    public static void main(String[] args) {
        ZinemakDAO dao = new ZinemakDAO();
        Zinema[] zinemaList = dao.getAllZinemak();
        BezeroaDAO dao1 = new BezeroaDAO();
        Bezeroa[] bezeroList = dao1.getAllBezeroak();
        
        for (Zinema zinema : zinemaList) {
            System.out.println("zinema_id: " + zinema.getId_zine());
            System.out.println("Izena " + zinema.getIzena());
            System.out.println("email " + zinema.getHelbidea());
            // Aquí puedes imprimir los datos de Saioa y Areto si los tienes implementados
            System.out.println("-----------------------------");
        }
   
    }
}


//package DAO;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import Modelo.Areto;
//import Modelo.Saioa;
//import Modelo.Zinema;
//
//public class ZinemakDAO {
//    private KonexioaBD konexioaBD;
//
//    public ZinemakDAO() {
//        konexioaBD = new KonexioaBD();
//    }
//
//    public Zinema[] getAllZinemak() {
//        Zinema[] zinemaList = null;
//        int count = 0;
//
//        try (Connection con = konexioaBD.getConnection()) {
//            String countSql = "SELECT COUNT(*) AS total FROM ZINEMA";
//            try (PreparedStatement sta = con.prepareStatement(countSql)) {
//                try (ResultSet res = sta.executeQuery()) {
//                    if (res.next()) {
//                        count = res.getInt("total");
//                    }
//                }
//            }
//
//            zinemaList = new Zinema[count];
//
//            String kontsulta = "SELECT * FROM ZINEMA";
//            try (PreparedStatement pstmt = con.prepareStatement(kontsulta)) {
//                try (ResultSet rs = pstmt.executeQuery()) {
//                    int index = 0;
//                    while (rs.next()) {
//                        int id_zine = rs.getInt("zinema_id");
//                        String izena = rs.getString("izena");
//                        String helbidea = rs.getString("email");
//                        
//                        Saioa[] saioaList = getSaioaListForZinema(id_zine);
//                        Areto[] aretoList = getAretolistForZinema(id_zine);
//
//                        Zinema zinema = new Zinema(id_zine, izena, helbidea, saioaList, aretoList);
//
//                        zinemaList[index] = zinema;
//                        index++;
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            konexioaBD.desconectar();
//        }
//        return zinemaList;
//    }
//
//    private Saioa[] getSaioaListForZinema(int id_zine) {
//        Saioa[] saioaList = null;
//        try (Connection con = konexioaBD.getConnection()) {
//            String kontsulta = "SELECT * FROM SAIOA WHERE zinema_id = ?";
//            try (PreparedStatement pstmt = con.prepareStatement(kontsulta)) {
//                pstmt.setInt(1, id_zine);
//                try (ResultSet rs = pstmt.executeQuery()) {
//                    int count = 0;
//                    while (rs.next()) {
//                        count++;
//                    }
//                    saioaList = new Saioa[count];
//                    rs.beforeFirst();
//                    int index = 0;
//                    while (rs.next()) {
//                        // Obtener datos de la fila
//                        // Reemplaza estos valores ficticios con los nombres de las columnas en tu base de datos
//                        LocalDate ordua = rs.getDate("ordua").toLocalDate();
//                        LocalDate date = rs.getDate("date").toLocalDate();
//                        int filmaId = rs.getInt("filma_id");
//                        int aretoId = rs.getInt("areto_id");
//                        
//                        // Obtener los datos de Filma y Areto
//                        Filma filma = getFilmaById(filmaId);
//                        Areto areto = getAretoById(aretoId);
//
//                        // Crear instancia de Saioa
//                        Saioa saioa = new Saioa(ordua, date, filma, areto);
//                        saioaList[index] = saioa;
//                        index++;
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return saioaList;
//    }
//
//    private Areto[] getAretolistForZinema(int id_zine) {
//        // Implementa la lógica para obtener la lista de Areto para el zinema dado
//        // Puedes seguir un enfoque similar al método getSaioaListForZinema
//        return null;
//    }
//
//    // Define métodos para obtener los datos de Filma y Areto
//    private Filma getFilmaById(int filmaId) {
//        // Implementa la lógica para obtener los datos de Filma por su ID
//        return null;
//    }
//
//    private Areto getAretoById(int aretoId) {
//        // Implementa la lógica para obtener los datos de Areto por su ID
//        return null;
//    }
//}
