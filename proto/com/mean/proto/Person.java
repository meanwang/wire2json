// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\company.proto
package com.mean.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.INT64;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class Person extends Message {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_SEX = 0;
  public static final Integer DEFAULT_AGE = 0;
  public static final String DEFAULT_NAME = "";
  public static final Long DEFAULT_SALARY = 0L;
  public static final String DEFAULT_TITLE = "";

  @ProtoField(tag = 1, type = INT32, label = REQUIRED)
  public final Integer sex;

  @ProtoField(tag = 2, type = INT32, label = REQUIRED)
  public final Integer age;

  @ProtoField(tag = 3, type = STRING, label = REQUIRED)
  public final String name;

  @ProtoField(tag = 4, type = INT64, label = REQUIRED)
  public final Long salary;

  @ProtoField(tag = 5, type = STRING)
  public final String title;

  public Person(Integer sex, Integer age, String name, Long salary, String title) {
    this.sex = sex;
    this.age = age;
    this.name = name;
    this.salary = salary;
    this.title = title;
  }

  private Person(Builder builder) {
    this(builder.sex, builder.age, builder.name, builder.salary, builder.title);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Person)) return false;
    Person o = (Person) other;
    return equals(sex, o.sex)
        && equals(age, o.age)
        && equals(name, o.name)
        && equals(salary, o.salary)
        && equals(title, o.title);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = sex != null ? sex.hashCode() : 0;
      result = result * 37 + (age != null ? age.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (salary != null ? salary.hashCode() : 0);
      result = result * 37 + (title != null ? title.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Person> {

    public Integer sex;
    public Integer age;
    public String name;
    public Long salary;
    public String title;

    public Builder() {
    }

    public Builder(Person message) {
      super(message);
      if (message == null) return;
      this.sex = message.sex;
      this.age = message.age;
      this.name = message.name;
      this.salary = message.salary;
      this.title = message.title;
    }

    public Builder sex(Integer sex) {
      this.sex = sex;
      return this;
    }

    public Builder age(Integer age) {
      this.age = age;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder salary(Long salary) {
      this.salary = salary;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    @Override
    public Person build() {
      checkRequiredFields();
      return new Person(this);
    }
  }
}
