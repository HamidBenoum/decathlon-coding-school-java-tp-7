import java.math.BigDecimal;

public class OperationCompte {

    void virement(Compte source, Compte destination, BigDecimal montant) throws SoldeInsuffisantException, ConflitDeCompteException {

        // test si le source = destination
        if (source.equals(destination)) {
            throw new ConflitDeCompteException();
        }


        if(source.getSolde().subtract(montant).compareTo(new BigDecimal(0))< 0) {
            throw new SoldeInsuffisantException();
        }

            System.out.println("virement possible");

            BigDecimal soldeSource = source.getSolde();
            BigDecimal soldeDest = destination.getSolde();

            // destination
            destination.setSolde(soldeDest.add(montant));
            // source
            source.setSolde(soldeSource.subtract(montant));

    }

}
