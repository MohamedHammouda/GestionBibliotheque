package com.shared.dao;
import java.util.List;
import com.shared.domaine.*;
public interface IDAOLivre {

	List<Livre> getLivres();
	Livre getLivreById(int idLivre);
	void addLivre(Livre livre);
}
