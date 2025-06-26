/**
 * Created By Arun Singh
 * Date:26-06-2025
 * Time:10:41
 * Project Name:SecurityWithJwt
 */

package com.nontech.SecurityWithJwt.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String contact;
    private String ownerUserName;
}
