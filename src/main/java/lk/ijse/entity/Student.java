package lk.ijse.entity;

import jakarta.persistence.*;
import lk.ijse.embeded.Fullname;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.lang.model.element.Name;

@Entity // mekedi default watenw table name ek class name ekama
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table (name = "Student_Table") // apita class eke name eken ntuw table ek hdagannawanam
@DynamicUpdate
/*DynamicUpdate eken wenne normally api table eke values update krddi hama column ekema values
* wenas wenawa ........... api me annotation ek use kran krama apita puluwan apita awashya column ek witrak update krnn
* eeken program eke speed ek tyenw therumak ntuw eka value ekk change krnn oni ekata
* mulu column okkogema values change weddi eekta time ekk add wenwa*/
public class Student {
    @Id // api primary key ek pennanna oni table ek hdaddima
//    @GeneratedValue (Strategy = GenerationType.IDENTITY) identity dammama api normal widihata id ek wens krnn oni
//    @GeneratedValue (Strategy = GenerationType.AUTO) auto dammama e id eka auto increment wenawa
//    @Column (name = "ID" , nullable = false) meken dammama propety name eken ntuw column name ek wtenne dana name eken
//    nullable false krma wenne notnull wena ek column eka
    private int id;

    private Fullname name;
    private String address;


}
