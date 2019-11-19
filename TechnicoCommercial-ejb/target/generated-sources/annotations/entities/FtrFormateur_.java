package entities;

import entities.FfFormateurFormation;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-19T14:21:06")
@StaticMetamodel(FtrFormateur.class)
public class FtrFormateur_ { 

    public static volatile SingularAttribute<FtrFormateur, Date> datenFtr;
    public static volatile SingularAttribute<FtrFormateur, String> prenomFtr;
    public static volatile SingularAttribute<FtrFormateur, String> enseignementFtr;
    public static volatile SingularAttribute<FtrFormateur, String> nomFtr;
    public static volatile CollectionAttribute<FtrFormateur, FfFormateurFormation> ffFormateurFormationCollection;
    public static volatile SingularAttribute<FtrFormateur, String> idFtr;

}