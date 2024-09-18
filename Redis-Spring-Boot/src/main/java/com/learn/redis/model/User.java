package com.learn.redis.model;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable {

    /**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String userId;
    private String name;
    private String phone;
    private String email;

}