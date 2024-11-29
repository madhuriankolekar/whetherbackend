package com.example.demo;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "portfolio")  // Specify table name if needed
public class Portfolio implements Serializable {

    public Portfolio() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")  // Specify the column name
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "portfolio_id", referencedColumnName = "id")  // Foreign key to `PIsgInfo`
    private List<PIsgInfo> isgInfo;
 
    // Constructor, getters, and setters
    public Portfolio(Long id, List<PIsgInfo> isgInfo) {
        this.id = id;
        this.isgInfo = isgInfo;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<PIsgInfo> getIsgInfo() {
		return isgInfo;
	}

	public void setIsgInfo(List<PIsgInfo> isgInfo) {
		this.isgInfo = isgInfo;
	}

    // Getters and setters
    // (omitted for brevity)

}
