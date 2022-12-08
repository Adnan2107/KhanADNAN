package hiberstudent.studententities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Student_details")
public class student {
@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(length = 50)
private String name;
@Column(length = 10,unique = true)
private String contact;


}
