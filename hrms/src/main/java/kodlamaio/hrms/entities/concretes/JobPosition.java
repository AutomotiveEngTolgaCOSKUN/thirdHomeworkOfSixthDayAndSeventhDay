package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "add_general_job_title_names")
@Data
public class JobPosition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "position_name")
	private String positionName;

	public JobPosition() {

	}

	public JobPosition(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}

}
