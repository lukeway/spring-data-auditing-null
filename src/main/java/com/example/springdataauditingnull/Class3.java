package com.example.springdataauditingnull;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Class3 {
	@Id
	private String id;
	
	@CreatedDate
	private Date createdDate;
}
