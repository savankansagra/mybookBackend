package com.mybook.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "task_type")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long taskId;
	
	@Column
	private String taskName;
	
	@Column
	private Integer deadline;
	
	@Column
	private Integer requiredTime;

}
