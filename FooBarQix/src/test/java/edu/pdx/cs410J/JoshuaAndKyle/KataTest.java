package edu.pdx.cs410J.JoshuaAndKyle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{
  private Kata kata;

  @BeforeEach
  void setUp(){
    kata = new Kata();
  }


  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void compute1(){
    assertThat(this.kata.compute("1"), equalTo("1"));
  }

  @Test
  void compute2(){
    assertThat(this.kata.compute("2"), equalTo("2"));
  }

  @Test
  void compute3(){
    assertThat(this.kata.compute("3"), equalTo("FooFoo"));
  }

  @Test
  void compute4() {
    assertThat(this.kata.compute("4"), equalTo("4"));
  }

  @Test
  void compute5(){
    assertThat(this.kata.compute("5"), equalTo("BarBar"));
  }

  @Test
  void compute6() {
    assertThat(this.kata.compute("6"), equalTo("Foo"));
  }

  @Test
  void compute9() {
    assertThat(this.kata.compute("9"), equalTo("Foo"));
  }

  @Test
  void compute10() {
    assertThat(this.kata.compute("10"), equalTo("Bar"));
  }

  @Test
  void compute13() {
    assertThat(this.kata.compute("13"), equalTo("Foo"));
  }

  @Test
  void compute15() {
    assertThat(this.kata.compute("15"), equalTo("FooBarBar"));
  }

  @Test
  void compute33() {
    assertThat(this.kata.compute("33"), equalTo("FooFooFoo"));
  }

  @Test
  void compute51() {
    assertThat(this.kata.compute("51"), equalTo("FooBar"));
  }

  @Test
  void compute53() {
    assertThat(this.kata.compute("53"), equalTo("BarFoo"));
  }

  @Test
  void compute7() {
    assertThat(this.kata.compute("7"), equalTo("QixQix"));
  }

  @Test
  void compute21() {
    assertThat(this.kata.compute("21"), equalTo("FooQix"));
  }

}
