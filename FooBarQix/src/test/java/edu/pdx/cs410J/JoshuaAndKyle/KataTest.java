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
  void compute3(){
    assertThat(this.kata.compute("3"), equalTo("FooFoo"));
  }

  @Test
  void compute5(){
    assertThat(this.kata.compute("5"), equalTo("BarBar"));
  }

}
