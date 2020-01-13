package com.buzzlers.labs.micro.jee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class User {
    private Long id;
    private String name;
}
