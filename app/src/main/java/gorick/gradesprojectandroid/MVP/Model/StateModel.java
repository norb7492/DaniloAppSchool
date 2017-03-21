package gorick.gradesprojectandroid.MVP.Model;

/**
 * Created by sg-0036936 on 15/03/2017.
 */

public enum StateModel {

        ACRE("AC"), ALAGOAS("AL"), AMAPA("AP"),AMAZONAS("AM"), BAHIA("BA"), CEARA("CE"), DISTRITO_FEDERAL("DF"), ESPIRITO_SANTO("ES"), GOIAS("GO"), MACAPA("MA"),
        MATO_GROSSO("MT"), MATO_GROSSO_DO_SUL("MS"), MINAS_GERAIS("MG"), PARANA("PA"), PARAIBA("PB"), PARA("PR"), PERNAMBUCO("PE"),	PIAUI("PI"),
        RIO_DE_JANEIRO("RJ"), RIO_GRANDE_DO_NORTE("RN"), RIO_GRANDE_DO_SUL("RS"), RONDONIA("RO"), RORAIMA("RR"), SANTA_CATARINA("SC"), SÃO_PAULO("SP"),
        SERGIPE("SE"), TOCANTIS("TO");

    private final String STATE;

    StateModel(String i) {
        this.STATE = i;
    }

    public String getState(){
        return STATE;
    }
}