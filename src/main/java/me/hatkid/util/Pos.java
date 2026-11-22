package me.hatkid.util;

public record Pos(int x, int y) {

  public Pos add(Pos another) {
    return new Pos(x + another.x, y + another.y);
  }

  public Pos sub(Pos another) {
    return new Pos(x - another.x, y - another.y);
  }

  public Pos mult(int factor) {
    return new Pos(x * factor, y * factor);
  }

}
