package services;

import java.sql.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import Model.Produit;

@WebService(serviceName="Connect")
public class Test {

	@WebMethod(operationName="chercher")
	public Produit chercher (@WebParam(name="nom") String nom){
		
		Produit p = new Produit();
		try  {
			String q="";
			ResultSet rs1;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection c1=DriverManager.getConnection("jdbc:mysql://localhost/kaedi","root","");
			Statement st =c1.createStatement();
			q="SELECT * FROM produit where designation='"+nom+"'";
			rs1=st.executeQuery(q);
			 if(rs1.next()) {
			p.setDesignation(rs1.getString("designation"));
			p.setId(rs1.getInt("idp"));
			p.setPrix(rs1.getDouble("prix"));
			p.setQuantite(rs1.getDouble("quantite"));
			p.setStatut(rs1.getString("statut"));
			 }
			 	
			} catch  (Exception e) {
			e.printStackTrace();
			}
		return p;

	}
	
	@WebMethod(operationName="verification")
	public String verification (@WebParam(name="nom") String nom,@WebParam(name="qantite") double qt) {
		String res="";
		try  {
			String q="";
			ResultSet rs1;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection c1=DriverManager.getConnection("jdbc:mysql://localhost/kaedi","root","");
			Statement st =c1.createStatement();
			q="SELECT quantite FROM produit where designation='"+nom+"'";
			rs1=st.executeQuery(q);
			 if(rs1.next()) {
			 if(rs1.getDouble("quantite") >= qt) {res="disponible";}
			 else {res="non disponible";}
			 }
			
			} catch  (Exception e) {
			e.printStackTrace();
			}
		return res;

	}

}
