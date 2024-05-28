/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icad2admin.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a.andissac
 */
public class HistoriqueDAO {
    
     private Connection connexion;

    public HistoriqueDAO() {
        this.connexion = MySQLConnection.getConnexion();
    }
    
    public void insert(Historique unHistorique) throws SQLException {
        String query = "INSERT INTO historique(ANCIEN_MAIL,ANCIEN_ADRESSE,ANCIEN_TEL,DATE_MODIF) values(?,?,?,?)";
        PreparedStatement ps = connexion.prepareStatement(query);

        ps.setString(1, unHistorique.getAncienEmail());
        ps.setString(2, unHistorique.getAncienAdresse());
        ps.setString(3, unHistorique.getAncienTel());
        ps.setString(4, unHistorique.getDateModif());
        

        ps.executeUpdate();

    }
    public List<Historique> getAllHisto() {

        List<Historique> historiques = new ArrayList<Historique>();
        String query = "SELECT * FROM historique";

        try {
            Statement statement = this.connexion.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                int idhisto = result.getInt("ID_HISTO");
                String ancienmail = result.getString("ANCIEN_EMAIL");
                String ancienadresse = result.getString("ANCIEN_ADRESSE");
                String ancientel = result.getString("ANCIEN_TEL");
                String datemodif = result.getString("DATE_MODIF");
                Historique historique = new Historique(idhisto, ancienmail, ancienadresse, ancientel, datemodif);
                historiques.add(historique);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historiques;
    }


}
