package ma.cigma.pfe.models;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	
	@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private List<Facture> factures;
	
	@ManyToMany(cascade = {CascadeType.PERSIST})
	@JoinTable(name="my_join_table_client_promotion",
			joinColumns = @JoinColumn(name = "client_fk",referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn (name = "promotion_fk",referencedColumnName = "id"))
    private List<Promotion> promotions;
	
	@OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
	private CarteFidelio carteFidelio;
	
	public Client(String name) {
		this.name = name;
	}

	public Client(String name, List<Facture> factures) {
		super();
		this.name = name;
		this.factures = factures;
	}

}
