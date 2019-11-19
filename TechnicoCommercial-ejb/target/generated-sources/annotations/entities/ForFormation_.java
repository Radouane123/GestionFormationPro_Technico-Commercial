package entities;

import entities.FfFormateurFormation;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-11-19T14:21:06")
@StaticMetamodel(ForFormation.class)
public class ForFormation_ { 

    public static volatile SingularAttribute<ForFormation, String> intituleFor;
    public static volatile SingularAttribute<ForFormation, Integer> niveauFor;
    public static volatile SingularAttribute<ForFormation, Double> tarifFor;
    public static volatile SingularAttribute<ForFormation, Integer> capminFor;
    public static volatile SingularAttribute<ForFormation, String> descriptionFor;
    public static volatile SingularAttribute<ForFormation, Integer> capmaxFor;
    public static volatile SingularAttribute<ForFormation, String> idFor;
    public static volatile CollectionAttribute<ForFormation, FfFormateurFormation> ffFormateurFormationCollection;
    public static volatile SingularAttribute<ForFormation, String> dureeFor;

}