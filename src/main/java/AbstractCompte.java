import java.math.BigDecimal;

abstract class AbstractCompte implements Compte{

    private int numero;
    private String libele;
    private BigDecimal solde;
	private Client client;

    public AbstractCompte(Client client) {
    	this.client = client;
	}

	@Override
    public BigDecimal getSolde() {
        return solde;
    }

    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

/*	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractCompte other = (AbstractCompte) obj;
		if (numero != other.numero)
			return false;
		return true;
	}*/

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AbstractCompte that = (AbstractCompte) o;
		return numero == that.numero;
	}

}
