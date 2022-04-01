package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;


import javax.swing.JOptionPane;

import DTO.SolucaoDTO;


public class SolucaoDAO {
	 
	  Connection conn;
	  PreparedStatement pstm;
	  
	  
	public void cadastrarmodulo(SolucaoDTO objSolucaoDTO) {
	
	
	String sql = "inserir into Solucao(nm_solucao) valeus (?)";
	conn= new ConexaoDAO().conectaBD();
	

	 try {
		 
		pstm= conn.prepareStatement(sql);
	    pstm.setString(1,objSolucaoDTO.getNomeSolucao());
		 
		pstm.execute();
		pstm.close();
		 
	  }catch (Exception erro) {
			 JOptionPane.showMessageDialog(null,"SolucaoDAO" + erro);
		 }
	}
}
