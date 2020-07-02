package by.peretz.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Tasks {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title, task, answer;

  private Date publish_date;

  private float hardness;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public Date getPublish_date() {
    return publish_date;
  }

  public void setPublish_date(Date publish_date) {
    this.publish_date = publish_date;
  }

  public float getHardness() {
    return hardness;
  }

  public void setHardness(float hardness) {
    this.hardness = hardness;
  }
}
