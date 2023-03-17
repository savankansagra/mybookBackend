package com.mybook.models;

import java.util.List;

import org.springframework.aot.generate.GeneratedTypeReference;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "expert")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Expert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany
	@Column(name="all_tasks")
	private List<TaskType> allTasks;
	
	
	
}
