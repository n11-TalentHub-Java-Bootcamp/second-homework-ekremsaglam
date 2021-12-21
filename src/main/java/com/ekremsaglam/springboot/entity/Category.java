package com.ekremsaglam.springboot.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * id
 * name
 * branch
 * parentCategoryId
 */
@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {

    public Category() {
    }

    public Category(Long id, String name, Long branch, Category parentCategory) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.parentCategory = parentCategory;
    }

    @SequenceGenerator(name = "generator", sequenceName = "CATEGORY_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "BRANCH")
    private Long branch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PARENT_CATEGORY")
    private Category parentCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBranch() {
        return branch;
    }

    public void setBranch(Long branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return id == null ? "" : id.toString();
    }
}
