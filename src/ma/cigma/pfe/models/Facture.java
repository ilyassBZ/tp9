package ma.cigma.pfe.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private double amount;
	@Column
	private String description;
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	public Facture(double amount, String description, client client) {
		super();
		this.amount = amount;
		this.description = description;
		this.client = client;
	}
	
}
