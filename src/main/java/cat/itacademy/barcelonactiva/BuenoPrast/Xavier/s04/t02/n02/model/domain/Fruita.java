package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s04.t02.n02.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="fruites")

public class Fruita {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Nom")
	private String nom;
	
	@Column(name="Quantitat")
	private int quantitatQuilos;
	
	public Fruita() {
	}
	
	public Fruita(String nom, int quantitatQuilos ) {
		
		this.nom=nom;
		this.quantitatQuilos=quantitatQuilos;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNom() {
		
		return nom;
	}

	public int getQuantitatQuilos() {
		
		return quantitatQuilos;
	}
	
	public void setNom(String nom) {
		
		this.nom=nom;
	}
	
	public void setQuantitatQuilos(int quantitatQuilos) {
		
		this.quantitatQuilos=quantitatQuilos;
	}
}
