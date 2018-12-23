package ru.springboot.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * PHANTOMHUNTER
 * Документы Удостоверяющие Личность
 **/

@Entity
@Table(name = "DOCS")
public class Docs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long docsId;
    /*УдостоверениеЛичности */
    @Column(name = "DOCS_NAME",nullable = false)
    private String docsName;
    /*Номер Удостоверения Личности */
    @Column(name = "DOCS_CODE",length = 16,nullable = false)
    private Integer docsCode;

/*BEGIN. Сотрудники - Документы*/
    @ManyToMany(mappedBy = "documents")
    private Set<Employees> employees;

    public Set<Employees> getEmployees(){
        if (employees == null) {
            employees = new HashSet<>();
        }
        return employees;
    }
    public void setEmployees(Set<Employees> employees) {
        this.employees = employees;
    }
/*END. Сотрудники - Документы */






    /*Конструкторы*/
    public Docs (){
    }
    public Docs  (Long docsId,
                  String docsName,
                  Integer docsCode){
        this.docsId = docsId;
        this.docsName = docsName;
        this.docsCode = docsCode;
    }

    /*Гетеры и Сетеры*/
    public Long getDocsId() {
        return docsId;
    }
    public void setDocsName(String docsName) {
        this.docsName = docsName;
    }
    public void setDocsCode(Integer docsCode) {
        this.docsCode = docsCode;
    }
    public String getDocsName(){return docsName;}
    public Integer getDocsCode(){return docsCode;}


}
