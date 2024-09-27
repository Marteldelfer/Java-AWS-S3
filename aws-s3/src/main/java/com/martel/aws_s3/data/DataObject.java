package com.martel.aws_s3.data;

import org.hibernate.validator.constraints.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
@AllArgsConstructor
@Builder
public class DataObject {
    
    @Id
    private UUID id;
    private String imageUrl;
    private String description;

}
