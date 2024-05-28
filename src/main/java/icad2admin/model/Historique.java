/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icad2admin.model;

/**
 *
 * @author a.andissac
 */
public class Historique {
    private int idhisto;
    private String ancienmail;
    private String ancienadresse;
    private String ancientel;
    private String datemodif;
    

    public Historique(int idhisto, String ancienemail, String ancienadresse,String ancientel, String datemodif) {
        this.idhisto = idhisto;
        this.ancienmail = ancienmail;
        this.ancienadresse = ancienadresse;
        this.ancientel = ancientel;
        this.datemodif = datemodif;
       
    }
    
    public Historique(String ancienemail, String ancienadresse,String ancientel, String datemodif) {
        this.idhisto = idhisto;
        this.ancienmail = ancienmail;
        this.ancienadresse = ancienadresse;
        this.ancientel = ancientel;
        this.datemodif = datemodif;
       
    }

    public int getId() {
        return idhisto;
    }

    public void setId(int id) {
        this.idhisto = id;
    }

    public String getAncienEmail() {
        return ancienmail;
    }

    public void setAncienEmail(String ancienmail) {
        this.ancienmail = ancienmail;
    }

    public String getAncienAdresse() {
        return ancienadresse;
    }

    public void setAncienAdresse(String ancienadresse) {
        this.ancienadresse = ancienadresse;
    }
    
    public String getAncienTel() {
        return ancientel;
    }
    
    public void setAncienTel(String ancientel) {
        this.ancientel = ancientel;
    }
    
    public String getDateModif() {
        return datemodif;
    }
    
    public void setDateModif(String datemodif) {
        this.datemodif = datemodif;
    }
    
}
