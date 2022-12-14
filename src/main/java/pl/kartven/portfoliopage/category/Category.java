package pl.kartven.portfoliopage.category;

import pl.kartven.portfoliopage.link.Link;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Link> listOfLink = new ArrayList<>();

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Link> getListOfLink() {
        return listOfLink;
    }

    public void setListOfLink(List<Link> listOfLink) {
        this.listOfLink = listOfLink;
    }

    public void addLink(Link link){
        listOfLink.add(link);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", listOfLink=" + listOfLink +
                '}';
    }
}
