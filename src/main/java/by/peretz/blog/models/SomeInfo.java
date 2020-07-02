package by.peretz.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SomeInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String email, tel, name;

  private short age;

  private float happiness;

  private boolean hasCar;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public short getAge() {
    return age;
  }

  public void setAge(short age) {
    this.age = age;
  }

  public float getHappiness() {
    return happiness;
  }

  public void setHappiness(float happiness) {
    this.happiness = happiness;
  }

  public boolean isHasCar() {
    return hasCar;
  }

  public void setHasCar(boolean hasCar) {
    this.hasCar = hasCar;
  }
}
