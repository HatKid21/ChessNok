package me.hatkid;

public record Pos(int x, int y) {

  Pos add(Pos another) {
    return new Pos(x + another.x, y + another.y);
  }

  Pos sub(Pos another) {
    return new Pos(x - another.x, y - another.y);
  }

}
